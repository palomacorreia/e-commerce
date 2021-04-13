package com.paloma.ecommerce.checkout.service;

import com.paloma.ecommerce.checkout.entity.CheckoutEntity;
import com.paloma.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
