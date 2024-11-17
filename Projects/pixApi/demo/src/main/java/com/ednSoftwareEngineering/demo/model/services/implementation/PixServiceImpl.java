package com.ednSoftwareEngineering.demo.model.services.implementation;

import com.ednSoftwareEngineering.demo.enums.PixKeyType;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;
import com.ednSoftwareEngineering.demo.model.entities.User;
import com.ednSoftwareEngineering.demo.model.repository.PixKeyRepository;
import com.ednSoftwareEngineering.demo.model.services.PixServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PixServiceImpl implements PixServices {
    @Autowired
    PixKeyRepository pixKeyRepository;
    @Override
    public PixKey createPixKey(PixKey pixKey) {
        return pixKeyRepository.save(pixKey);
    }

    @Override
    public Double receivePix(PixKey pixKey, Double amount) {
        return null;
    }

    @Override
    public Double sendPix(PixKey PayerpixKey, PixKey receiverPixKey, Double amount) {
        return null;
    }

    @Override
    public PixKey generateRandomPixKey(BankAccount bankAccount) {
        return null;
    }

    @Override
    public Boolean validatePixKey(PixKey pixKey) {
        return null;
    }

    @Override
    public PixKey associatePixKeyToAccount(PixKey pixKey, BankAccount bankAccount) {
        return null;
    }
}
