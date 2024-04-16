package com.spring.jwt.Wallet.Entity;

import com.spring.jwt.entity.Status;
import com.spring.jwt.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account  {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "accountId", nullable = false)
        private Integer AccountId;

        @Column(name = "email", nullable = false, length = 250)
         private String email;

        @Column(name = "mobile_no")
        private String mobileNo;

        @Column(name = "openingBalance")
        private Integer OpeningBalance;

        @Column(name = "status")
        private String Status;

        @Column(name = "LastUpdateTime")
        private LocalDateTime LastUpdateTime;

        @OneToOne
        @JoinColumn(name = "UserId")
        private User user;


    }

