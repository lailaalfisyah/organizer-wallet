package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.MFinancialPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialPeriodRepo extends JpaRepository<MFinancialPeriod, Integer> {
}
