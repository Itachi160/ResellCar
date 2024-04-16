package com.spring.jwt.Wallet.Controller;
import com.spring.jwt.Wallet.Dto.TransactionDTO;
import com.spring.jwt.Wallet.Interface.TransactionService;
import com.spring.jwt.dto.ResponseDto;
import com.spring.jwt.exception.InsufficientBalanceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/credit/{accountId}")
    public ResponseEntity<ResponseDto> creditAccount(@PathVariable("accountId") Integer accountId, @RequestParam("amount") Double amount) {
        try {
            TransactionDTO transactionDTO = transactionService.credit(accountId, amount);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("Success", "Transaction processed successfully"));
        } catch (InsufficientBalanceException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDto("Error", e.getMessage()));
        }
    }

    @PostMapping("/debit/{accountId}")
    public ResponseEntity<ResponseDto> debitAccount(@PathVariable("accountId") Integer accountId, @RequestParam("amount") Double amount) {
        try {
            TransactionDTO transactionDTO = transactionService.debit(accountId, amount);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("Success", "Transaction processed successfully"));
        } catch (InsufficientBalanceException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDto("Error", e.getMessage()));
        }
    }

    @PostMapping("/withdraw/{accountId}")
    public ResponseEntity<ResponseDto> withdrawFromAccount(@PathVariable("accountId") Integer accountId, @RequestParam("amount") Double amount) {
        try {
            TransactionDTO transactionDTO = transactionService.withdraw(accountId, amount);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("Success", "Transaction processed successfully"));
        } catch (InsufficientBalanceException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDto("Error", e.getMessage()));
        }
    }
}




