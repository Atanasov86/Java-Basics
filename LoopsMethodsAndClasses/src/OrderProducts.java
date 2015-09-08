import ListOfProducts.Product;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class OrderProducts {
    public static void main(String[] args) throws IOException {
        File inputProducts = new File("Products.txt");
        ArrayList<Product> products = readProductsFromTextFile(inputProducts);
        File inputOrder = new File("Order.txt");
        FileReader reader = new FileReader(inputOrder);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        BigDecimal totalSum = new BigDecimal(BigInteger.ZERO);
        while (line != null) {
            String[] tokens = line.split(" ");
            String orderName = tokens[1];
            BigDecimal quantity = new BigDecimal(tokens[0]);
            for (Product product : products) {
                if (product.getName().equals(orderName)) {
                    BigDecimal currentPriceOfOrder = product.getPrice().multiply(quantity);
                    totalSum = totalSum.add(currentPriceOfOrder);
                }
            }
            line = bufferedReader.readLine();
        }

        PrintWriter writer = new PrintWriter("Output_Ordered_Price.txt");
        writer.println(String.format("%.1f", totalSum));
        reader.close();
        writer.close();
    }

    private static ArrayList<Product> readProductsFromTextFile(File file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        ArrayList<Product> products = new ArrayList<Product>();
        while (line != null) {
            String[] tokens = line.split(" ");
            String name = tokens[0];
            BigDecimal price = new BigDecimal(tokens[1]);
            Product currentProduct = new Product(name, price);
            products.add(currentProduct);
            line = bufferedReader.readLine();
        }

        return products;
    }
}
