import java.util.ArrayList;
import java.util.List;

public class Items {

    private int quantityOfProduct;
    private Product product;

    private int productId;

    private List<Product> items = new ArrayList<>();

    public Items(int quantityOfProduct, Product product) {
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;

    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }


    public void addProduct(Product product1) {
        items.add(product1);
    }

    public void removeProduct(int productId) {
        Product product1 = findProduct(productId);
        items.remove(product1);
    }


    public Product findProduct(int productId) {
        for (Product product1 : items) {
            if (product1.getProductId() == productId) {
                return product1;
            }
        }
        throw new ProductNotFoundException("product not found");
    }

    public int getNumberOfProductInItems() {
        return items.size();
    }
}

//public int generateProductId(){
//
//    return pr
//}

