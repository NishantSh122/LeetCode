//easy
class L3345{
    public int smallestNumber(int n, int t) {
        while(true){
            int j=n, p=1;
            while(j!=0){
                p*=j%10;
                j=j/10;
            }
            if(p%t == 0)
                break;
            n++;
        }
        return n;
    }
    public void main(String[] args){
        int n =14;
        int t = 9;
        smallestNumber(n,t);
    }
}