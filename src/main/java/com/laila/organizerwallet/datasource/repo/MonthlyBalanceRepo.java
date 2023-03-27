package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.TMonthlyBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyBalanceRepo  extends JpaRepository<TMonthlyBalance, Long> {
}
