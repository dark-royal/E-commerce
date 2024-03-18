import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

    private Items items;

    @Test
    void addProduct() {
        Product product = new Product(1,"a fashionable jeans",23500.5,"versace jean",ProductCategory.ELECTRONICS);
        Product product1 = new Product(2,"a gold chain",30000.0,"twins chain",ProductCategory.ACCESSORIES);
        items = new Items(4,product);
        items.addProduct(product);
        items.addProduct(product1);
        assertEquals(2,items.getNumberOfProductInItems());
    }

    @Test
    void removeProduct() {
        Product product = new Product(1,"a fashionable jeans",23500.5,"versace jean",ProductCategory.ELECTRONICS);
        Product product1 = new Product(2,"a gold chain",30000.0,"twins chain",ProductCategory.ACCESSORIES);
        items = new Items(4,product);
        items.addProduct(product);
        items.addProduct(product1);
        items.removeProduct(1);
        assertEquals(1,items.getNumberOfProductInItems());



}

    @Test
    void findProduct() {
        Product product = new Product(1,"a fashionable jeans",23500.5,"versace jean",ProductCategory.ELECTRONICS);
        Product product1 = new Product(2,"a gold chain",30000.0,"twins chain",ProductCategory.ACCESSORIES);
        items = new Items(4,product);
        items.addProduct(product);
        items.addProduct(product1);

        Product foundProduct = items.findProduct(1);
        assertEquals(foundProduct,items.findProduct(1));
    }

    @Test
    void testThatItemCanFindProductInTheItem_throwProductNotFoundException(){
        Product product = new Product(1,"a fashionable jeans",23500.5,"versace jean",ProductCategory.ELECTRONICS);
        Product product1 = new Product(2,"a gold chain",30000.0,"twins chain",ProductCategory.ACCESSORIES);
        items = new Items(4,product);
        items.addProduct(product);
        items.addProduct(product1);

        assertThrows(ProductNotFoundException.class,()-> items.findProduct(3));
    }

    }




