#ifndef _TEA_H
#define _TEA_H
#include <stdint.h>
void  encrypt_tea (uint32_t* v, uint32_t* k);
void  decrypt_tea (uint32_t* v, uint32_t* k);
uint64_t hash_block_tea(char b[24]);
#endif

