import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{


        private List<Items> shoppingCart;

        public ShoppingCart(String cartID, String userID) {

            this.shoppingCart = new ArrayList<>();
        }

        public void addItems(Items items) {
                shoppingCart.add(items);

                


        }

        public void removeItems(Items items) {
                shoppingCart.remove(items);

        }

        public void viewCart() {


        }

        public void checkout() {

        }
    }

