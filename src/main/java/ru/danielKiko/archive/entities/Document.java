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
@Table(name = "Документы")
public class Document {

    @Id
    @Column(name = "Код")
    private UUID id;

    @Column(name = "Имя")
    private String name;

    @JoinColumn(name = "Код типа")
    @ManyToOne
    private DocumentType documentType;

    @Column(name = "Содержание")
    private String content;

    @Column(name = "Дата создания")
    private Date creationDate;

    @Column(name = "Дата просрочки")
    private Date expirationDate;

}
