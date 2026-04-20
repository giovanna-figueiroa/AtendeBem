package com.atendebem.controller;

import com.atendebem.dto.PatientRequest;
import com.atendebem.dto.PatientResponse;
import com.atendebem.model.Patient;
import com.atendebem.model.SpecialCondition;
import com.atendebem.service.TriageService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pacientes")
public class TriageController {

    private final TriageService triageService;

    public TriageController(TriageService triageService) {
        this.triageService = triageService;
    }

    @PostMapping
    public ResponseEntity<PatientResponse> registerPatient(@Valid @RequestBody PatientRequest request) {
        Patient patient = new Patient(
                request.getFullName(),
                request.getAddress(),
                request.getRg(),
                request.getAge(),
                request.getSymptoms(),
                request.getPainLevel(),
                SpecialCondition.from(request.getSpecialCondition())
        );

        Patient registeredPatient = triageService.register(patient);
        return new ResponseEntity<>(toResponse(registeredPatient), HttpStatus.CREATED);
    }

    @GetMapping("/fila")
    public List<PatientResponse> getQueue() {
        return triageService.getOrderedQueue().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    private PatientResponse toResponse(Patient patient) {
        return new PatientResponse(
                patient.getId(),
                patient.getFullName(),
                patient.getAddress(),
                patient.getRg(),
                patient.getAge(),
                patient.getSymptoms(),
                patient.getPainLevel(),
                patient.getSpecialCondition().getLabel(),
                patient.getPriority(),
                patient.getPriorityLabel(),
                patient.getCreatedAt()
        );
    }
}
