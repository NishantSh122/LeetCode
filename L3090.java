//easy
class L3090 {
    /* ORIGINAL LOGIC
    public int maximumLengthSubstring(String s) {
        int m=2;
        int l=0, k=1;
        HashMap<Character , Integer> t = new HashMap<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(t.getOrDefault(ch,0)<2){
                t.put(ch,t.getOrDefault(ch,0)+1); //1 //2
                l++; //1 //2
                i++;
            }
            else{
                i=k;
                k++;
                t.clear();
                m = (m<l)?l:m;
                l=0;
            }
        }
        m = (m<l)?l:m;
        return m;
    }
    */
   //LOGIC AFTER SUBMITTING AND THINKING
   public int maximumLengthSubstring(String s) {
        int[] h = new int[26];
        int l=0;
        int len=0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            h[ch-'a']++;
            while(h[ch-'a']>2){
                char ch2 = s.charAt(l);
                h[ch2-'a']--;
                l++;
            }
            len = Math.max(len, r-l+1);
        }
        return len;

        //b c b b b c a
        //1 1 2 2.2.2 1
        //0 0 0 L
    }
    public void main(String[] args){
        String s = "abbaacdd";
        maximumLengthSubstring(s);
    }
}