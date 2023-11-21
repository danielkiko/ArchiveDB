package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.ArchiveDocument;
import ru.danielKiko.archive.repositories.ArchiveDocumentRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArchiveDocumentService {

    private final ArchiveDocumentRepository archiveDocumentRepository;

    public ArchiveDocument postArchiveDocument(ArchiveDocument archiveDocument) {
        archiveDocument.setId(UUID.randomUUID());
        return archiveDocumentRepository.save(archiveDocument);
    }

    public ArchiveDocument updateArchiveDocument(ArchiveDocument archiveDocument) {
        return archiveDocumentRepository.save(archiveDocument);
    }

    public void deleteArchiveDocument(UUID id) {
        archiveDocumentRepository.deleteById(id);
    }

    public List<ArchiveDocument> findAll() {
        return archiveDocumentRepository.findAll();
    }

    public ArchiveDocument findById(UUID id) {
        return archiveDocumentRepository.findById(id).orElseThrow();
    }
}
