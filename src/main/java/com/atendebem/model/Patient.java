package com.atendebem.model;

import java.time.Instant;
import java.util.UUID;

public class Patient {
    private final UUID id;
    private String fullName;
    private String address;
    private String rg;
    private int age;
    private String symptoms;
    private int painLevel;
    private SpecialCondition specialCondition;
    private int priority;
    private String priorityLabel;
    private final Instant createdAt;

    public Patient(String fullName,
                   String address,
                   String rg,
                   int age,
                   String symptoms,
                   int painLevel,
                   SpecialCondition specialCondition) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.address = address;
        this.rg = rg;
        this.age = age;
        this.symptoms = symptoms;
        this.painLevel = painLevel;
        this.specialCondition = specialCondition;
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
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

    public SpecialCondition getSpecialCondition() {
        return specialCondition;
    }

    public void setSpecialCondition(SpecialCondition specialCondition) {
        this.specialCondition = specialCondition;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPriorityLabel() {
        return priorityLabel;
    }

    public void setPriorityLabel(String priorityLabel) {
        this.priorityLabel = priorityLabel;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
