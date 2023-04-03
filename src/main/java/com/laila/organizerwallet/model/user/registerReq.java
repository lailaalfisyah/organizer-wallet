package com.laila.organizerwallet.model.user;

import lombok.Data;

@Data
public class registerReq {
    private String fullname;
    private String email;
    private String password;
    private Integer financialPeriodDate;
}
