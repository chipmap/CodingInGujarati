// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * કાર પ્રકારનું વાહન
 */
public class Car extends Vahan {
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
        super(brand, model, 4, rang, fuel);
    }
}
