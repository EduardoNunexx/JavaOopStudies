package com.ednSoftwareEngineering.demo.mapper;

import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsResponseDto;
import com.ednSoftwareEngineering.demo.dto.transactions.TransactionsSaveDto;
import com.ednSoftwareEngineering.demo.model.entities.BankAccount;
import com.ednSoftwareEngineering.demo.model.entities.Transactions;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransactionsMapper {
    public TransactionsResponseDto toResponseDto(Transactions transaction) {
        if(transaction.getSourceAccount()==null){
            transaction.setSourceAccount(new BankAccount());
        }
        return new TransactionsResponseDto
                (
                transaction.getId(),
                transaction.getSourceAccount().getId(),
                transaction.getDestinationAccount().getId(),
                transaction.getAmount(),
                transaction.getTimestamp(),
                transaction.getDescription()
        );
    }
    public Transactions toEntity(TransactionsSaveDto transactionsSaveDto){
        return new Transactions(
                transactionsSaveDto.sourceAccount(),
                transactionsSaveDto.destinationAccount(),
                transactionsSaveDto.amount(),
                transactionsSaveDto.timestamp(),
                transactionsSaveDto.description()
               );
    }
}
