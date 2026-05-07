package Iterator;

public class Client {
    public static void main(String[] args) {
        ProductCollection product = new ProductCollection();

        product.addProduct(new Product("Laptop", 10));
        product.addProduct(new Product("Mouse", 0));
        product.addProduct(new Product("Keyboard", 5));

        Iterator<Product> iterator = product.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
