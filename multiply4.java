public class multiply4 implements calculator4 {
    int m,n;

//    public int getm() {
//        return m;
//    }
//    public void setm(int m) {
//        this.m = m;
//    }
//
//    public int getn() {
//        return n;
//    }
//    public void setn(int n) {
//        this.n = n;
//    }

    public multiply4(int m, int n){
        this.m = m;
        this.n = n;

    }

    @Override
    public int computer(int n,int m){
        return n+m;
    }
}
