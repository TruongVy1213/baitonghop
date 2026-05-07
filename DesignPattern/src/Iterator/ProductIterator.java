package Iterator;

public class ProductIterator implements Iterator{
    private ProductCollection collection;
    private int index = 0;

    ProductIterator(ProductCollection collection){
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        while (index < collection.getProducts().size()){
            if (collection.getProducts().get(index).getQuantity() > 0){
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Object next() {
        return collection.getProducts().get(index++);
    }
}
