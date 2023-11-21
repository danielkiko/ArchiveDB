package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.ArchiveDocument;
import ru.danielKiko.archive.entities.Document;
import ru.danielKiko.archive.repositories.DocumentRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public Document postDocument(Document document) {
        document.setId(UUID.randomUUID());
        return documentRepository.save(document);
    }

    public Document updateDocument(Document document) {
        return documentRepository.save(document);
    }

    public void deleteDocument(UUID id) {
        documentRepository.deleteById(id);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document findById(UUID id) {
        return documentRepository.findById(id).orElseThrow();
    }
}
