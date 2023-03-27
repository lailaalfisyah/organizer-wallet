package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.TBalanceAmount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceAmountRepo extends JpaRepository<TBalanceAmount, Long> {
}
