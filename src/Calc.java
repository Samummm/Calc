import java.util.Scanner;

public class Calc {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] words = str.split("[+,*,/,-]");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(RomanToArabic.romanToArabic("XXXIV"));
        System.out.println(RomanToArabic.arabicToRoman(3999));
    }
}
