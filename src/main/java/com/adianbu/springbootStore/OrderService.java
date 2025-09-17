package com.adianbu.springbootStore;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(double amount){
        paymentService.processPayment(amount);

    }
}
