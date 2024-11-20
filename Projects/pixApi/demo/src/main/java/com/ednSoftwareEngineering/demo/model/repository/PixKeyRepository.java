package com.ednSoftwareEngineering.demo.model.repository;

import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PixKeyRepository extends JpaRepository<PixKey,String> {
    Optional<PixKey> findByKeyValue(String keyValue);
}
