package com.materi_java.java.repository;

import com.materi_java.java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(value = "SELECT * FROM user WHERE email :=email", nativeQuery = true)
//    Optional<User> findByEmails(String email);

    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);

    Optional<User> findById(Long id);

}