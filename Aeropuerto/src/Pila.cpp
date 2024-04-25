#include "Pila.h"

void Pila::apilar(Pasajero np)
{
    top ++;
    Ppasajeros[top]= np;
}

void Pila::mostrarP(int i)
{
    cout<<endl<<"Nombre:    "<<Ppasajeros[i].getNombre()<<"  "
         <<"Destino:   "<<Ppasajeros[i].getDestino()<<"  "
         <<"ID:        "<<Ppasajeros[i].getID()<<"  "
         <<"Fecha:     "<<Ppasajeros[i].getFecha()<<"  "
         <<"Boleto:    "<<Ppasajeros[i].getNumBol()<<"  ";
}
