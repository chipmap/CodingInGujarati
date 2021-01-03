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

    cout << "have khata mate naam aapo : ";
    getline(cin, naam);
    cout << "tame aapelu naam - " << naam << " - maate nondh" << endl;
    cout << "kul akshar = " << naam.length() << endl;
    cout << "biji rite akshar sankhya = " << naam.size() << endl;

    cout << "thodik ramat " << "Shriman " + naam + " ji" << endl;

    return 0;
}

void sahaay(void)
{
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
    cout << "*\t maaru naamu" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * *\n";
}
