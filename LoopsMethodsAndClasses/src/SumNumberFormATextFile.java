import java.io.*;

public class SumNumberFormATextFile {
    public static void main(String[] args) throws IOException{
        File file = new File("input_sum_of_numbers.txt");
        int sum = 0;
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();

            while (line  != null){
                sum += Integer.parseInt(line);
                line = buffer.readLine();
            }

            System.out.println(sum);
            buffer.close();

        } catch (FileNotFoundException ex) {
            System.err.println("Error");
        }


    }
}
