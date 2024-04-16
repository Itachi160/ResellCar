package com.spring.jwt.Wallet.Controller;


import com.spring.jwt.Wallet.Dto.CreateWalletAccountDTO;
import com.spring.jwt.Wallet.Dto.WalletAccountDTO;
import com.spring.jwt.Wallet.Interface.AccountService;
import com.spring.jwt.dto.ResponseDto;
import com.spring.jwt.exception.AccountAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("WalletAccount")
public class AccountControllers {
    private final AccountService accountService;

    public AccountControllers(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<WalletAccountDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public WalletAccountDTO getAccountById(@PathVariable(value = "id") Integer accountId) {
        return accountService.getAccountById(accountId);
    }

    @PostMapping
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CreateWalletAccountDTO requestDTO) {
        ResponseDto response = new ResponseDto();
        try {
            WalletAccountDTO accountDTO = new WalletAccountDTO();
            accountDTO.setPanCard(requestDTO.getPanCard());
            accountDTO.setUserId(requestDTO.getUserId());
            accountDTO.setStatus(requestDTO.getStatus());
            accountDTO.setOpeningBalance(requestDTO.getOpeningBalance());

            // If you want to set LastUpdateTime to current time, you can do it here
            accountDTO.setLastUpdateTime(LocalDateTime.now());

            WalletAccountDTO createdAccount = accountService.createAccount(accountDTO);
            response.setStatus("success");
            response.setMessage("Account created successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (AccountAlreadyExistsException e) {
            response.setStatus("error");
            response.setMessage("Account Already Exists by user id");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }


    @PutMapping("/{id}")
    public WalletAccountDTO updateAccount(@PathVariable(value = "id") Integer accountId,
                                    @RequestBody WalletAccountDTO accountDTO) {
        return accountService.updateAccount(accountId, accountDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable(value = "id") Integer accountId) {
        accountService.deleteAccount(accountId);
        return ResponseEntity.ok().build();
    }
}