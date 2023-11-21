package ru.danielKiko.archive.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Сотрудники")
public class Employee {

    @Id
    @Column(name = "Код")
    private UUID id;

    @JoinColumn(name = "Код должности")
    @ManyToOne
    private Role role;

    @Column(name = "Фамилия")
    private String surname;

    @Column(name = "Имя")
    private String name;

    @Column(name = "Отчество")
    private String patronymic;

    @Column(name = "E-mail")
    private String email;

    @Column(name = "Пароль")
    private String password;

    @Column(name = "Номер телефона")
    private String telephoneNumber;
}
