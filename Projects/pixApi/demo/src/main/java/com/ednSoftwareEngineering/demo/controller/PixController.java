package com.ednSoftwareEngineering.demo.controller;

import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.repository.PixKeyRepository;
import com.ednSoftwareEngineering.demo.model.services.PixServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pix")
public class PixController {
    @Autowired
    PixServices pixServices;
    @PostMapping()
    public ResponseEntity<PixKey> createPixKey(@RequestBody @Valid PixKey pixKey){
        PixKey pixKeyCreated =pixServices.createPixKey(pixKey);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pixKeyCreated.getKeyValue()).toUri();
        return ResponseEntity.created(location).body(pixKeyCreated);
    }

}
