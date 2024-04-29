package com.spring.jwt.service;

import com.spring.jwt.Interfaces.BeadingCarService;
import com.spring.jwt.dto.BeadingCAR.BeadingCARDto;
import com.spring.jwt.entity.BeadingCAR;
import com.spring.jwt.exception.BeadingCarNotFoundException;
import com.spring.jwt.repository.BeadingCarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class BeadingCarServiceImpl implements BeadingCarService {

    private final BeadingCarRepo beadingCarRepo;

    @Override
    public String AddBCar(BeadingCARDto beadingCARDto) {
        BeadingCAR beadingCAR = new  BeadingCAR(beadingCARDto);
        beadingCarRepo.save(beadingCAR);
        return "beadingCAR added";
    }

    @Override
    public String editCarDetails(BeadingCARDto beadingCARDto, Integer beadingCarId) {
        return "";
    }

    @Override
    public List<BeadingCARDto> getAllBeadingCars() {
        return List.of();
    }

    @Override
    public String deleteBCar(Integer beadingCarId) {
        return "";
    }

    @Override
    public BeadingCARDto getBCarById(Integer beadingCarId) {
        return null;
    }

    @Override
    public List<BeadingCARDto> getByUserId(int UserId) {
        return List.of();
    }


}
