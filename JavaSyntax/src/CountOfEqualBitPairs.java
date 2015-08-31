import java.util.Scanner;

public class CountOfEqualBitPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberInBinaryFormat = Integer.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < numberInBinaryFormat.length() - 1; i++) {
            String currentTwoBits = numberInBinaryFormat.substring(i,i+2);
            if (currentTwoBits.equals("00") || currentTwoBits.equals("11")){
                count++;
            }
        }
        System.out.println(count);
    }
}
