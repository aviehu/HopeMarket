package Domain.Stores.Policies;

import Domain.Stores.Predicates.OperatorComponent;
import Domain.Stores.Product;

import java.util.Map;

public class BasketPolicy implements Policy {

    private OperatorComponent operatorComponent;
    private String description;
    private int id;

    public BasketPolicy(int id, String description, OperatorComponent operatorComponent) {
        this.id = id;
        this.description = description;
        this.operatorComponent = operatorComponent;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean canPurchase(Map<Product, int> amounts) {
        return operatorComponent.shouldApply(amounts);
    }
}
