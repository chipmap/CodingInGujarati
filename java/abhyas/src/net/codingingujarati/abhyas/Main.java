// કૉપીરાઇટ (c) ૨૦૨૧ ચિરાગ પટેલ
package net.codingingujarati.abhyas;

// https://code-exercises.com/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("એક સંખ્યા કે શબ્દ આપો: ");
        Main my = new Main();
        //my.abhyas1(12);
        //my.abhyas2(14);
        my.abhyas3(in.nextLine());
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
