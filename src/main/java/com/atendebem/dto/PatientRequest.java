package com.atendebem.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PatientRequest {

    @NotBlank(message = "Nome completo é obrigatório")
    private String fullName;

    @NotBlank(message = "Endereço é obrigatório")
    private String address;

    @NotBlank(message = "RG é obrigatório")
    @Pattern(regexp = "\\d{4,}", message = "RG deve conter apenas números e ao menos 4 dígitos")
    private String rg;

    @Min(value = 0, message = "Idade deve ser maior ou igual a 0")
    @Max(value = 120, message = "Idade deve ser menor ou igual a 120")
    private int age;

    @NotBlank(message = "Sintomas são obrigatórios")
    private String symptoms;

    @Min(value = 1, message = "Nível de dor deve ser entre 1 e 10")
    @Max(value = 10, message = "Nível de dor deve ser entre 1 e 10")
    private int painLevel;

    @NotBlank(message = "Condição especial é obrigatória")
    @Pattern(regexp = "(?i)^(idoso|idosa|gestante|deficiente|nao|não|nenhuma|nenhum)$",
             message = "Condição especial deve ser Idoso, Gestante, Deficiente ou nao")
    private String specialCondition;

    public PatientRequest() {
    }

    public PatientRequest(String fullName, String address, String rg, int age, String symptoms, int painLevel, String specialCondition) {
        this.fullName = fullName;
        this.address = address;
        this.rg = rg;
        this.age = age;
        this.symptoms = symptoms;
        this.painLevel = painLevel;
        this.specialCondition = specialCondition;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public String getSpecialCondition() {
        return specialCondition;
    }

    public void setSpecialCondition(String specialCondition) {
        this.specialCondition = specialCondition;
    }
}
