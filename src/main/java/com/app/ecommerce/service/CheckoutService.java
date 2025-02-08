package com.app.ecommerce.service;

import com.app.ecommerce.dto.Purchase;
import com.app.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

//    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
