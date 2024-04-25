#ifndef GRUPPAS_H
#define GRUPPAS_H
#include "Pasajero.h"

class GrupPas
{
    public:
        GrupPas();
        void Agregar();
        void mostrar();
        void cons(const Pasajero &p) const;
    private:
        static const int MAX = 40;
        Pasajero pasajeros[MAX];
        int contador;
};

#endif // GRUPPAS_H
