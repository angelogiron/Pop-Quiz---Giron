package transaction.api.controller;

import  transaction.api.model.Customer;
import transaction.api.model.Product;
import transaction.api.model.TransactionRequest;
import transaction.api.model.TransactionResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import transaction.api.repository.transactionMyBatis;
@RestController
public class TransactionController {

    @Autowired
    transactionMyBatis transactionrepo;

    @PostMapping("/transaction/info")
    public TransactionResponse insert(@RequestBody TransactionRequest request) {
        Customer customer = request.getCustomer();
        List<Product> products = request.getProducts();

       
        transactionrepo.insert(customer);

      
        transactionrepo.insertTransactionItem(products);

        
        int total = 0;
        for (Product item : products) {
            total += item.getItemPrice() * item.getQuantity();
        }

       
        TransactionResponse response = new TransactionResponse();
        response.setTotal(total);

        return response;
    }
}

	

