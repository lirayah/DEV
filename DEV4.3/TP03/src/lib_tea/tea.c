#include "tea.h"
#include<string.h>
#define TOUR 32

void encrypt_tea (uint32_t * v, uint32_t* k) 
{
	uint32_t v0=v[0], v1=v[1], sum=0, i;           /* initialisation */
	uint32_t delta=0x9e3779b9;                     /* constantes de clef */
	uint32_t k0=k[0], k1=k[1], k2=k[2], k3=k[3];   /* mise en cache de la clef */
	for (i=0; i < TOUR; i++) {                       /* boucle principale */
		sum += delta;
		v0 += ((v1<<4) + k0) ^ (v1 + sum) ^ ((v1>>5) + k1);
		v1 += ((v0<<4) + k2) ^ (v0 + sum) ^ ((v0>>5) + k3);
	}
	v[0]=v0; v[1]=v1;
}

void decrypt_tea (uint32_t* v, uint32_t* k) 
{
	uint32_t v0=v[0], v1=v[1], sum=0xC6EF3720, i;  /* initialisation */
	uint32_t delta=0x9e3779b9;                     /* constantes de clefs */
	uint32_t k0=k[0], k1=k[1], k2=k[2], k3=k[3];   /* mise en cache de la clef */
	for (i=0; i<TOUR; i++) {                         /* boucle principale */
		v1 -= ((v0<<4) + k2) ^ (v0 + sum) ^ ((v0>>5) + k3);
		v0 -= ((v1<<4) + k0) ^ (v1 + sum) ^ ((v1>>5) + k1);
		sum -= delta;
	}
	v[0]=v0; v[1]=v1;
}

uint64_t hash_block_tea(char b[24])
{
	uint32_t v[2];
	uint32_t k[4];
	memcpy(v,b,2*sizeof(uint32_t));
	memcpy(k,b+2*sizeof(uint32_t),4*sizeof(uint32_t));
	encrypt_tea(v,k);
	return ((uint64_t)v[0])<<32 | v[1];
}
