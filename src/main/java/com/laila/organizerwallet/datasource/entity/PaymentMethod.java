package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "m_financial_period")
public class PaymentMethod {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "date_start_every")
    private Integer dateStartEvery;
}
