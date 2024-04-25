#ifndef PILAA_H
#define PILAA_H
#include <iostream>
#include <cstdlib>
#include "Pasajero.h"

class Pilaa
{
    public:
        void apilar(Pasajero);
        void desapilar();
        void mostrarP(int);
    private:
        int top = 0;
        Pasajero Ppasajeros[15];
};

#endif // PILAA_H
