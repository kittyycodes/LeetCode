import java.util.Map;
import java.util.HashMap;

class KthDistinctString {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for (String v : arr) {
            counter.put(v, counter.getOrDefault(v, 0)+1);
        }
        for (String v : arr){
            if (counter.get(v) ==1) {
                --k;
                if (k == 0){
                    return v;
                }
            }
        }
        return "";
    } 
    public static void main(String[] args)
    {
        KthDistinctString solution = new KthDistinctString();

        String[] arr = {"a", "b", "a", "c", "b", "d"};
        int k = 2;
        String result=solution.kthDistinct(arr, k);
        System.out.println("The "+ k + "th distinct string is: " + result );
    }
}
