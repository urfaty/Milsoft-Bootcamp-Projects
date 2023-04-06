package service;

import dto.AccountDto;
import entity.Account;

import java.util.List;

public interface AccountService {

    void add(AccountDto accountDto);
    void change(AccountDto accountDto);
    void delete(long accountId);
    AccountDto find(long accountId);

    List<AccountDto> list();
}
