#include "Pilaa.h"

void Pilaa::apilar(Pasajero np)
{
    Ppasajeros[top]= np;
    top ++;
}

void Pilaa::mostrarP(int i)
{
    cout<<endl<<"Nombre:  "<<Ppasajeros[i].getNombre()<< " - "
              <<"Destino:  "<<Ppasajeros[i].getDestino()<<" - "
              <<"ID:  "<<Ppasajeros[i].getID()<<     " - "
              <<"Fecha:  "<<Ppasajeros[i].getFecha()<<  " - "
              <<"Boleto:  "<<Ppasajeros[i].getNumBol()<<endl;
}

void Pilaa::desapilar()
{
    Ppasajeros[top].setNombre("-");
    Ppasajeros[top].setDestino("-");
    Ppasajeros[top].setID("-");
    Ppasajeros[top].setFecha("-");
    Ppasajeros[top].setNumBol("-");
    top --;
}
