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
@Table(name = "m_spending_type")
public class MSpendingType {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private MUser user;

    @Column(name = "title")
    private String title;

    @Column(name = "maximum_limit")
    private Long maxLimit;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
