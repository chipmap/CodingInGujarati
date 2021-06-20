// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * કાર પ્રકારનું વાહન
 */
public class Car extends Vahan implements Dot {
    /**
     * વપરાશકર્તા માટેનું કન્સ્ટ્રક્ટર
     *
     * @param brand વાહનની બ્રાન્ડ
     * @param model બ્રાન્ડનું મોડેલ
     * @param rang મોડેલનો રંગ
     * @param fuel મોડેલનું બળતણ
     */
    public Car(String brand, String model, RangPrakar rang, FuelPrakar fuel)
    {
        // સુપર વડે વાહનના મેથડ/ફંક્શન (અહી કન્સ્ટ્રક્ટર)
        super(VahanPrakar.ગાડી, brand, model, 4, rang, fuel);
    }

    /**
     * વાહન પ્રમાણે ચલાવવાની પ્રક્રિયા
     */
    @Override
    public void RunImpl() {
        System.out.println("મારી ગાડી દોડી..");
    }

    /**
     * જે-તે વાહનને dotમાં રજીસ્ટર કરો
     */
    @Override
    public void RegisterKaro() {
        System.out.println(mBrand + ":" + mModel + "નું રજીસ્ટ્રેશન થઈ ગયું..");
    }
}
