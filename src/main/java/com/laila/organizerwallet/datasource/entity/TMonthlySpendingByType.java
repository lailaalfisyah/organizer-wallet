package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_monthly_spending_by_type")
public class TMonthlySpendingByType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "m_user")
    private MUser user;

    @ManyToOne
    @JoinColumn(name = "spending_type_id")
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
