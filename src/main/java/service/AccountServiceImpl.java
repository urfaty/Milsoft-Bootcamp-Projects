package service;

import dto.AccountDto;
import entity.Account;
import org.springframework.stereotype.Service;
import repository.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void add(AccountDto accountDto) {
        Account account = toEntity(accountDto);
        accountRepository.save(account);
    }



    @Override
    public void change(AccountDto accountDto) {
        Account account = toEntity(accountDto);
        accountRepository.save(account);

    }

    @Override
    public void delete(long accountId) {

        accountRepository.deleteById(accountId);
    }

    @Override
    public AccountDto find(long accountId) {
        Optional<Account> optional = accountRepository.findById(accountId);
        if(optional.isPresent()) {
            return toDto(optional.get());
        }
            return null;
    }

    @Override
    public List<AccountDto> list() {
        List<AccountDto> accountDtoList = new ArrayList<>();
        for(Account account : accountRepository.findAll()) {
            accountDtoList.add(toDto(account));
        }
        return accountDtoList;
    }

    private static Account toEntity(AccountDto accountDto) {
        Account account = new Account();
        account.setAccountName(accountDto.getAccountName());
        account.setAccountId(accountDto.getAccountId());
        account.setAmountLocal(accountDto.getAmountLocal());
        return account;
    }

    private static AccountDto toDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName(account.getAccountName());
        accountDto.setAccountId(account.getAccountId());
        accountDto.setAmountLocal(account.getAmountLocal());
        return accountDto;
    }


}
