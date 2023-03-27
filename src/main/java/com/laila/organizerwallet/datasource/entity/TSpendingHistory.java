package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_spending_history")
public class TSpendingHistory {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "m_user")
    private MUser user;

    @ManyToOne
    @JoinColumn(name = "spending_type_id")
    private MSpendingType spendingType;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private MPaymentMethod paymentMethod;

    @Column(name = "spending_amount")
    private Long spendingAmount;

    @Column(name = "description")
    private String desc;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
