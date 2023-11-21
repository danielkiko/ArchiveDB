package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.DocumentType;
import ru.danielKiko.archive.entities.Employee;
import ru.danielKiko.archive.repositories.EmploeeRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmploeeRepository emploeeRepository;

    public Employee postEmployee(Employee employee) {
        employee.setId(UUID.randomUUID());
        return emploeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return emploeeRepository.save(employee);
    }

    public void deleteEmployee(UUID id) {
        emploeeRepository.deleteById(id);
    }

    public List<Employee> findAll() {
        return emploeeRepository.findAll();
    }

    public Employee findById(UUID id) {
        return emploeeRepository.findById(id).orElseThrow();
    }
}
