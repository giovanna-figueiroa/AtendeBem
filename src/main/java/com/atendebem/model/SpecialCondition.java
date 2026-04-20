package com.atendebem.model;

public enum SpecialCondition {
    NONE("Nenhuma"),
    ELDERLY("Idoso"),
    PREGNANT("Gestante"),
    DISABLED("Deficiente");

    private final String label;

    SpecialCondition(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static SpecialCondition from(String value) {
        if (value == null || value.isBlank()) {
            return NONE;
        }

        String normalized = value.trim().toLowerCase();
        return switch (normalized) {
            case "idoso", "idosa", "idoso(a)" -> ELDERLY;
            case "gestante" -> PREGNANT;
            case "deficiente", "pessoa com deficiencia", "deficiência" -> DISABLED;
            case "nao", "não", "nenhuma", "nenhum" -> NONE;
            default -> NONE;
        };
    }
}
