package com.laila.organizerwallet.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class GenerateIdService {
    private final EntityManager entityManager;

    public GenerateIdService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String generateId(String table, String tableCode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String dateNow = sdf.format(Calendar.getInstance().getTime());

        String query = "SELECT COUNT(id) FROM :table WHERE id like CONCAT('%', :dateNow, '%')";
        Query countId = entityManager.createNativeQuery(query)
                .setParameter("table", table)
                .setParameter("dateNow", dateNow);
        Integer incrementId = countId.getFirstResult() + 1;

        String incrementNumber = incrementId.toString();
        if (incrementNumber.length() == 1) {
            incrementNumber = "00" + incrementId;
        } else if (incrementNumber.length() == 2) {
            incrementNumber = "0" + incrementId;
        } else if (incrementId.toString().length() > 3) {
            throw new IllegalArgumentException("Registrasi hari ini sudah mencapai limit.");
        }

        String id = tableCode + "-" + dateNow + incrementNumber;
        return id;
    }
}
