package _7kyu;

import java.util.List;

public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {
        for(int i=0;i<strng.length();i++)
            if(!arr.contains(strng.substring(i,strng.length())+strng.substring(0,i)))
                return false;
        return true;
    }
}