package service;

import model.User;

import java.util.Optional;

public interface IUserService {
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Iterable<User> findUserByNameContaining(String user_name);
    Optional<User> findByUsername(String username);
    User save(User user);
}
