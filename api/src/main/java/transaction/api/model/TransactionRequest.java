package transaction.api.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionRequest {
    private Customer customer;
    private List<Product> products;

    
    public TransactionRequest() {
    	this.customer = new Customer();
        this.products = new ArrayList<>();
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
