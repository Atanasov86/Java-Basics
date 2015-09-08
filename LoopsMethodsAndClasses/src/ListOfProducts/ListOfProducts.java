package ListOfProducts;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("Input.txt");
        try {
            FileReader reader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            ArrayList<Product> listProducts = new ArrayList<Product>();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                String[] tokens = line.split(" ");
                String name = tokens[0];
                BigDecimal price = new BigDecimal(tokens[1]);
                Product product = new Product(name, price);
                listProducts.add(product);
            }

            Collections.sort(listProducts);
            File outputFile = new File("output_list_of_products.txt");
            PrintWriter writer = new PrintWriter(outputFile);

            for (Product product : listProducts) {
                writer.println(product.getPrice() + " " + product.getName());
            }

            writer.close();
            reader.close();

        } catch (FileNotFoundException fnfEx) {
            System.err.print("File is not found");
        }

    }
}
