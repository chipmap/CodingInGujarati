// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

import javax.xml.validation.ValidatorHandler;

public class Main {

    public static void main(String[] args) {
        // પ્રારંભિક ઓબ્જેક્ટ/ઇન્સ્ટનસ
        Vahan car = new Vahan();
        car.Print();
        // અમુક ડેટ સભ્યોને બદલો
        System.out.println("ગાડી દોડી...");
        car.mBrand = "બીએમડબ્લ્યુ";
        car.mModel = "x૫";
        car.Print();
    }
}
