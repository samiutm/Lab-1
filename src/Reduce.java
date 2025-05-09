public class Reduce {

    public static void main(String[] args) {
        reduce(11);
    }
    private static void reduce(int n){
        while (n>0){
            if (n%2==0){
                System.out.println(n);
                n = 0;
            }
            else{
                n--;
            }
        }
    }
}
