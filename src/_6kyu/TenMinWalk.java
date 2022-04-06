package _6kyu;

import java.util.HashMap;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length!=10)
            return false;


        HashMap<Character,Integer> map = new HashMap<>();
        for (Character character:walk){
            map.put(character,map.get(character)==null? 1:map.get(character)+1);
        }
        if (map.get('n')==map.get('s') && map.get('w')==map.get('e'))
            return true;

        return false;
    }
}