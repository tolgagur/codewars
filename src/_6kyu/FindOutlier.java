package _6kyu;

public class FindOutlier {
    static int find(int[] integers){

        int cift = 0;
        int tek = 0;
        int tutTek = 0;
        int tutCift = 0;
        for(int i=0; i< integers.length; i++){
            if(integers[i]%2 == 0){
                tutCift = integers[i];
                cift ++;
            }else {
                tutTek = integers[i];
                tek ++;
            }


        }
        if(tek == 1)
            return tutTek;
        else
            return tutCift;

    }
}
