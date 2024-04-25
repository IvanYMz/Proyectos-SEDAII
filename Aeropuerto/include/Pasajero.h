#ifndef PASAJERO_H
#define PASAJERO_H
#include <iostream>
using namespace std;

class Pasajero
{
    public:
    Pasajero();

    void setNombre(const string& valor);
    string getNombre() const;

    void setDestino(const string& valor);
    string getDestino() const;

    void setID(const string& valor);
    string getID() const;

    void setFecha(const string& valor);
    string getFecha() const;

    void setNumBol(const string& valor);
    string getNumBol() const;

    private:
        string nombre;
        string destino;
        string ID;
        string Fecha;
        string NumBol;
};

#endif // PASAJERO_H
