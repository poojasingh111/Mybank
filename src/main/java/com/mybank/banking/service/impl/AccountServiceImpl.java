package com.mybank.banking.service.impl;

import com.mybank.banking.dto.AccountDto;
import com.mybank.banking.entity.Account;
import com.mybank.banking.mapper.AccountMapper;
import com.mybank.banking.repository.AccountRepository;
import com.mybank.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public abstract class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account savedAccount= accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
