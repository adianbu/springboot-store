package com.adianbu.springbootStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStoreApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringbootStoreApplication.class, args);
        var orderContext = context.getBean(OrderService.class);
//        OrderService orderService=new OrderService(new StripePaymentService());
        orderContext.placeOrder(10);
	}

}
