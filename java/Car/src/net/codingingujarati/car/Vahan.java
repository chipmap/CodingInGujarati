// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * જાવાડોક (javadoc) પ્રકારની કોમેન્ટનું ઉદાહરણ
 *
 * વાહન એ પેરન્ટ ક્લાસ છે.
 */
public class Vahan {
    public int mTyre;
    public int mRang;
    public int mFuel;
    public String mBrand;
    public String mModel;

    /**
     * ડિફોલ્ટ કન્સ્ટ્રક્ટર (constructor અથવા ctor)
     */
    public Vahan()
    {
        mTyre = 4;
        mRang = 0;
        mFuel = 0;
        mBrand = "";
        mModel = "";
    }

    /**
     * બધુ સ્ક્રીન દેખાડો..
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
