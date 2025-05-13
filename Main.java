import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1001);
        list.add(4);
        list.add(6);

        for (Integer integer : list) {
            Multiples.main(integer);
        }

    }

}
