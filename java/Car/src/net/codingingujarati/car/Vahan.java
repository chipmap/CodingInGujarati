// Copyright (c) 2021 Chirag Patel

package net.codingingujarati.car;

/**
 * જાવાડોક (javadoc) પ્રકારની કોમેન્ટનું ઉદાહરણ
 *
 * વાહન એ પેરન્ટ ક્લાસ છે.
 */
public abstract class Vahan {

    /**
     * વાહનના પ્રકાર
     */
    public enum VahanPrakar
    {
        નક્કીનથી,
        ગાડી,
        ટ્રક,
        બસ,
        બાઇક,
        સાઇકલ,
        રોકેટ,
        વિમાન,
        ટ્રેન,
        ટ્રામ,
        મેટ્રોટ્રેન
    }

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

    final public int START_YEAR = 2021;

    protected int mTyre;
    protected RangPrakar mRang;
    protected FuelPrakar mFuel;
    protected String mBrand;
    protected String mModel;
    protected VahanPrakar mPrakar;

    volatile protected double mOdometer;

    /**
     * ડિફોલ્ટ કન્સ્ટ્રક્ટર (constructor અથવા ctor)
     * પ્રાઇવેટ - અંગત રહસ્ય
     */
    private Vahan()
    {
        mPrakar = VahanPrakar.નક્કીનથી;
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
    protected Vahan(VahanPrakar prakar, String brand, String model, int tyre,
                    RangPrakar rang, FuelPrakar fuel)
    {
        mPrakar = prakar;
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
        System.out.println("--------------------->>");
        System.out.println("પ્રકાર = " + mPrakar);
        System.out.println("પ્રથમ વર્ષ = " + START_YEAR);
        System.out.println("બ્રાન્ડ = " + mBrand);
        System.out.println("મોડેલ = " + mModel);
        System.out.println("રંગ = " + mRang);
        System.out.println("ટાયર = " + mTyre);
        System.out.println("બળતણ = " + mFuel);
        System.out.println("ઓડોમીટર = " + OdometerReading() + " કિલોમીટર");
        System.out.println("<<---------------------");
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
