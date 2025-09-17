package com.adianbu.springbootStore;

public class OrderService {

    public void placeOrder(){
        var paymentService= new StripePaymentService();
        paymentService.processPayment(10);

    }
}
