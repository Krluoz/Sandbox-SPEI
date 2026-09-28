package org.javabugs.sandbox.service;

import org.javabugs.sandbox.model.User;
import org.javabugs.sandbox.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    //Inyeccion de dependencias


    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user){
        //Encriptacion de contraseña
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword((encryptedPassword));
        return userRepository.save(user);
    }
}
