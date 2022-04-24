package Domain.Users.Users;

public class Guest extends User {


    @Override
    public ShoppingCart getMyShopCart() {
        return super.getMyShopCart();
    }

    public Guest() {
        super();
    }


    // exitSystem:
    // guest loosing his shopCart and not consider as guest(users.2)
    @Override
    public void exitSystem() {
        myShopCart = null;
    }

    @Override
    public void addProd(Store s, int quantity, String prodName) {
        super.addProd(s, quantity, prodName);
    }

    @Override
    public void removeProd(Store s, int quantity, String prodName) {
        super.removeProd(s, quantity, prodName);
    }

    @Override
    public String displayCart() {
        return super.displayCart();
    }

    @Override
    public void purchase() {
        super.purchase();
    }

    @Override
    public String getStoreInfo(Store s) {
        return super.getStoreInfo(s);
    }

    @Override
    public void searchProducts(String prodName) {
        super.searchProducts(prodName);
    }

    @Override
    public Member signIn(String userName, String password, int age, String mail) {
        return super.signIn(userName, password, age, mail);
    }

    @Override
    public boolean logIn(String userName, String password) {
        return super.logIn(userName, password);
    }
}
