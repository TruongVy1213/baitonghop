package Proxy2;

public class ProductProxy implements DisplayObject{
    private String product;
    private Product warehouse;

    ProductProxy(String product){
        this.product = product;
        System.out.println("Unload product" + this.product);
    }

    @Override
    public void display() {
        if(warehouse == null){
            warehouse = new Product(product);
        }
        else {
            System.out.println("Product already existed: " + product);
        }
        warehouse.display();
    }
}
