import java.lang.reflect.Array;
import java.util.Arrays;

public class Ransom_Note {


    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder r = new StringBuilder(ransomNote);
        StringBuilder m = new StringBuilder(magazine);

        char[] charArrayR = ransomNote.toCharArray();
        char[] charArrayM = magazine.toCharArray();
        Arrays.sort(charArrayR);
        Arrays.sort(charArrayM);

        int j=0;
        int copyj=0;

        for (int i = 0; i < charArrayR.length; i++) {

            while (charArrayR[i]!= charArrayM[j]){
                if (j==charArrayM.length-1)
                    return false;
                j++;

            }
            if (copyj==j){
                j++;
                copyj=j;


            }


            
        }
        return true;




    }


}
