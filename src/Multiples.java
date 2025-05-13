public class Multiples{

    public static void main(int args) {
        multiple(args);
    }

    private static void multiple(int n) {
        int i = 1;
        int count3 = 0;
        int count5 = 0;
        while (i < n) {
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;

            if (div3 && div5) {
                count3++;
                count5++;
            }
            else if (div3) {
                count3++;
            }
            else if (div5) {
                count5++;
            }
            i ++;
        }
        System.out.println(count3);
        System.out.println(count5);
    }
}
