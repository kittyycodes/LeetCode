import java.util.Map;
import java.util.HashMap;

public class LongestSubVowel {
    public int findTheLongestSubstring(String s) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,-1);
        int mask = 0;
        int maxLength =0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char c =sb.charAt(i);
            if (c== 'a'){
                mask ^= (1<<0);
            }else if (c== 'e'){
                mask ^= (1<<1);
            }else if (c=='i'){

                mask ^= (1<<2);
            }else  if (c=='o'){
                mask ^= (1<<3);
            }else if (c=='u'){
                mask^= (1<<4);
            }
            
            if (m.containsKey(mask)){
                maxLength = Math.max(maxLength, i-m.get(mask));
            }else{
                m.put(mask,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        LongestSubVowel lsv = new LongestSubVowel();
        String input = "eleetminicoworoep";
        int result = lsv.findTheLongestSubstring(input);
        System.out.println("the length of the longest substring with even vowel counts is: " + result);
    }
}

