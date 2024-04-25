#include "Pasajero.h"

Pasajero::Pasajero()
{
    nombre = "-";
    destino = "-";
    ID = "-";
    Fecha = "-";
    NumBol = "-";
}

void Pasajero::setNombre(const string &valor)
{
    nombre = valor;
}

string Pasajero::getNombre() const
{
    return nombre;
}

void Pasajero::setDestino(const string &valor)
{
    destino = valor;
}

string Pasajero::getDestino() const
{
    return destino;
}

void Pasajero::setID(const string &valor)
{
    ID = valor;
}

string Pasajero::getID() const
{
    return ID;
}

void Pasajero::setFecha(const string &valor)
{
    Fecha = valor;
}

string Pasajero::getFecha() const
{
    return Fecha;
}

void Pasajero::setNumBol(const string &valor)
{
    NumBol = valor;
}

string Pasajero::getNumBol() const
{
    return NumBol;
}

