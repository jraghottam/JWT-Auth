package com.example.demo.Repository;

import com.example.demo.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<users, Integer> {
    Optional<users> findByEmail(String email);
}