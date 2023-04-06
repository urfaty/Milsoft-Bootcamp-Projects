package rest;

import dto.AccountDto;
import org.springframework.web.bind.annotation.*;
import service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("/add")
    public long addAccount(AccountDto accountDto) {
        accountService.add(accountDto);
        return accountDto.getAccountId();
    }

    @PutMapping("/update")
    public void updateAccount(AccountDto accountDto) {
        accountService.change(accountDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable("id") long accountId) {
        accountService.delete(accountId);
    }


    @GetMapping("/get/{id}")
    public AccountDto getAccount(@PathVariable("id") long accountId) {
        return accountService.find(accountId);
    }

    @GetMapping("/list")
    public List<AccountDto> getAccounts() {
        return accountService.list();
    }



}
