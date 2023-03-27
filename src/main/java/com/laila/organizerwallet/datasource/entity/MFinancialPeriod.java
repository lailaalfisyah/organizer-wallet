package com.laila.organizerwallet.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "m_financial_period")
public class MFinancialPeriod {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "date_start_every")
    private Integer dateStartEvery;
}
