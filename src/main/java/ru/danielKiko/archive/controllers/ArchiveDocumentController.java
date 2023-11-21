package ru.danielKiko.archive.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.danielKiko.archive.entities.ArchiveDocument;
import ru.danielKiko.archive.services.ArchiveDocumentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/archiveDocuments")
public class ArchiveDocumentController {

    private final ArchiveDocumentService archiveDocumentService;

    @PostMapping
    public ResponseEntity<ArchiveDocument> postObject(@RequestBody ArchiveDocument archiveDocument) {
        return new ResponseEntity<>(archiveDocumentService.postArchiveDocument(archiveDocument), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ArchiveDocument>> findAll(){
        return new ResponseEntity<>(archiveDocumentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArchiveDocument> findById(@PathVariable UUID id){
        return new ResponseEntity<>(archiveDocumentService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable UUID id){
        archiveDocumentService.deleteArchiveDocument(id);
    }


}
