package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.MSpendingType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendingTypeRepo  extends JpaRepository<MSpendingType, Long> {
}
