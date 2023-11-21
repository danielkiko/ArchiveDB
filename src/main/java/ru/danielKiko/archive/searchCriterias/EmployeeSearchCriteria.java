package ru.danielKiko.archive.searchCriterias;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import ru.danielKiko.archive.entities.Role;

import java.util.UUID;

@Getter
@Setter
public class EmployeeSearchCriteria {

    private UUID id;

    private Role role;

    private String surname;

    private String name;

    private String patronymic;

    private String email;

    private String password;

    private String telephoneNumber;
}
