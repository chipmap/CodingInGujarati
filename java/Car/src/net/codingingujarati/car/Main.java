// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

import java.util.ArrayList;

public class Main {

    private ArrayList<Vahan> mVahanSuchi = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.NavuVaahanUmero(Vahan.VahanPrakar.ગાડી, "બીએમડબ્લ્યુ", "x૫",
                0, RangPrakar.ભૂરો, Vahan.FuelPrakar.પેટ્રોલ);
        main.NavuVaahanUmero(Vahan.VahanPrakar.ટ્રક, "ટાટા", "ગોલ્ડ",
                12, RangPrakar.શ્યામ, Vahan.FuelPrakar.ડીઝલ);
        main.NavuVaahanUmero(Vahan.VahanPrakar.બસ, "વોલ્વો", "લકઝરી",
                12, RangPrakar.કેસરી, Vahan.FuelPrakar.ડીઝલ);

        main.VahanSuchiPrintKaro();

        System.out.println("હવે આપણે વાહન દોડાવીએ... ");

        Vahan vahan = main.mVahanSuchi.get(0);
        vahan.OdometerMaUmero(300); // bmw

        vahan = main.mVahanSuchi.get(1);
        vahan.OdometerMaUmero(12000); // tata

        vahan = main.mVahanSuchi.get(2);
        vahan.OdometerMaUmero(45200.47); // volvo

        main.VahanSuchiPrintKaro();
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
