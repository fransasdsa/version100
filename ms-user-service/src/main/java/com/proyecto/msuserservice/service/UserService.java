package com.proyecto.msuserservice.service;

import com.proyecto.msuserservice.model.User;
import com.proyecto.msuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    public Mono<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<Void> deleteUser(Long id) {
        return userRepository.deleteById(id);
    }

    public Mono<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
