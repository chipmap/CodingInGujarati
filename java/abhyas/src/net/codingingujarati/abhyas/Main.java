// કૉપીરાઇટ (c) ૨૦૨૧ ચિરાગ પટેલ
package net.codingingujarati.abhyas;

// https://code-exercises.com/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("સંખ્યા કે શબ્દ આપો: ");
        Main my = new Main();
        //my.abhyas1(12);
        //my.abhyas2(14);
        //my.abhyas3(in.nextLine());
        //my.abhyas4(in.nextLine());
        my.abhyas5(in.nextLine());
    }

    /*
    ૧, ૫, ૧૧, ૧૪, ૭, ૮, ૧૨, ૧૩, ૧૯, ૨૦, ૨૬, ૧૬ - આમાંથી સહુથી મોટી સંખ્યા અને સહુથી નાની સંખ્યા શોધો.
    બધાની સરેરાશ કાઢો.
    */
    void abhyas5(String ankSuchiStr)
    {
        String[] ankSuchi = ankSuchiStr.split(",");
        int nano = Integer.parseInt(ankSuchi[0]);
        int moto = nano;
        int sarerash = 0;

        for (String ankStr : ankSuchi)
        {
            int ank = Integer.parseInt(ankStr);

            if (ank < nano) {
                nano = ank;
            }

            if (ank > moto) {
                moto = ank;
            }

            sarerash += ank;
        }

        sarerash = sarerash / ankSuchi.length;

        System.out.println("મોટી સંખ્યા: " + moto + " નાની સંખ્યા: " + nano + " સરેરાશ: " + sarerash);
    }

    /*
    કોઈ પણ સ્ટ્રિંગને અવળી કરીને લખો અને એમાં ઇંગ્લિશ અક્ષર હોય તો એ બધાં અપર કેસમાં લખો.
    જેમ કે, "ચિરાગ" -> "ગરાચિ", "૧૨૩૪" -> "૪૩૨૧", "12aBc" -> "CBA21"
     */
    String abhyas4(String shabd)
    {
        int length = shabd.length();
        String parinam = "";

        for (int idx = 0; idx < length; ++idx) {
            char akshar = shabd.charAt(length - 1 - idx);
            if ((akshar >= 'a') && (akshar <= 'z')) {
                akshar = (char)((int)akshar - 'a' + 'A');
            }

            parinam += akshar;
        }

        System.out.println("અવળા ક્રમમા : " + parinam);
        return parinam;
    }

    /*
    કોઈ પણ સંખ્યા કે શબ્દ પેલિન્ડ્રૉમ (palindrome) છે કે નહીં એ જણાવો.
    ધારો કે, સંખ્યા ૧૨૧ - પેલિન્ડ્રૉમ છે. પણ, ૧૨૨ એ પેલિન્ડ્રૉમ નથી!
    શબ્દ- "મલયાલમ" એ પેલિન્ડ્રૉમ છે, પણ "ગુજરાતી" પેલિન્ડ્રૉમ નથી.
     */
    boolean abhyas3(String shabd)
    {
        boolean parinam = true;
        int adadhoKram = shabd.length() / 2;

        for (int kram = 0; (kram < adadhoKram) && parinam; ++kram) {
            char paheloAkshar = shabd.charAt(kram);
            int bijoKram = shabd.length() - kram - 1;
            char bijoAkshar = shabd.charAt(bijoKram);
            System.out.println("અક્ષર[" + kram + "] = " + paheloAkshar
                    + ", અક્ષર[" + bijoKram + "] = " + bijoAkshar);

            parinam = (paheloAkshar == bijoAkshar);
        }

        System.out.println( shabd + " એ પેલિન્ડ્રૉમ " + (parinam ? "છે." : "નથી."));
        return parinam;
    }

    /*
    કોઈ પણ સંખ્યા માટે ફેક્ટરીઅલ શોધો.
    ધારો કે, સંખ્યા છે ૧૪. ફેક્ટરીઅલ(૧૪) = ૧૪! = ૧૪ x ૧૩ x ૧૨ x ૧૧ x ૧૦ ... ૧
    ફેક્ટરીઅલ(૩) = ૩ x  ૨ x  ૧ = ૬ = ૩!
     */
    int abhyas2(int sankhya)
    {
        int parinam = sankhya;
        String log = sankhya + "! = " + sankhya;

        for (int idx = (sankhya - 1); idx > 1; --idx) {
            parinam *= idx; // parinam = parinam * idx;

            log += " x " + idx;
        }

        log += " x 1";
        System.out.println(log);
        System.out.println("   = " + parinam);

        return parinam;
    }

    /*
     * વપરાશકર્તા પાસેથી એક સંખ્યા લો.
     * ૧ થી શરૂ કરી એ સંખ્યા સુધીમાં આવતા ૩ કે ૫ ના પ્રત્યેક મલ્ટિપલનો સરવાળો કરો.
     * ધારો કે, સંખ્યા છે ૧૨.
     * ૩ + ૫ + ૬ + ૯ + ૧૦ + ૧૨
     */
    int abhyas1(int sankhya)
    {
        int parinam = 0;
        System.out.println("મને મળેલી સંખ્યા: " + sankhya);

        for (int idx = 1; idx <= sankhya; ++idx)
        {
            if (idx % 3 == 0) {
                System.out.println(idx + " એ ૩ વડે પૂર્ણ વિભાજ્ય");
                parinam += idx;
            } else if (idx % 5 == 0) {
                System.out.println(idx + " એ ૫ વડે પૂર્ણ વિભાજ્ય");
                parinam += idx;
            } else {
                System.out.println(idx + " એ શરતનું પાલન નથી કરતી");
            }
        }

        System.out.println("પરિણામ: " + parinam);
        return parinam;
    }
}
