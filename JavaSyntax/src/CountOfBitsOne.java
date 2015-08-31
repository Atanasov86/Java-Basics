import java.util.Scanner;

public class CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numInBinaryString = Integer.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < numInBinaryString.length(); i++) {
            char currentBit = numInBinaryString.charAt(i);
            if (currentBit == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
