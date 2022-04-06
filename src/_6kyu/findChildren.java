package _6kyu;
import java.util.*;
import java.util.stream.Collectors;
class findChildren {
    static String findChildren(final String text) {
        if (text.length()<1)
            return "";

        String[] sText = text.split("");

        List<String> list = Arrays.stream(sText).sorted().collect(Collectors.toList());
        String textList = "";
        for (String s:list){
            textList = textList + s;
        }
        System.out.println("textlist - > " +  textList);
        String s = "";
        for (int i =0;i<list.size();i++){
            if (Character.isUpperCase(textList.charAt(i))){
                s = s + textList.charAt(i);
                for (int j = 0; j<textList.length();j++){

                    if (String.valueOf(textList.charAt(j)).equals(String.valueOf(textList.charAt(i)).toLowerCase())){
                        s = s + textList.charAt(j);
                    }
                }

            }
        }
        return s;
    }
}