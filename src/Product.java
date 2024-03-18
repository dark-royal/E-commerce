import java.util.ArrayList;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private String productDescription;
    private ProductCategory productCategory;


    public Product(int productId,String productDescription,double productPrice,String productName,ProductCategory productCategory1){
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public void setProductName(String productName){
        this.productName = productName;

    }

    public String getProductName(){
        return productName;
    }

    public void setProductDescription(String productName){
        this.productDescription = productDescription;
    }

    public String getProductDescription(){
        return productDescription;
    }

    public void setProductPrice(double price){
        this.productPrice = price;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public int getProductId(){
        return productId;
    }

    public int generateProductId(){
        productId++;
        return productId;
    }




}
