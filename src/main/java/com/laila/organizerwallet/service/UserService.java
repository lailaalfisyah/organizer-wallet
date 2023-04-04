package com.laila.organizerwallet.service;

import com.laila.organizerwallet.model.user.RegisterReq;
import org.springframework.data.domain.Page;

public interface UserService {
    void register(RegisterReq registerReq);
//    Page
}
