import java.util.Scanner;

public class Calc {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] words = str.split("[+,*,/,-]");
        if (words.length != 2) throw new IllegalArgumentException("Не верное выражение!");
        words[0] = words[0].trim();
        words[1] = words[1].trim();
        Boolean rm = false;
        Integer rez = null;
        Integer op1 = null;
        Integer op2 = null;
        if (words[0].replaceAll("\\d", "").length() == 0) op1 = Integer.parseInt(words[0]);
        if (words[1].replaceAll("\\d", "").length() == 0) op2 = Integer.parseInt(words[1]);
        if ((op1 != null & op2 == null) | (op1 == null & op2 != null)) throw new IllegalArgumentException("Не верное выражение!");
        if (op1 == null & op2 == null) {
            rm = true;
            op1 = RomanToArabic.romanToArabic(words[0]);
            op2 = RomanToArabic.romanToArabic(words[1]);
        }

        if (str.indexOf("-") != -1) rez = op1-op2;
        if (str.indexOf("+") != -1) rez = op1+op2;
        if (str.indexOf("*") != -1) rez = op1*op2;
        if (str.indexOf("/") != -1) rez = op1/op2;

        if (rm) System.out.println(str + " = " + RomanToArabic.arabicToRoman(rez));
        else System.out.println(str + " = " + rez);
    }
}
