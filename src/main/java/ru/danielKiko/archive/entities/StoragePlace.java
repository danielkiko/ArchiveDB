package ru.danielKiko.archive.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Места хранения")
public class StoragePlace {

    @Id
    @Column(name = "Код")
    private UUID id;

    @Column(name = "Наименование")
    private String name;

    @Column(name = "Адрес")
    private String address;
}
