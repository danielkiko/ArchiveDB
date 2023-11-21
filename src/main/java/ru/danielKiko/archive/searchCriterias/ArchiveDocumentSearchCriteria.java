package ru.danielKiko.archive.searchCriterias;

import lombok.Getter;
import lombok.Setter;
import ru.danielKiko.archive.entities.Document;
import ru.danielKiko.archive.entities.Employee;
import ru.danielKiko.archive.entities.StoragePlace;

import java.util.Date;

@Getter
@Setter
public class ArchiveDocumentSearchCriteria {

    private Document document;

    private Employee employee;

    private StoragePlace storagePlace;

    private Date creationDate;

    private Date expirationDate;
}
