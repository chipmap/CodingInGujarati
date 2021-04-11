// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

public class Main {

    public static void main(String[] args) {
        // પબ્લિક કન્સ્ટ્રક્ટર વાપરો
        BmwCar car = new BmwCar("x૫",
                RangPrakar.ભૂરો,
                Vahan.FuelPrakar.પેટ્રોલ);
        System.out.println("ગાડી બનાવી...");
        car.Print();

        Truck truck = new Truck("ટાટા",
                "સુમો",
                12,
                RangPrakar.શ્યામ,
                Vahan.FuelPrakar.ડીઝલ);
        System.out.println("ટ્રક બનાવી...");
        truck.Print();

        // ગાડી અને ટ્રક ની સ્પર્ધા કરો
        truck.Run();
        truck.OdometerMaUmero(20.5);
        truck.Print();

        car.Run();
        car.OdometerMaUmero(101);
        car.OdometerMaUmero(25);
        car.Print();
    }
}
