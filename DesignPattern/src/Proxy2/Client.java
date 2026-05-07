package Proxy2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Init product");
        List<ProductProxy> product = new ArrayList<>();
        product.add(new ProductProxy("Bánh ngọt"));
        product.add(new ProductProxy("Trái cây"));
        product.add(new ProductProxy("Cá"));
        product.add(new ProductProxy("Thịt"));

        System.out.println("______________");
        System.out.println("Load product 1st");
        for (DisplayObject p : product){
            p.display();
        }

        System.out.println("________________");
        System.out.println("Load product 2st");
        for (DisplayObject p : product){
            p.display();
        }
    }
}
