import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            list.add(tmp);
        }

        for (int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    }
}