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
import ru.danielKiko.archive.entities.DocumentType;
import ru.danielKiko.archive.services.DocumentTypeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/documentTypes")
public class DocumentTypeController {

    private final DocumentTypeService documentTypeService;

    @PostMapping
    public ResponseEntity<DocumentType> postObject(@RequestBody DocumentType DocumentType) {
        return new ResponseEntity<>(documentTypeService.postDocumentType(DocumentType), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DocumentType>> findAll(){
        return new ResponseEntity<>(documentTypeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentType> findById(@PathVariable UUID id){
        return new ResponseEntity<>(documentTypeService.findById(id), HttpStatus.OK);
    }
}
