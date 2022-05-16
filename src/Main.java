import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tempList = new ArrayList<>();
        for (int i : intList) {
            if (i > 0 && i % 2 == 0) {
                tempList.add(i);
            }
        }
        Collections.sort(tempList);
        System.out.println(tempList);

        StreamMain streamMain = new StreamMain();
        streamMain.main();
    }
}
