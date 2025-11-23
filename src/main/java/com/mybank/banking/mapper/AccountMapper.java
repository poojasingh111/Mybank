package com.mybank.banking.mapper;

import com.mybank.banking.dto.AccountDto;
import com.mybank.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(
                accountDto.getId(),
                accountDto.getCusName(),
                accountDto.getBalance()
        );

        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getCusName(),
                account.getBalance()
        );
        return accountDto;

    }
}
