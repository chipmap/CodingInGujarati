// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

import java.util.ArrayList;

public class Main {

    private ArrayList<Vahan> mVahanSuchi = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.NavuVaahanUmero(Vahan.VahanPrakar.ગાડી, "બીએમડબ્લ્યુ", "x૫",
                0, RangPrakar.ભૂરો, Vahan.FuelPrakar.પેટ્રોલ);
        main.NavuVaahanUmero(Vahan.VahanPrakar.ટ્રક, "ટાટા", "સુમો",
                12, RangPrakar.શ્યામ, Vahan.FuelPrakar.ડીઝલ);
        main.NavuVaahanUmero(Vahan.VahanPrakar.બસ, "વોલ્વો", "લકઝરી",
                12, RangPrakar.કેસરી, Vahan.FuelPrakar.ડીઝલ);

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
                                 RangPrakar rang, Vahan.FuelPrakar fuel) {
        switch (prakar) {
            case ગાડી:
                mVahanSuchi.add(new Car(brand, model, rang, fuel));
                break;

            case ટ્રક:
            case બસ:
                mVahanSuchi.add(new Truck(brand, model, tyre, rang, fuel));
                break;

            default:
                System.out.println("આ પ્રકારનું વાહન હજુ અમે બનાવતા નથી.. " + prakar);
        }
    }

    private void VahanSuchiPrintKaro() {
        for (Vahan vahan : mVahanSuchi) {
            vahan.Print();
        }
    }
}
