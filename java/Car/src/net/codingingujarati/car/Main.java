// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

public class Main {

    public final static int MAX_VAHANO = 100;

    private int mTracker = 0;
    private Vahan[] mVahanSamooh = new Vahan[MAX_VAHANO];

    public static void main(String[] args) {
        Main main = new Main();
        main.NavuVaahanUmero(Vahan.VahanPrakar.ગાડી, "બીએમડબ્લ્યુ", "x૫",
                0, RangPrakar.ભૂરો, Vahan.FuelPrakar.પેટ્રોલ);
        main.NavuVaahanUmero(Vahan.VahanPrakar.ટ્રક, "ટાટા", "સુમો",
                12, RangPrakar.શ્યામ, Vahan.FuelPrakar.ડીઝલ);

        main.VahanSuchiPrintKaro();


        /* ગાડી અને ટ્રક ની સ્પર્ધા કરો
        truck.Run();

        // વપરાશકર્તા પાસેથી અંતર લો..
        System.out.println("ટ્રક કેટલા કિલોમીટર દોડી એ જણાવો: ");
        Scanner maruScanner = new Scanner(System.in);
        double marakm = maruScanner.nextDouble();

        truck.OdometerMaUmero(marakm);
        truck.Print();

        car.Run();
        car.OdometerMaUmero(100);

        System.out.println("કાર કેટલા કિલોમીટર દોડી એ જણાવો: ");
        marakm = maruScanner.nextDouble();
        car.OdometerMaUmero(marakm);

        car.Print();
         */
    }

    private void NavuVaahanUmero(Vahan.VahanPrakar prakar, String brand, String model, int tyre,
                                 RangPrakar rang, Vahan.FuelPrakar fuel)
    {
        Vahan navuVahan = null;

        if (mTracker < (MAX_VAHANO - 1)) {
            switch (prakar) {
                case ગાડી:
                    navuVahan = new Car(brand, model, rang, fuel);
                    break;

                case ટ્રક:
                    navuVahan = new Truck(brand, model, tyre, rang, fuel);
                    break;

                default:
                    System.out.println("આ પ્રકારનું વાહન હજુ અમે બનાવતા નથી.. " + prakar);
            }

            if (navuVahan != null) {
                mVahanSamooh[mTracker] = navuVahan;
                ++mTracker;
                System.out.println("[" + mTracker + "] " + navuVahan.mPrakar + " બનાવી...");
            }
        } else {
            System.out.println("કુલ વાહન સંખ્યા સમાપ્ત થઈ છે .. " + MAX_VAHANO);
        }

    }

    private void VahanSuchiPrintKaro()
    {
        for (int idx = 0; idx < mTracker; ++idx) {
            mVahanSamooh[idx].Print();
        }
    }
}
