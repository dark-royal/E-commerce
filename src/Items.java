import java.util.ArrayList;
import java.util.List;

public class Items {

    private int quantityOfProduct;
    private Product product;

    private List<Product> items = new ArrayList<>();


    public void addProduct(Product product1){
        items.add(product1);
    }

    public void removeProduct(int productId){
        Product product1 = findProduct(productId);
        items.remove(product1);
    }

    public Product findProduct(int productId){
        for(Product product1 : items){
            if(product1.getProductId() == productId){
                return product1;

            }
        }

    }




}
