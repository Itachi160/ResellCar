package com.spring.jwt.service;

import com.spring.jwt.Interfaces.DealerService;
import com.spring.jwt.dto.ChangePasswordDto;
import com.spring.jwt.dto.DealerDto;
import com.spring.jwt.dto.RegisterDto;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Dealer;
import com.spring.jwt.entity.Status;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.DealerRepository;
import com.spring.jwt.repository.RoleRepository;
import com.spring.jwt.repository.UserRepository;
import com.spring.jwt.utils.BaseResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DealerServiceImpl implements DealerService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;
    @Autowired
    private DealerRepository dealerRepository;
    @Autowired
    private CarRepo carRepo;
    private final BCryptPasswordEncoder passwordEncoder;


    @Override
    public BaseResponseDTO updateDealer(Integer userId, RegisterDto registerDto) {
        return null;
    }

    @Override
    public List<DealerDto> getAllDealers(int pageNo) {
        return List.of();
    }

    @Override
    public DealerDto getDealerById(Integer dealerId) {
        return null;
    }

    @Override
    public BaseResponseDTO deleteDealer(Integer dealerId) {
        return null;
    }

    @Override
    public BaseResponseDTO changePassword(Integer dealerId, ChangePasswordDto changePasswordDto) {
        return null;
    }

    @Override
    public int getDealerIdByEmail(String email) {
        return 0;
    }

    @Override
    public void updateStatus(Integer dealerId, Boolean status) {

    }
}

