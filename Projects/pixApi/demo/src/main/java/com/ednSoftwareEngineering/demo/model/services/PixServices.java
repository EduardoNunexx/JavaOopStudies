package com.ednSoftwareEngineering.demo.model.services;

import com.ednSoftwareEngineering.demo.enums.PixKeyType;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.PixKey;

public interface PixServices {
    public PixKey createPixKey(PixKey pixKey);
    public Double receivePix(PixKey pixKey, Double amount);
    public Double sendPix(PixKey PayerpixKey,PixKey receiverPixKey,Double amount);
    public PixKey generateRandomPixKey(BankAccount bankAccount);
    public Boolean validatePixKey(PixKey pixKey);
    public PixKey associatePixKeyToAccount(PixKey pixKey, BankAccount bankAccount);

}
