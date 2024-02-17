package br.senai.sc.tasksapitests.model.transport.operations.create;

import jakarta.validation.constraints.NotBlank;

public record CreatePersonForm(@NotBlank String name,
                               @NotBlank String email,
                               @NotBlank String password) {
}
