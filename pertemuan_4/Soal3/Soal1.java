package Soal3;
import com.polban.jtk.sales.*;

public class Soal1 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10000000, 10);
        Sales sales = new Sales(product);
        
        sales.sellProduct(5);
        sales.restockProduct(7);
        sales.updateProductPrice(15000000);
        sales.updateProductPrice(-12000000);
    }
}
