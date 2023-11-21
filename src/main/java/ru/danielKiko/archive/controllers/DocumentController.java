package ru.danielKiko.archive.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.danielKiko.archive.entities.Document;
import ru.danielKiko.archive.services.DocumentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping
    public ResponseEntity<Document> postObject(@RequestBody Document document) {
        return new ResponseEntity<>(documentService.postDocument(document), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Document>> findAll(){
        return new ResponseEntity<>(documentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Document> findById(@PathVariable UUID id){
        return new ResponseEntity<>(documentService.findById(id), HttpStatus.OK);
    }
}
