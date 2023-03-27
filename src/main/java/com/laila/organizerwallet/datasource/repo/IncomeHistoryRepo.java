package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.TIncomeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeHistoryRepo  extends JpaRepository<TIncomeHistory, Long> {
}
