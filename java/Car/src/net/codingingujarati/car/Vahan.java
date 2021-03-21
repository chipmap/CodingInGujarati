// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * જાવાડોક (javadoc) પ્રકારની કોમેન્ટનું ઉદાહરણ
 *
 * વાહન એ પેરન્ટ ક્લાસ છે.
 */
public class Vahan {
    private int mTyre;
    private int mRang;
    private int mFuel;
    private String mBrand;
    private String mModel;

    /**
     * ડિફોલ્ટ કન્સ્ટ્રક્ટર (constructor અથવા ctor)
     * પ્રાઇવેટ - અંગત રહસ્ય
     */
    private Vahan()
    {
        mTyre = 4;
        mRang = 0;
        mFuel = 0;
        mBrand = "";
        mModel = "";
    }

    /**
     * પ્રોટેક્ટેડ - સંતાન માટેનું કન્સ્ટ્રક્ટર
     * @param brand વાહનની બ્રાન્ડ
     * @param model બ્રાન્ડનું મોડેલ
     * @param tyre ટાયરની સંખ્યા
     */
    protected Vahan(String brand, String model, int tyre)
    {
        mBrand = brand;
        mModel = model;
        mTyre = tyre;
        mRang = 0;
        mFuel = 0;
    }

    /**
     * બધુ સ્ક્રીન દેખાડો..
     * પબ્લિક - સર્વે માટે
     */
    public void Print()
    {
        System.out.println("tyre = " + mTyre);
        System.out.println("rang = " + mRang);
        System.out.println("fuel = " + mFuel);
        System.out.println("brand = " + mBrand);
        System.out.println("model = " + mModel);
    }
}
