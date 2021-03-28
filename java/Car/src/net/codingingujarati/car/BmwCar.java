// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * બીએમડબ્લ્યુ પ્રકારની ગાડી
 */
public class BmwCar extends Car {
    /**
     * વપરાશકર્તા માટેનું કન્સ્ટ્રક્ટર
     *
     * @param model બ્રાન્ડનું મોડેલ
     * @param rang મોડેલનો રંગ
     * @param fuel મોડેલનું બળતણ
     */
    public BmwCar(String model, RangPrakar rang, FuelPrakar fuel) {
        super("બીએમડબ્લ્યુ", model, rang, fuel);
    }
}
