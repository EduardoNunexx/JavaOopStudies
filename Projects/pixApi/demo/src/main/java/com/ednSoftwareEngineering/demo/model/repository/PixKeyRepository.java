package com.ednSoftwareEngineering.demo.model.repository;

import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixKeyRepository extends JpaRepository<PixKey,String> {
}
