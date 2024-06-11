#ifndef _DF_H
#define _DF_H

typedef unsigned __int128 uint128;
typedef unsigned long long int uint64;

uint64 expm(uint64 m, uint64 e, uint64 n);
// calcule m^e modulo n

uint64 generateur(uint64 p);
// calcule un generateur de (Zp)*
// en supposant que p est un nombre premier 
// de Sophie Germain

#endif
