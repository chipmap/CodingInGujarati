/*
 * Copyright (c) 2021 Chirag Patel
**/

#include <iostream>
#include <string>

using namespace std;

void sahaay(void);

// prarambhik function
int main(int argc, char* argv[])
{
    sahaay();

    string naam = "";
    char sarnamu[80] {0};
    bool entryJamaa = true;
    float rakam = 0;

    cout << "have khata mate naam aapo : ";
    getline(cin, naam);
    cout << "tame aapelu naam - " << naam << " - maate nondh" << endl;

    cout << "sarnamu? : \n";
    int i = 0;
    char c;
    do
    {
        c = getchar();
        sarnamu[i] = c;
        i++;
    } while ((c!='\n') || (i < 10));

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

    return 0;
}

void sahaay(void)
{
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
    cout << "*\t maaru naamu" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
}
