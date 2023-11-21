package ru.danielKiko.archive.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.danielKiko.archive.entities.Role;
import ru.danielKiko.archive.repositories.RoleRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role postRole(Role role) {
        role.setId(UUID.randomUUID());
        return roleRepository.save(role);
    }

    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(UUID id) {
        roleRepository.deleteById(id);
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role findById(UUID id) {
        return roleRepository.findById(id).orElseThrow();
    }
}
