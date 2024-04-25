#include "Col.h"

Col::Col()
{
    fin = 0;
    for(int i = 0; i < 7; i++)
    {
        pasajeros[i].setNombre("-");
        pasajeros[i].setDestino("-");
        pasajeros[i].setID("-");
        pasajeros[i].setFecha("-");
        pasajeros[i].setNumBol("-");
    }
}


void Col::encolar(Pasajero pa)
{
    pasajeros[fin] = pa;
    fin++;
}

void Col::desencolar()
{
    for (int i = 0; i <= fin; i++){
        pasajeros[i] = pasajeros[i+1];
    }
    pasajeros[fin].setNombre("-");
    pasajeros[fin].setDestino("-");
    pasajeros[fin].setID("-");
    pasajeros[fin].setFecha("-");
    pasajeros[fin].setNumBol("-");
    fin--;
}

void Col::mostrarC(int i)
{
    cout<<endl<<"Nombre:      "<<pasajeros[i].getNombre()<<endl
         <<"Destino:     "<<pasajeros[i].getDestino()<<endl
         <<"ID:          "<<pasajeros[i].getID()<<endl
         <<"Fecha:       "<<pasajeros[i].getFecha()<<endl
         <<"Boleto:      "<<pasajeros[i].getNumBol()<<endl;
}

