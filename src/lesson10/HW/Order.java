package lesson10.HW;

import java.util.Date;

public abstract class Order {
     String itemName;
     Date dateCreated;
     Date dateConfirmed;
     Date dateShipped;
     String shipFromCity;
     String shipToCity;
     int basePrice;
     double totalPrice;
     Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

   abstract void validateOrder();



    abstract void calculatePrice();



    void confirmShipping(){

        dateShipped = new Date();
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
