#ifndef PILA_H
#define PILA_H
#include <iostream>
#include <cstdlib>
#include "Pasajero.h"

class Pila
{
    public:
        Pila();
        void apilar(Pasajero);
        void desapilar();
        void mostrarP(int);
    private:
        int top;
        Pasajero Ppasajeros[15];
};

#endif // PILA_H
