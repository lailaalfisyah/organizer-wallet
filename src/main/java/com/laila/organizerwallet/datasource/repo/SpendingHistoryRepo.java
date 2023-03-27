package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.TSpendingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendingHistoryRepo  extends JpaRepository<TSpendingHistory, Long> {
}
