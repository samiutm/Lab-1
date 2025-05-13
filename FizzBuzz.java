/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(int args) {
        whilefizzbuzz(args);
        }

    private static void whilefizzbuzz(int num) {
        int j = 1;
        while (j < num){
            boolean div3 = j % 3 == 0;
            boolean div5 = j % 5 == 0;

            if (div3 && div5){
                System.out.println("FizzBuzz");
            }
            else if (div3){
                System.out.println("Fizz");
            }
            else if (div5){
                System.out.println("Buzz");
            }
            else {
                System.out.println(j);
            }
            j++;
        }
    }
}

