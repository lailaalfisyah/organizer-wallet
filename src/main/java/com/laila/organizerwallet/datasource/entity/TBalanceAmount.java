package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_balance_amount")
public class TBalanceAmount {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private MUser user;

    @Column(name = "deposit")
    private Long deposit;

    @Column(name = "remaining_budget")
    private Long remaining_budget;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
