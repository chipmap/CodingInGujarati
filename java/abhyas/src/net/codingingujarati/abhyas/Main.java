// કૉપીરાઇટ (c) ૨૦૨૧ ચિરાગ પટેલ
package net.codingingujarati.abhyas;

// https://code-exercises.com/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main my = new Main();
        //my.abhyas1(12);
        my.abhyas2(14);
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
}
