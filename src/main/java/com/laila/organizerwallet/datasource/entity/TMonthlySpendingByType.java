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
@Table(name = "t_monthly_spending_by_type")
public class TMonthlySpendingByType {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private MUser user;

    @Column(name = "spending_type_id")
    private MSpendingType spendingType;

    @Column(name = "spending_amount")
    private Long spendingAmount;

    @Column(name = "balance")
    private Long balance;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
