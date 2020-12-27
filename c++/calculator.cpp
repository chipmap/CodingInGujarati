/*
    Copyright (c) 2020 Chirag Patel

    aa calculator no program chhe.

    navo ferfar - chirag patel - 2020 december 27
*/

#include <iostream>
#include <cmath>
#include <bitset>

using namespace std;

// pi maate no achal/constant
const float PI = 3.141593;

// function ni suchanao/declaration
void suchana(void);
int ganatari(char pr, int r1, int r2);
float ganatari(char pr, float r1, float r2);

void prakarDefault(void);
void prakarProgrammer(void);
void prakarVaignanik(void);

// maru mukhy kary
int main()
{
    suchana();

    char aavjo = 'n';

    do
    {
        cout << "-------- navi ganatari ---------------------" << endl;
        cout << "calculator no prakaar nakki karo [d, p, s] : ";
        char prakar = 'd';
        cin >> prakar;

        switch (prakar)
        {
        case 'p':
            prakarProgrammer();
            break;

        case 's':
            prakarVaignanik();
            break;

        default:
            prakarDefault();
            break;
        }

        cout << "calculator bandh karva y nu chayan karo... ";
        cin >> aavjo;
    } while ((aavjo != 'y') && (aavjo != 'Y'));

    return 0;
}

// default ganatario
void prakarDefault(void)
{
    cout << "default calculator > > >" << endl;
    cout << "data-type chayan karo [i, f] : ";
    char dataType;
    cin >> dataType;

    if (dataType == 'i')
    {
        cout << "tamne yogy lage e rakam nakho\n";
        int rakam1;
        cin >> rakam1;

        cout << "have biji rakam nakho\n";
        int rakam2;
        cin >> rakam2;

        cout << "prakriya chunto [+,-,*,/] : ";
        char prakriya;
        cin >> prakriya;

        int uttar = ganatari(prakriya, rakam1, rakam2);
        cout << "uttar = ";
        cout << uttar;
        cout << "\n";
    }
    else if (dataType == 'f')
    {
        cout << "tamne yogy lage e rakam nakho\n";
        float rakam1;
        cin >> rakam1;

        cout << "have biji rakam nakho\n";
        float rakam2;
        cin >> rakam2;

        cout << "prakriya chunto [+,-,*,/] : ";
        char prakriya;
        cin >> prakriya;

        float uttar = ganatari(prakriya, rakam1, rakam2);
        cout << "uttar = ";
        cout << uttar;
        cout << "\n";
    }
    else
    {
        cout << "aa data-type khoto chhe\n";
    }
}

// hex, binary vagere
void prakarProgrammer(void)
{
    cout << "programmer calculator > > >" << endl;

    unsigned int rakam1;
    cout << "pratham mooly aapo : ";
    cin >> rakam1;
    unsigned int rakam2;
    cout << "biju mooly aapo : ";
    cin >> rakam2;

    cout << "\'o\'r \'a\'nd \'x\'or \'n\'ot xno\'r\' : ";
    // 'o'r 'a'nd 'x'or 'n'ot xno'r' :
    char vikalp;
    cin >> vikalp;

    // 45 => 0x2d => 0010 1101
    // 10 => 0x0a => 0000 1010
    // OR |       => 0010 1111 => 0x2f => 47
    //      0 0 = 0
    //      0 1 = 1
    //      1 0 = 1
    //      1 1 = 1
    // AND & (.)  => 0000 1000 => 0x08 => 8
    //      0 0 = 0
    //      0 1 = 0
    //      1 0 = 0
    //      1 1 = 1
    // NOT ~  ~45 => 1101 0010 => 0xd2 => 210
    // NOT ~  ~10 => 1111 0101 => 0xf5 => 245
    //      0 = 1
    //      1 = 0
    // XOR ^      => 0010 0111 => 0x27 => 39
    //      0 0 = 0
    //      0 1 = 1
    //      1 0 = 1
    //      1 1 = 0
    // XNOR ~^    => 1101 1000 => 0xd8 => 216
    //      0 0 = 1
    //      0 1 = 0
    //      1 0 = 0
    //      1 1 = 1

    cout << dec << "r1 = " << rakam1;
    cout << " (" << bitset<8>(rakam1) << ")";
    cout << " (0x" << hex << rakam1 << ") ";
    cout << dec << "r2 = " << rakam2;
    cout << " (" << bitset<8>(rakam2) << ")";
    cout << " (0x" << hex << rakam2 << ") " << endl;
    // r1 = 45 (00101101) (0x2d) r2 = 10 (00001010) (0xa)

    unsigned int uttar = 0;
    switch (vikalp)
    {
    case 'o':
    case 'O':
        uttar = rakam1 | rakam2;
        break;

    case 'a':
    case 'A':
        uttar = rakam1 & rakam2;
        break;

    case 'n':
    case 'N':
        cout << "NOT uttar rakam1 mate = ";
        cout << dec << ~rakam1;
        cout << " (" << bitset<8>(rakam1) << ")";
        cout << hex << ~rakam1 << endl;
        cout << "NOT uttar rakam2 mate = ";
        cout << dec << ~rakam2;
        cout << " (" << bitset<8>(rakam2) << ")";
        cout << hex << ~rakam2 << endl;
        break;

    case 'x':
    case 'X':
        uttar = rakam1 ^ rakam2;
        break;

    case 'r':
    case 'R':
        uttar = ~(rakam1 ^ rakam2);
        break;

    default:
        cout << "khoto vikalp chayan thayo chhe!!!\n";
        break;
    }

    cout << "uttar = " << dec << uttar;
    cout << " (" << bitset<8>(uttar) << ")";
    cout << " (0x" << hex << uttar << ")" << endl;
    // uttar = 8 (00001000) (0x8)
}

void vartul(void);
void chatushkon(void);
void sine(void);
void cosine(void);

// sin, cos, vartul, shanku
void prakarVaignanik(void)
{
    cout << "vaignanik calculator > > >" << endl;
    cout << "prakriya nakki karo :\n";
    cout << "\tvartul na kshetrafal maate v\n";
    cout << "\tchatushkon na kshetrafal maate c\n";
    cout << "\tsine ganva maate s\n";
    cout << "\tcosine ganva maate o\n";

    char prakriya;
    cin >> prakriya;

    switch (prakriya)
    {
    case 'v':
    case 'V':
        vartul();
        break;

    case 'c':
    case 'C':
        chatushkon();
        break;

    case 's':
    case 'S':
        sine();
        break;

    case 'o':
    case 'O':
        cosine();
        break;
    }
}

// helper
void suchana(void)
{
    cout << "aa calculator program mateni suchana" << endl;
    cout << "tamari rakam mate data-type nu chayan sahupratham karo\n";
    cout << "tamare sahu pratham be rakam apvani raheshe\n";
    cout << "pachhi prakriya chunto\n";
}

// int ganatari mate nu function
int ganatari(char pr, int r1, int r2)
{
    int uttar = 0;

    switch (pr)
    {
    case '+':
        cout << "tame chayan karel sarvalo\n";
        uttar = r1 + r2;
        break;

    case '-':
        cout << "tame chayan karel badbaki\n";
        uttar = r1 - r2;
        break;

    case '*':
        cout << "tame chayan karel gunakar\n";
        uttar = r1 * r2;
        break;

    case '/':
        cout << "tame chayan karel bhagakar\n";
        uttar = r1 / r2;
        break;

    default:
        cout << "tame chayan kareli prakriya khoti chhe - ";
        cout << pr;
        cout << "\n";
        break;
    }

    return uttar;
}

// int ganatari mate nu function
float ganatari(char pr, float r1, float r2)
{
    float uttar = 0;

    if (pr == '+')
    {
        cout << "tame chayan karel sarvalo\n";
        uttar = r1 + r2;
    }
    else if (pr == '-')
    {
        cout << "tame chayan karel badbaki\n";
        uttar = r1 - r2;
    }
    else if (pr == '*')
    {
        cout << "tame chayan karel gunakar\n";
        uttar = r1 * r2;
    }
    else if (pr == '/')
    {
        cout << "tame chayan karel bhagakar\n";
        uttar = r1 / r2;
    }
    else
    {
        cout << "tame chayan kareli prakriya khoti chhe - ";
        cout << pr;
        cout << "\n";
    }

    return uttar;
}

void vartul(void)
{
    cout << "vyas aapo : ";
    float vyas = 0;
    cin >> vyas;

    cout << "\ttrijyaa = " << vyas / 2 << endl;
    cout << "\tkshetrafal = " << (PI * vyas * vyas) / 4 << endl;
    cout << "\tpareegh = " << PI * vyas << endl;
}

void chatushkon(void)
{
    cout << "lambai aapo : ";
    float lambai;
    cin >> lambai;
    cout << "paholai aapo : ";
    float paholai;
    cin >> paholai;

    cout << "\tkshetrafal = " << lambai * paholai << endl;
    cout << "\tpareegh = " << (2 * lambai) + (2 * paholai) << endl;
}

void sine(void)
{
    cout << "khuna no ansh aapo : ";
    double ansh;
    cin >> ansh;

    cout << "\tsine = " << sin(ansh * PI / 180) << endl;
}

void cosine(void)
{
    cout << "khuna no ansh aapo : ";
    double ansh;
    cin >> ansh;

    cout << "\tcosine = " << cos(ansh * PI / 180) << endl;
}
