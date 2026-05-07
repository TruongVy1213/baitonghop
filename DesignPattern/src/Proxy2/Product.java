package Proxy2;

public class Product implements DisplayObject{
    private String product;

    Product(String product){
        this.product = product;
        getProduct();
    }

    public void getProduct(){
        System.out.println("Get a product in warehouse: " + product);
    }

    @Override
    public void display() {
        System.out.println("Show product " + product);
    }
}
