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

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Архивные записи")
public class ArchiveDocument {

    @Id
    @Column(name = "Код")
    private UUID id;

    @JoinColumn(name = "Код документа")
    @ManyToOne
    private Document document;

    @JoinColumn(name = "Код сотрудника")
    @ManyToOne
    private Employee employee;

    @JoinColumn(name = "Код места хранения")
    @ManyToOne
    private StoragePlace storagePlace;

    @Column(name = "Дата начала хранения")
    private Date creationDate;

    @Column(name = "Дата окончания хранения")
    private Date expirationDate;


}
