package transaction.api.model;

public class Product {
private int barcode;
private String itemName;
private int itemPrice;
private int quantity;
public int getBarcode() {
	return barcode;
}
public void setBarcode(int barcode) {
	this.barcode = barcode;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getItemPrice() {
	return itemPrice;
}
public void setItemPrice(int itemPrice) {
	this.itemPrice = itemPrice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
