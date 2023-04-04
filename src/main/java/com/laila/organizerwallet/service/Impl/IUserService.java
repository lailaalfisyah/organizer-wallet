package com.laila.organizerwallet.service.Impl;

import com.laila.organizerwallet.datasource.entity.MFinancialPeriod;
import com.laila.organizerwallet.datasource.entity.MUser;
import com.laila.organizerwallet.datasource.repo.FinancialPeriodRepo;
import com.laila.organizerwallet.datasource.repo.UserRepo;
import com.laila.organizerwallet.model.TableCodeConstant;
import com.laila.organizerwallet.model.user.RegisterReq;
import com.laila.organizerwallet.service.GenerateIdService;
import com.laila.organizerwallet.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IUserService implements UserService {
    private final FinancialPeriodRepo financialPeriodRepo;
    private final UserRepo userRepo;
    private final GenerateIdService generateIdService;

    public IUserService(FinancialPeriodRepo financialPeriodRepo, UserRepo userRepo, GenerateIdService generateIdService) {
        this.financialPeriodRepo = financialPeriodRepo;
        this.userRepo = userRepo;
        this.generateIdService = generateIdService;
    }

    @Override
    public void register(RegisterReq registerReq) {
        if (registerReq.getFullname().isBlank()) {
            throw new IllegalArgumentException("Nama lengkap harus diisi.");
        }

        if (registerReq.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email harus diisi.");
        }

        if (registerReq.getPassword().isBlank() || registerReq.getPassword().length() < 6) {
            throw new IllegalArgumentException("Password harus diisi dengan minimal 6 karakter.");
        }

        if (registerReq.getFinancialPeriodDate() == null) {
            throw new IllegalArgumentException("Tanggal periode keuangan harus diisi.");
        }

        Optional<MUser> users = userRepo.findByEmail(registerReq.getEmail());
        if (users.isPresent()) {
            throw new IllegalArgumentException("Email tersebut sudah pernah dipakai.");
        }

        Optional<MFinancialPeriod> financialPeriod = financialPeriodRepo.findById(registerReq.getFinancialPeriodDate());
        MUser user = new MUser();
//        user.setId(generateIdService.generateId("m_user", TableCodeConstant.M_USER));
        user.setFullname(registerReq.getFullname());
        user.setEmail(registerReq.getEmail());
        user.setPassword(registerReq.getPassword());
        user.setFinancialPeriod(financialPeriod.get());
        userRepo.save(user);
    }
}
