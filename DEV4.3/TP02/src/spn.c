#include "spn.h"
#include <stdio.h>

unsigned char perm[8]={5,2,0,4,6,1,7,3};
unsigned char subst[16]={14,3,2,10,12,11,15,9,0,4,7,13,1,8,6,5};

unsigned char do_perm(unsigned char w, unsigned char perm[8])
{
    unsigned char res = 0;
    for (size_t i = 0; i < 8; i++)
    {
        if (w & (1<<i)) {
            res |= 1<<perm[i];
        }  
    }
    return res;
}

unsigned char do_subst(unsigned char w, unsigned char subst[16])
{
    unsigned char temp =subst[w >> 4]<<4;
    unsigned char a = subst[0x0f & w];
    return temp | a;
}

unsigned char encrypt(unsigned char w, unsigned short key, unsigned char perm[8], unsigned char subst[16])
{
    unsigned short temp_key = key & 0x00ff;
    unsigned char cipher_text = 0;
    for (size_t i = 0; i < 2; i++)
    {
        w ^= temp_key;
        w = do_subst(w, subst);
        w = do_perm(w,perm);
        temp_key = key>>8;
    }
    return w;
}

unsigned char decrypt(unsigned char w, unsigned short key, unsigned char perm[8], unsigned char subst[16])
{
    unsigned short temp_key = key >> 8;
    unsigned char decipher_text = 0;
    for (size_t i = 0; i < 2; i++)
    {
        w = do_perm(w, perm);
        w = do_subst(w, subst);
        w ^= temp_key;
        temp_key = key & 0xff;
    }
    return w;
}

unsigned char calc_perm_inv(unsigned char perm[8]) {
    unsigned char perm_inv[8];

    for (size_t i = 0; i < 8; i++) {
        perm_inv[perm[i]] = i;
    }
    
    return perm_inv;
}

unsigned char calc_subst_inv(unsigned char subst[16]){
    unsigned char subst_inv[16];
    for (size_t i = 0; i < 8; i++)
    {
        subst_inv[subst[i]] = i;
    }
    return subst_inv;
}


int main(int argc, char const *argv[])
{

    do_subst(argv[1], subst);
    return 0;
}
