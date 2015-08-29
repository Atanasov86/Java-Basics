import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        String[] arrayStrings = new String[numberOfElements];
        for (int i = 0; i < numberOfElements; i++){
            arrayStrings[i] = scanner.next();
        }
        Arrays.sort(arrayStrings);
        System.out.println("Sorted towns: ");
        System.out.println(String.join("\n",arrayStrings));
    }
}
