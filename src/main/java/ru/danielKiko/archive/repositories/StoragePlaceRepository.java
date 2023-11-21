package ru.danielKiko.archive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.danielKiko.archive.entities.StoragePlace;

import java.util.UUID;

@Repository
public interface StoragePlaceRepository extends JpaRepository<StoragePlace, UUID> {

}
