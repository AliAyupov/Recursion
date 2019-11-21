public class Stepen {
    public static int multi(int a,int n){
        if (n==1){
            return a;
        }
        return a*multi(a,n-1);
    }
    public static void main(String[] args){
        System.out.println(multi(4,6));
    }
}




