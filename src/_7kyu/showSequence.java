package _7kyu;

public class showSequence {

    public static String showSequence(int value){
        if (value<=0)
            return value == 0 ? value+"=0":value+"<0";

        String valueString = "0";
        int valueInt =0;
        for (int i = 1; i<=value;i++){
            valueInt = valueInt+i;
            valueString =valueString+"+"+i;
        }
        valueString=valueString+" = "+valueInt;

        return valueString;
    }

}
