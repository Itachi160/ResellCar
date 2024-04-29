package com.spring.jwt.service;

import com.spring.jwt.Interfaces.CarVerify;
import com.spring.jwt.dto.CarVerifyDto;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.CarVerified;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.CarNotFoundException;
import com.spring.jwt.exception.UserNotFoundExceptions;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.CarVerifyRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VerifyCarServiceImpl implements CarVerify {

    public final CarRepo carRepo;

    public final CarVerifyRepo carVerifyRepo;

    public final UserRepository userRepository;

    @Override
    public CarVerifyDto verifyCar(CarVerifyDto carVerifyDto, Integer carId) {
        return null;
    }

    @Override
    public CarVerifyDto getVerifiedCar(Integer carVerifiedId) {
        return null;
    }

    @Override
    public List<CarVerifyDto> getCarByUserId(Integer userId) {
        return List.of();
    }

    @Override
    public List<CarVerifyDto> getByCarId(Integer carId) {
        return List.of();
    }
}
