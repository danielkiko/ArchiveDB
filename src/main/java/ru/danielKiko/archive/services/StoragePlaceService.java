package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.Role;
import ru.danielKiko.archive.entities.StoragePlace;
import ru.danielKiko.archive.repositories.StoragePlaceRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StoragePlaceService {

    private final StoragePlaceRepository storagePlaceRepository;

    public StoragePlace postStoragePlace(StoragePlace storagePlace) {
        storagePlace.setId(UUID.randomUUID());
        return storagePlaceRepository.save(storagePlace);
    }

    public StoragePlace updateStoragePlace(StoragePlace storagePlace) {
        return storagePlaceRepository.save(storagePlace);
    }

    public void deleteStoragePlace(UUID id) {
        storagePlaceRepository.deleteById(id);
    }

    public List<StoragePlace> findAll() {
        return storagePlaceRepository.findAll();
    }

    public StoragePlace findById(UUID id) {
        return storagePlaceRepository.findById(id).orElseThrow();
    }
}
