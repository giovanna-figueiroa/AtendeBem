package com.atendebem.service;

import com.atendebem.model.Patient;
import com.atendebem.model.SpecialCondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TriageServiceTest {

    private TriageService triageService;

    @BeforeEach
    void setUp() {
        triageService = new TriageService();
    }

    @Test
    void shouldAssignHigherPriorityForSeverePain() {
        Patient patient = new Patient("João Silva", "Rua A", "12345678", 30, "Dor no peito", 9, SpecialCondition.NONE);
        int priority = triageService.calculatePriority(patient);

        Assertions.assertEquals(3, priority);
    }

    @Test
    void shouldAssignPriorityBonusForSpecialCondition() {
        Patient patient = new Patient("Maria Souza", "Rua B", "87654321", 25, "Tontura", 4, SpecialCondition.PREGNANT);
        int priority = triageService.calculatePriority(patient);

        Assertions.assertEquals(2, priority);
    }

    @Test
    void shouldOrderQueueByPriorityThenCreatedAt() {
        Patient first = new Patient("Paciente A", "Rua X", "11111111", 50, "Febre", 10, SpecialCondition.NONE);
        Patient second = new Patient("Paciente B", "Rua Y", "22222222", 60, "Cólica", 6, SpecialCondition.ELDERLY);
        Patient third = new Patient("Paciente C", "Rua Z", "33333333", 40, "Dor de cabeça", 3, SpecialCondition.NONE);

        triageService.register(second);
        triageService.register(third);
        triageService.register(first);

        List<Patient> queue = triageService.getOrderedQueue();

        Assertions.assertEquals("Paciente A", queue.get(0).getFullName());
        Assertions.assertEquals("Paciente B", queue.get(1).getFullName());
        Assertions.assertEquals("Paciente C", queue.get(2).getFullName());
    }
}
