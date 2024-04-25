#include <iostream>
#include <windows.h>
#include "Col.h"
#include "Pilaa.h"
#include "Pasajero.h"

using namespace std;

void tickets();
void gotoxy(int,int);
void rev();
void abo();
void desabo();
void taxi();
Pasajero dat[7];
Col c;
Pilaa p;
int main()
{
    tickets();
    for(int i = 0; i < 7; i++)
    {
        c.encolar(dat[i]);
    }
    cout<<endl;
    rev();
    for(int i = 0; i < 7; i++)
    {
        p.apilar(dat[i]);
    }
    for(int i = 0; i < 7; i++)
    {
        p.mostrarP(i);
    }
    system("pause");
    system("cls");
    abo();
    desabo();
    taxi();
    return 0;
}

void gotoxy(int x, int y)
{
    HANDLE hcon;
    hcon = GetStdHandle(STD_OUTPUT_HANDLE);
    COORD dwPos;
    dwPos.X = x;
    dwPos.Y= y;
    SetConsoleCursorPosition(hcon,dwPos);
}

void taxi()
{
    int i = 0, j = 0;
    tickets();
    for(int x = 0; x < 7; x++)
    {
        p.apilar(dat[x]);
    }
    while (j != 7)
    {
        if (i == 0)
        {
            p.mostrarP(j);
            gotoxy(47, 10);cout<<char(174)<<"Taxi"<<char(175)<<endl;
            gotoxy(47, 11);cout<<char(201)<<char(205)<<char(205)<<char(205)<<char(205)<<char(187);
            gotoxy(50,12);cout<<char(229);
            gotoxy(52,12);cout<<char(186);
            gotoxy(47,12);cout<<char(186);
            gotoxy(46,13);cout<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205);
            gotoxy(45, 13);cout<<char(201);
            gotoxy(54, 13);cout<<char(187);
            gotoxy(46,14);cout<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205)<<char(205);
            gotoxy(45, 14);cout<<char(200);
            gotoxy(54, 14);cout<<char(188);
            gotoxy(47,15);cout<<"0";
            gotoxy(52,15);cout<<"0";
        }
        Sleep(50);
        gotoxy(i, 13);cout<<"    0"<<endl;
        gotoxy(i, 14);cout<<"   /|\\"<<endl;
        gotoxy(i, 15);cout<<"   / \\"<<endl;
        i++;
        if(i == 43 && j < 7)
        {
            i = 0;
            j++;
            if (j < 7)
            {
                system("cls");
            }
            else
            {
                system("pause");
                system("cls");
            }
        }
    }
}

void desabo()
{
    int i = 0, j = 0;
    while (j != 7)
    {
        if (i == 0)
        {
            p.desapilar();
            gotoxy(0, 4);cout<<char(186)<<"EXIT"<<char(186)<<endl;
        }
        Sleep(50);
        gotoxy(i, 7);cout<<"    0"<<endl;
        gotoxy(i, 8);cout<<"   /|\\"<<endl;
        gotoxy(i, 9);cout<<"   / \\"<<endl;
        i++;
        if(i == 10 && j < 7)
        {
            i = 0;
            j++;
            if (j < 7)
            {
                system("cls");
            }
            else
            {
                system("pause");
                system("cls");
            }
        }
    }
}

void abo()
{
    int i = 0, j = 0;
    while (j != 7)
    {
        if (i == 0)
        {
            cout<<endl<<"Abordando:";
            p.mostrarP(j);
            gotoxy(20, 10);cout<<char(186)<<"Abordaje"<<char(186)<<endl;
            gotoxy(22, 11);cout<<char(186)<<" "<<" "<<" "<<char(186)<<endl;
            gotoxy(22, 12);cout<<char(186)<<" "<<" "<<" "<<char(186)<<endl;
            gotoxy(22, 13);cout<<char(200)<<char(205)<<char(205)<<char(205)<<char(188);

        }
        Sleep(50);
        gotoxy(i, 11);cout<<"    0"<<endl;
        gotoxy(i, 12);cout<<"   /|\\"<<endl;
        gotoxy(i, 13);cout<<"   / \\"<<endl;
        i++;
        if(i == 18 && j < 7)
        {
            i = 0;
            j++;
            if (j < 7)
            {
                system("cls");
            }
            else
            {
                system("pause");
                system("cls");
            }
        }
    }
}

void rev()
{
    int i = 0, j = 0;
    while (j != 7)
    {
        if (i == 0)
        {
            cout<<endl<<"     Pasajero "<<j+1<<endl;
            c.mostrarC(j);
            gotoxy(48, 10);cout<<char(186)<<"RECEPCION"<<char(186)<<endl;
            gotoxy(50, 11);cout<<char(186)<<" "<<char(229)<<" "<<char(186)<<endl;
            gotoxy(50, 12);cout<<char(186)<<char(201)<<char(206)<<char(187)<<char(186)<<endl;
            gotoxy(50, 13);cout<<char(200)<<char(205)<<char(205)<<char(205)<<char(188);
        }
        Sleep(50);
        gotoxy(i, 11);cout<<"    0"<<endl;
        gotoxy(i, 12);cout<<"   /|\\"<<endl;
        gotoxy(i, 13);cout<<"   / \\"<<endl;
        i++;
        if(i == 45 && j < 7)
        {
            i = 0;
            j++;
            if (j < 7)
            {
                system("cls");
            }
            else
            {
                system("pause");
                system("cls");
            }
        }
    }
}


void tickets()
{
    dat[0].setNombre("Rodrigo");
    dat[0].setDestino("Venezuela");
    dat[0].setID("321");
    dat[0].setFecha("11/05/2021");
    dat[0].setNumBol("806");

    dat[1].setNombre("Joaquin");
    dat[1].setDestino("Francia");
    dat[1].setID("678");
    dat[1].setFecha("11/05/2021");
    dat[1].setNumBol("124");

    dat[2].setNombre("Lucy Sonido");
    dat[2].setDestino("Nicaragua");
    dat[2].setID("897");
    dat[2].setFecha("11/05/2021");
    dat[2].setNumBol("456");

    dat[3].setNombre("Don Pancho");
    dat[3].setDestino("España");
    dat[3].setID("093");
    dat[3].setFecha("11/05/2021");
    dat[3].setNumBol("021");

    dat[4].setNombre("Krina");
    dat[4].setDestino("Portugal");
    dat[4].setID("582");
    dat[4].setFecha("11/05/2021");
    dat[4].setNumBol("083");

    dat[5].setNombre("Carlos V");
    dat[5].setDestino("Gales");
    dat[5].setID("555");
    dat[5].setFecha("11/05/2021");
    dat[5].setNumBol("515");

    dat[6].setNombre("Moy Etes");
    dat[6].setDestino("Gudalajara");
    dat[6].setID("011");
    dat[6].setFecha("11/05/2021");
    dat[6].setNumBol("901");
}
