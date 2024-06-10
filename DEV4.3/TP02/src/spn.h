#ifndef _SPN_H
#define _SPN_H

unsigned char do_perm(unsigned char w,unsigned char perm[8]);
unsigned char do_subst(unsigned char w,unsigned char subst[16]);

unsigned char encrypt(
	 unsigned char w,
	 unsigned short key,
	 unsigned char perm[8],
	 unsigned char subst[16]
);

unsigned char decrypt(
	 unsigned char w,
	 unsigned short key,
	 unsigned char perm[8],
	 unsigned char subst[16]
);

#endif