package com.github.egnaf.aas.repositories;

import com.github.egnaf.aas.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Optional<UserModel> findByUsername(String username);

    void deleteByUsername(String username);
}
