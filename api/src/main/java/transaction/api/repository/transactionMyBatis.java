package transaction.api.repository;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import  transaction.api.model.Customer;
import transaction.api.model.Product;

@Mapper
public interface transactionMyBatis {
	
	@Insert("INSERT INTO transactions(customerName, customerAddress) VALUES (#{customerName}, #{customerAddress})")
    public int insert(Customer customer);
	
	@Insert("INSERT INTO transaction_items(itemName, barcode, itemPrice, quantity, transactionId) VALUES (#{itemName}, #{barcode}, #{itemPrice}, #{quantity}, #{transactionId})")
    public int insertTransactionItem(List<Product> product);
	
	
	

}
