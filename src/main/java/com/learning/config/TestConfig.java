package com.learning.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.learning.course.entities.User;
import com.learning.repositories.UserRepository;

@Configuration
@Profile("test") // Define o perfil que será utilizado
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("TestConfig is running"); // Adicione um log para verificar
        User u1 = new User(null, "Maria", "maria@gmail.com", "998887766", "12345");
        User u2 = new User(null, "Carlos", "carlos@gmail.com", "99833887766", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
