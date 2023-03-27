package com.laila.organizerwallet.controller.paymentmethod;

import com.laila.organizerwallet.datasource.entity.PaymentMethod;
import com.laila.organizerwallet.datasource.repo.PaymentMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment-method")
public class PaymentMethodController {
    @Autowired
    PaymentMethodRepo paymentMethodRepo;
    @GetMapping
    public ResponseEntity<?> getPaymentMethod() {
        List<PaymentMethod> paymentMethods = paymentMethodRepo.findAll();
        return ResponseEntity.ok(paymentMethods);
    }
}
