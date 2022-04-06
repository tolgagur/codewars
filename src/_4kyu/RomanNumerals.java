package _4kyu;
public class RomanNumerals {
    final static String[] ROMEN = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    final static int[] VALUES = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static String toRoman(int n) {
        String romenToInteger = "";
        for (int i = 0; i < VALUES.length; i++) {
            if (n>=VALUES[i]){
                n -= VALUES[i];
                romenToInteger = romenToInteger + ROMEN[i];
                i=i-1;
            }
        }
        return romenToInteger;
    }

    public static int fromRoman(String romanNumeral) {
        int integerToRomen = 0, num = 0;
        for (int i = romanNumeral.length()-1; i >= 0; i--) {
            switch(romanNumeral.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < integerToRomen) integerToRomen -= num;
            else integerToRomen += num;
        }
        return integerToRomen;
    }
}