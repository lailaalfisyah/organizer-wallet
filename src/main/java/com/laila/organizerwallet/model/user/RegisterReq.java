package com.laila.organizerwallet.model.user;

import lombok.Data;

@Data
public class RegisterReq {
    private String fullname;
    private String email;
    private String password;
    private Integer financialPeriodDate;
}
