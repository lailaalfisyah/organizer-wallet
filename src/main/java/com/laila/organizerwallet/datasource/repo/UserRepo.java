package com.laila.organizerwallet.datasource.repo;

import com.laila.organizerwallet.datasource.entity.MUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<MUser, Long> {
}
