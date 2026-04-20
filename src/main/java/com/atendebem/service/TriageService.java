package com.atendebem.service;

import com.atendebem.model.Patient;
import com.atendebem.model.SpecialCondition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TriageService {

    private final List<Patient> patients = new ArrayList<>();

    public Patient register(Patient patient) {
        int priority = calculatePriority(patient);
        patient.setPriority(priority);
        patient.setPriorityLabel(getPriorityLabel(priority));

        patients.add(patient);
        return patient;
    }

    public List<Patient> getOrderedQueue() {
        return patients.stream()
                .sorted(Comparator.comparingInt(Patient::getPriority).reversed()
                        .thenComparing(Comparator.comparingInt(Patient::getPainLevel).reversed())
                        .thenComparing(Patient::getCreatedAt))
                .collect(Collectors.toList());
    }

    public int calculatePriority(Patient patient) {
        int priority = 1;

        if (patient.getPainLevel() >= 5 && patient.getPainLevel() <= 7) {
            priority += 1;
        } else if (patient.getPainLevel() >= 8) {
            priority += 2;
        }

        SpecialCondition condition = patient.getSpecialCondition();
        if (condition == SpecialCondition.ELDERLY || condition == SpecialCondition.PREGNANT || condition == SpecialCondition.DISABLED) {
            priority += 1;
        }

        if (patient.getAge() >= 65 && condition == SpecialCondition.NONE) {
            priority += 1;
        }

        if (priority > 5) {
            priority = 5;
        }

        return priority;
    }

    private String getPriorityLabel(int priority) {
        return switch (priority) {
            case 1 -> "Não urgente";
            case 2 -> "Pouco urgente";
            case 3 -> "Urgente";
            case 4 -> "Muito urgente";
            case 5 -> "Emergência";
            default -> "Não urgente";
        };
    }
}
