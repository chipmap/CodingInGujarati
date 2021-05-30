// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public final static String FILE_NAAM = "vahan.bin";
    private ArrayList<Vahan> mVahanSuchi = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.Deserialize();

        main.VahanSuchiPrintKaro();

        System.out.println("હવે આપણે વાહન દોડાવીએ... ");

        Vahan vahan = main.mVahanSuchi.get(0);
        vahan.OdometerMaUmero(700); // bmw

        vahan = main.mVahanSuchi.get(1);
        vahan.OdometerMaUmero(450); // tata

        vahan = main.mVahanSuchi.get(2);
        vahan.OdometerMaUmero(400.47); // volvo

        main.Serialize();

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

    /**
     * સંગ્રહ કરો
     */
    private void Serialize() {
        try {
            FileOutputStream fileOut = new FileOutputStream(FILE_NAAM);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(mVahanSuchi);

            objectOut.close();
            fileOut.close();

            System.out.println("ફાઇલ " + FILE_NAAM + " લખાઈ ગઈ");
        } catch (Exception ex) {
            System.out.println("ફાઇલ લખવામાં એકસેપ્શન : " + FILE_NAAM + "\n" + ex);
        }
    }

    /**
     * વાંચો
     */
    private void Deserialize() {
        boolean navaVahanBanavo = true;
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;

        try {
            File file = new File(FILE_NAAM);
            if (file.createNewFile() == true) {
                System.out.println("નવી ફાઇલ બનાવી : " + file.getAbsolutePath());
            } else {
                System.out.println("ફાઇલ મળી : " + file.getAbsolutePath());
                // ફાઇલ વાંચો અને એમાંથી વાહનો જે પહેલેથી બનાવ્યા છે એને ફરી બનાવો
                fileIn = new FileInputStream(file);
                objectIn = new ObjectInputStream(fileIn);

                mVahanSuchi = (ArrayList<Vahan>)objectIn.readObject();
                System.out.println("કુલ " + mVahanSuchi.size() + " વાહનો ફાઇલમાંથી મળ્યાં");
                navaVahanBanavo = (mVahanSuchi.size() == 0);
            }
        } catch (Exception ex) {
            System.out.println("ફાઇલ વાંચવામાં એકસેપ્શન : " + FILE_NAAM + "\n" + ex);
            ex.printStackTrace();
        } finally {
            System.out.println("ફાઇલ બંધ કરીશું : " + FILE_NAAM + "\n");

            try {
                if (objectIn != null) objectIn.close();
                if (fileIn != null) fileIn.close();
            } catch (Exception ex) {
                System.out.println("ફાઇલ બંધ કરવામાં એકસેપ્શન : " + FILE_NAAM + "\n" + ex);
                ex.printStackTrace();
            }
        }

        if (navaVahanBanavo) {
            // ફાઇલમાં કોઈ ત્રુટિ હોવાથી, નવા વાહનો બનાવો
            NavuVaahanUmero(Vahan.VahanPrakar.ગાડી, "બીએમડબ્લ્યુ", "x૫",
                    0, RangPrakar.ભૂરો, Vahan.FuelPrakar.પેટ્રોલ);
            NavuVaahanUmero(Vahan.VahanPrakar.ટ્રક, "ટાટા", "ગોલ્ડ",
                    12, RangPrakar.શ્યામ, Vahan.FuelPrakar.ડીઝલ);
            NavuVaahanUmero(Vahan.VahanPrakar.બસ, "વોલ્વો", "લકઝરી",
                    12, RangPrakar.કેસરી, Vahan.FuelPrakar.ડીઝલ);
        }
    }
}
