package com.paloma.ecommerce.payment.service;

import com.paloma.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.paloma.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
