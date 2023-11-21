package ru.danielKiko.archive.searchCriterias;

import lombok.Getter;
import lombok.Setter;
import ru.danielKiko.archive.entities.DocumentType;

import java.util.Date;

@Getter
@Setter
public class DocumentSearchCriteria {

    private String name;

    private DocumentType documentType;

    private String content;

    private Date creationDate;

    private Date expirationDate;
}
