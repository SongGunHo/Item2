package com.its.Item.dto;

import lombok.Data;

@Data
public class RegistrarDTO {
    private Long id;
    private String registrarCompany;
    private String registrarName;
    private String registrarPhone;

    public RegistrarDTO(Long id, String registrarCompany, String registrarName, String registrarPhone) {
        this.id = id;
        this.registrarCompany = registrarCompany;
        this.registrarName = registrarName;
        this.registrarPhone = registrarPhone;
    }
}
