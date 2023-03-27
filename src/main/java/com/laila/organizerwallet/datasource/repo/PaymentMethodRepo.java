package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepo extends JpaRepository<PaymentMethod, Integer> {
}
