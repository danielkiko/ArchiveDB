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
import ru.danielKiko.archive.services.RoleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<Role> postObject(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.postRole(role), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Role>> findAll(){
        return new ResponseEntity<>(roleService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> findById(@PathVariable UUID id){
        return new ResponseEntity<>(roleService.findById(id), HttpStatus.OK);
    }
}
