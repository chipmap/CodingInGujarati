/*
 * Copyright (c) 2021 Chirag Patel
**/

#include <iostream>
#include <string>
#include <cstring>

using namespace std;

void sahaay(void);

// prarambhik function
int main(int argc, char* argv[])
{
    sahaay();

    string naam = "";
    char sarnamu[80] = {0};
    bool entryJamaa = true;
    float rakam = 0;

    // asthayi rupe shikhva mate j - prarambh

    const int KUL_SANKHYA = 20;
    int gun[KUL_SANKHYA] = {99, 80, 70};

    gun[14] = 90;
    gun[15] = 100;
    gun[18] = 35;

    cout << "-- kram -- gun --" << endl;
    for (int kram = 0; kram <= (KUL_SANKHYA - 1); ++kram)
    {
        cout << "  " << kram + 1 << "    " << gun[kram] << endl;
    }

    int* mara_gun = nullptr;
    mara_gun = &gun[14];
    *mara_gun = 92;
    ++mara_gun;
    cout << "mara gun = addr:" << mara_gun
            << " kimmat:" << *mara_gun
            << " -- gun[14] = " << gun[14] << endl;

    const int NAAM_AKSHAR = 16;
    char* maru_naam = new char[NAAM_AKSHAR];
    strcpy(maru_naam, "chirag");
    cout << "naam = \'" << maru_naam << "\' (" << &maru_naam << ")" << endl;
    delete[] maru_naam;

    int* test = new int;
    cout << "pahela test = " << test << " (" << &test << ")" << endl;
    *test = 500;
    cout << "pachhi test = " << *test << endl;
    delete test;

    // ant
/*
    cout << "have khata mate naam aapo : ";
    getline(cin, naam);
    cout << "tame aapelu naam - " << naam << " - maate nondh" << endl;

    cout << "sarnamu? : \n";
    /*int i = 0;
    char c;
    do
    {
        c = getchar();
        sarnamu[i] = c;
        i++;
    } while ((c != '\n') || (i < 80));
    *
    scanf("%79[^\n]", sarnamu);

    cout << "jama/udhar chayan karo [1-jama, 0-udhaar] : ";
    cin >> entryJamaa;

    cout << "rakam ? : ";
    cin >> rakam;

    cout << "-------------------------" << endl;
    cout << "Naam: " << naam << " (" << naam.length() << ")\n";
    cout << "Sarnamu: " << sarnamu << endl;
    cout << "ramat- " << sarnamu[0] << sarnamu[7] << endl;
    string prakar = (entryJamaa == true) ? "jamaa" : "udhaar";
    cout << "Prakar: " << prakar << endl;
    cout << "Rakam: Rs" << rakam << endl;
*/
    return 0;
}

void sahaay(void)
{
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
    cout << "*\t maaru naamu" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
}
