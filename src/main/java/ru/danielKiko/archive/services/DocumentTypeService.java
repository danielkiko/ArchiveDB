package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.Document;
import ru.danielKiko.archive.entities.DocumentType;
import ru.danielKiko.archive.repositories.DocumentTypeRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DocumentTypeService {

    private final DocumentTypeRepository documentTypeRepository;

    public DocumentType postDocumentType(DocumentType documentType) {
        documentType.setId(UUID.randomUUID());
        return documentTypeRepository.save(documentType);
    }

    public DocumentType updateDocumentType(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    public void deleteDocumentType(UUID id) {
        documentTypeRepository.deleteById(id);
    }

    public List<DocumentType> findAll() {
        return documentTypeRepository.findAll();
    }

    public DocumentType findById(UUID id) {
        return documentTypeRepository.findById(id).orElseThrow();
    }
}
