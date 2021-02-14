/*
 * Copyright (c) 2021 Chirag Patel
**/

#include <iostream>
#include <string>
#include <sstream>
#include <cstring>

using namespace std;

const int ENTRY_NAAM_KUL_AKSHAR = 128;
const int ENTRY_NONDH_KUL_AKSHAR = 128;
const bool ENTRY_JAMAA = true;
const bool ENTRY_UDHAAR = false;
const int KUL_ENTRY = 500;

// ek entry mate joiti mahiti
struct Entry
{
    // entry karti vela no samay
    unsigned short varsh;
    unsigned short mahino;

    unsigned short divas;
    unsigned short kalak;

    unsigned short minute;
    unsigned short second;

    // kona mate aa levad-devad thai
    char naam[ENTRY_NAAM_KUL_AKSHAR];

    // rakam
    float rakam;

    // jama chhe ke udhar
    bool jamaa;// true - jamaa, false udhaar

    // entry mate nondh
    char nondh[ENTRY_NONDH_KUL_AKSHAR];
};

// mari aaj ni vadhu ma vadhu entry aavi shake
Entry gMariEntry[KUL_ENTRY] = {0};
int gEntryKram = 0;

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
    memset(&ekEntry, 0, sizeof(ekEntry));
    cout << "-- Entry na byte = " << sizeof(ekEntry) << endl;

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
    string jamaa;
    cin >> jamaa;
    if ((jamaa[0] == 'y') || (jamaa[0] == 'Y'))
        ekEntry.jamaa = ENTRY_JAMAA;
    else
        ekEntry.jamaa = ENTRY_UDHAAR;

    // upar cin ma string vapri chhe etle \n character emathi door
    // karvo pade chhe.
    cin.ignore();

    cout << "Entry jena maate kari enu naam : ";
    string naam;
    getline(cin, naam);
    strncpy(ekEntry.naam, naam.c_str(), ENTRY_NAAM_KUL_AKSHAR - 1);

    cout << "Koi vishesh nondh? : ";
    string nondh;
    getline(cin, nondh);
    strncpy(ekEntry.nondh, nondh.c_str(), ENTRY_NONDH_KUL_AKSHAR - 1);

    printEkEntry(ekEntry);
    memcpy(&gMariEntry[gEntryKram], &ekEntry, sizeof(ekEntry));
    ++gEntryKram;
    // ++gEntryKram ke gEntryKram++ ke gEntryKram = gEntryKRam + 1
    // ke gEntryKram += 1 ===> aa badha no arth/parinam ek sarkhu hoy
}

// ek entry na printing maate
void printEkEntry(Entry ekEntry)
{
    cout << "Me kareli entry --------------------" << endl;
    cout << gEntryKram + 1
        << " " << ekEntry.varsh
        << "/" << ekEntry.mahino
        << "/" << ekEntry.divas
        << " " << ekEntry.kalak
        << ":" << ekEntry.minute
        << ":" << ekEntry.second
        << " " << ekEntry.rakam
        << " " << ((ekEntry.jamaa == ENTRY_JAMAA) ? "+" : "-")
        << " " << ekEntry.naam
        << " " << ekEntry.nondh
        << endl;
    cout << "------------------------------------" << endl;
}
