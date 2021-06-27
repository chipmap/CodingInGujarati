// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * ટ્રક પ્રકારનું વાહન
 */
public class Truck extends Vahan implements Dot {
    /**
     * પ્રોટેક્ટેડ - સંતાન માટેનું કન્સ્ટ્રક્ટર
     *
     * @param brand વાહનની બ્રાન્ડ
     * @param model બ્રાન્ડનું મોડેલ
     * @param tyre  ટાયરની સંખ્યા
     * @param rang  મોડેલનો રંગ
     * @param fuel  મોડેલનું બળતણ
     */
    public Truck(String brand, String model, int tyre, RangPrakar rang, FuelPrakar fuel) {
        super(VahanPrakar.ટ્રક, brand, model, tyre, rang, fuel);
    }

    /**
     * વાહન પ્રમાણે ચલાવવાની પ્રક્રિયા
     */
    @Override
    public void RunImpl() {
        System.out.println(ShortPrint() + " દોડી.. " + mOdometer + " કિલોમીટર");
    }

    /**
     * જે-તે વાહનને dotમાં રજીસ્ટર કરો
     */
    @Override
    public void RegisterKaro()
    {
        System.out.println(ShortPrint() + "નું રજીસ્ટ્રેશન થઈ ગયું..");
    }
}
