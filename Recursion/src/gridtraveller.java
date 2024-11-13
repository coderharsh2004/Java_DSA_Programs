public class gridtraveller {
    public static int noofways(int m,int n){
        if(m==0 || n==0)return 0;
        if(m==1 || n==1)return 1;
        return noofways(m-1,n) + noofways(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(noofways(3,3));
    }
}
