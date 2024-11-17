package com.ednSoftwareEngineering.demo.model.repository;

import com.ednSoftwareEngineering.demo.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
