package service.impl;

import model.Role;
import model.RoleName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRoleRepository;
import service.IRoleService;

import java.util.Optional;

public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository repository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return repository.findByName(name);
    }
}
