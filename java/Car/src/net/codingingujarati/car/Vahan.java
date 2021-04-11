// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * જાવાડોક (javadoc) પ્રકારની કોમેન્ટનું ઉદાહરણ
 *
 * વાહન એ પેરન્ટ ક્લાસ છે.
 */
public abstract class Vahan {
    /**
     * બળતણ કે ફ્યુલના પ્રકાર
     */
    public enum FuelPrakar
    {
        નક્કીનથી,
        પેટ્રોલ,
        ડીઝલ,
        કેરોસીન,
        જેટફયુલ,
        નેચરલગેસ,
        કોલસો,
        ન્યુક્લિયર,
        ઇલેક્ટ્રિક,
        રોકેટેફયુલ
    }

    final protected int START_YEAR = 2021;

    protected int mTyre;
    protected RangPrakar mRang;
    protected FuelPrakar mFuel;
    protected String mBrand;
    protected String mModel;

    volatile protected double mOdometer;

    /**
     * ડિફોલ્ટ કન્સ્ટ્રક્ટર (constructor અથવા ctor)
     * પ્રાઇવેટ - અંગત રહસ્ય
     */
    private Vahan()
    {
        mOdometer = 0;
        mTyre = 4;
        mRang = RangPrakar.નક્કીનથી;
        mFuel = FuelPrakar.નક્કીનથી;
        mBrand = "";
        mModel = "";
    }

    /**
     * પ્રોટેક્ટેડ - સંતાન માટેનું કન્સ્ટ્રક્ટર
     * @param brand વાહનની બ્રાન્ડ
     * @param model બ્રાન્ડનું મોડેલ
     * @param tyre ટાયરની સંખ્યા
     * @param rang મોડેલનો રંગ
     * @param fuel મોડેલનું બળતણ
     */
    protected Vahan(String brand, String model, int tyre,
                    RangPrakar rang, FuelPrakar fuel)
    {
        mBrand = brand;
        mModel = model;
        mTyre = tyre;
        mRang = rang;
        mFuel = fuel;
        mOdometer = 0;
    }

    /**
     * બધુ સ્ક્રીન દેખાડો..
     * પબ્લિક - સર્વે માટે
     */
    public void Print()
    {
        System.out.println("sharuat nu varsh = " + START_YEAR);
        System.out.println("brand = " + mBrand);
        System.out.println("model = " + mModel);
        System.out.println("rang = " + mRang);
        System.out.println("tyre = " + mTyre);
        System.out.println("fuel = " + mFuel);
        System.out.println("odometer = " + OdometerReading());
    }

    /**
     * વાહન પ્રમાણે ચલાવવાની પ્રક્રિયા
     */
    abstract public void Run();

    /**
     * નવા કિલોમીટર ઉમેરો
     * @param navaKm નવા કિલોમીટર
     */
    public synchronized void OdometerMaUmero(double navaKm)
    {
        mOdometer += navaKm;
        //mOdometer = mOdometer + navaKm;
    }

    /**
     * હાલના કિલોમીટર
     * @return કિલોમીટર
     */
    public synchronized double OdometerReading()
    {
        return mOdometer;
    }
}
