/*
 * Copyright (c) 2021 Chirag Patel
**/

#include <iostream>
#include <string>
#include <cstring>

using namespace std;

const int ENTRY_NAAM_KUL_AKSHAR = 128;
const int ENTRY_NONDH_KUL_AKSHAR = 128;
const bool ENTRY_JAMAA = true;
const bool ENTRY_UDHAAR = false;

// ek entry mate joiti mahiti
struct Entry
{
    // entry karti vela no samay
    unsigned short varsh;
    unsigned char mahino;
    unsigned char divas;
    unsigned char kalak;
    unsigned char minute;
    unsigned char second;
    // kona mate aa levad-devad thai
    //char naam[ENTRY_NAAM_KUL_AKSHAR];
    string naam;
    // rakam
    float rakam;
    // jama chhe ke udhar
    bool jamaa;// true - jamaa, false udhaar
    // entry mate nondh
    //char nondh[ENTRY_NONDH_KUL_AKSHAR];
    string nondh;
};

void sahaay(void);
void entryNaakho(void);
void ekEntryNaakho(void);
void printEkEntry(Entry ekEntry);

// prarambhik function
int main(int argc, char* argv[])
{
    sahaay();
    entryNaakho();
    return 0;
}

// karyakram ange vapraashkartaa ne janaavo
void sahaay(void)
{
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
    cout << "*\t maaru naamu" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
}

// vaprashkarta pase thi entry ni mahiti lo
void entryNaakho(void)
{
    char aavjo = 'n';

    do
    {
        ekEntryNaakho();
        cout << "naamu bandh karva y nu chayan karo... ";
        cin >> aavjo;
        cout << endl;
    } while ((aavjo != 'y') && (aavjo != 'Y'));
}

void ekEntryNaakho(void)
{
    Entry ekEntry;

    cout << "Entry maate nu varsh : ";
    cin >> ekEntry.varsh;
    cout << "Entry maate no mahino : ";
    cin >> ekEntry.mahino;
    cout << "Entry maate no divas : ";
    cin >> ekEntry.divas;
    cout << "Entry maate no samay [kalaak] : ";
    cin >> ekEntry.kalak;
    cout << "Entry maate no samay [minute] : ";
    cin >> ekEntry.minute;
    cout << "Entry maate no samay [second] : ";
    cin >> ekEntry.second;

    cout << "Levad devad thayeli rakam : ";
    cin >> ekEntry.rakam;
    cout << "Jamaa mate \'y\' ke \'Y\' athvaa udhaar ganaashe : ";
    char jamaa;
    cin >> jamaa;
    if ((jamaa == 'y') || (jamaa = 'Y'))
        ekEntry.jamaa = ENTRY_JAMAA;
    else
        ekEntry.jamaa = ENTRY_UDHAAR;

    cout << "Entry kona maate kari enu naam : ";
    cin >> ekEntry.naam;
    cout << "Koi vishesh nondh? : ";
    cin >> ekEntry.nondh;

    printEkEntry(ekEntry);
}

// ek entry na printing maate
void printEkEntry(Entry ekEntry)
{
    cout << "Me kareli entry --------------------" << endl;
    cout << ekEntry.varsh << "/" << ekEntry.mahino << "/"
        << ekEntry.divas << " "
        << ekEntry.kalak << ":" << ekEntry.minute << ":"
        << ekEntry.second
        << " " << ekEntry.rakam
        << " " << ((ekEntry.jamaa == ENTRY_JAMAA) ? "jamaa" : "udhaar")
        << " " << ekEntry.naam << " " << ekEntry.nondh
        << endl;
}
