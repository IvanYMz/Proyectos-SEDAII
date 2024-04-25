#ifndef COL_H
#define COL_H
#include <iostream>
#include <cstdlib>
#include "Pasajero.h"

using namespace std;

class Col
{
    public:
        Col();
        void encolar(Pasajero);
        void desencolar();
        void mostrarC(int);
    private:
        int fin;
        Pasajero pasajeros[15];
};

#endif // NODO_H
