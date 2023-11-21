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
import ru.danielKiko.archive.entities.Role;
import ru.danielKiko.archive.entities.StoragePlace;
import ru.danielKiko.archive.services.StoragePlaceService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/storagePlaces")
public class StoragePlaceController {
    private final StoragePlaceService storagePlaceService;

    @PostMapping
    public ResponseEntity<StoragePlace> postObject(@RequestBody StoragePlace storagePlace) {
        return new ResponseEntity<>(storagePlaceService.postStoragePlace(storagePlace), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<StoragePlace>> findAll(){
        return new ResponseEntity<>(storagePlaceService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StoragePlace> findById(@PathVariable UUID id){
        return new ResponseEntity<>(storagePlaceService.findById(id), HttpStatus.OK);
    }
}
