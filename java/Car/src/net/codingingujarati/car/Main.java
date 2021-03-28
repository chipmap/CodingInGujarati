// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

public class Main {

    public static void main(String[] args) {
        // પબ્લિક કન્સ્ટ્રક્ટર વાપરો
        BmwCar car = new BmwCar("x૫",
                RangPrakar.ભૂરો,
                Vahan.FuelPrakar.પેટ્રોલ);
        System.out.println("ગાડી દોડી...");
        car.Print();
    }
}
