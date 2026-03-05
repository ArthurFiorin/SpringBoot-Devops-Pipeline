package com.devops.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(
        @NotBlank(message = "O nome não pode estar em branco")
        @Size(min = 3, message = "O nome deve ter pelo menos 3 caracteres")
        String name,

        @NotBlank(message = "O email não pode estar em branco")
        @Email(message = "Formato de email inválido")
        String email
) {}