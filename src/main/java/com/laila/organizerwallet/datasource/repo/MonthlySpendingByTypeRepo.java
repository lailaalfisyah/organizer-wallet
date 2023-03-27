package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.TMonthlySpendingByType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlySpendingByTypeRepo  extends JpaRepository<TMonthlySpendingByType, Long> {
}
