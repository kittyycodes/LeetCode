class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Character> p=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        p.addAll(map.keySet());
        int ans=0,count=0,i;
        while(!p.isEmpty()){
            char x=p.poll();
            count++;
            i=count/8;
            if((count%8!=0))
            i++;
            ans+=(map.get(x)*i);
        }
        return ans;
        
    }
}