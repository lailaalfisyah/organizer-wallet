package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_monthly_balance")
public class TMonthlyBalance {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private MUser user;

    @Column(name = "income_amount")
    private Long incomeAmount;

    @Column(name = "spending_amount")
    private Long spendingAmount;

    @Column(name = "overall_balance")
    private Long overallBalance;

    @Column(name = "start_period_date")
    private Date startPeriodDate;

    @Column(name = "end_period_date")
    private Date endPeriodDate;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
