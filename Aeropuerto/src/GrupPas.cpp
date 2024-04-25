#include "GrupPas.h"

GrupPas::GrupPas()
{
    contador = 0;
}

void GrupPas::mostrar()
{
    for (int i = 0; i < contador; ++i)
    {
        cons(pasajeros[i]);
        cout <<"~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~" <<endl;
    }
}

void GrupPas::cons(const Pasajero &p) const
{
    cout <<"Nombre: " <<p.getNombre() <<endl
    <<"Destino: " <<p.getDestino() <<endl
    <<"ID: " <<p.getID() <<endl
    <<"Fecha: " <<p.getFecha() <<endl
    <<"N° De boleto: " <<p.getNumBol() <<endl;
}

void GrupPas::Agregar()
{
    Pasajero p;
    string nombre;
    string destino;
    string ID;
    string Fecha;
    string NumBol;

    cout <<"Nombre: ";
    getline(cin, nombre);
    p.setNombre(nombre);
    cout <<"Destino: ";
    getline(cin, destino);
    p.setDestino(destino);
    cout <<"ID: ";
    getline(cin, ID);
    p.setID(ID);
    cout <<"Fecha: ";
    getline(cin, Fecha);
    p.setFecha(Fecha);
    cout <<"N° De boleto: ";
    getline(cin, NumBol);
    p.setNumBol(NumBol);

    pasajeros[contador] = p;
    contador++;
}
