package com.spring.jwt.service;

import com.spring.jwt.Interfaces.BidCarsService;
import com.spring.jwt.dto.BeadingCAR.BeadingCARDto;
import com.spring.jwt.dto.BidCarsDTO;
import com.spring.jwt.dto.BidDetailsDTO;
import com.spring.jwt.dto.ResDtos;
import com.spring.jwt.entity.BeadingCAR;
import com.spring.jwt.entity.BidCars;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.BeadingCarNotFoundException;
import com.spring.jwt.exception.UserNotFoundExceptions;
import com.spring.jwt.repository.BeadingCarRepo;
import com.spring.jwt.repository.BidCarsRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BidCarsServiceImpl implements BidCarsService {

    private final ModelMapper modelMapper;

    private final BeadingCarRepo beadingCarRepo;

    private final BidCarsRepo bidCarsRepo;

    private final UserRepository userRepository;

    @Override
    public BidCarsDTO createBidding(BidCarsDTO bidCarsDTO) {
        Optional<BeadingCAR> byId = beadingCarRepo.findById(bidCarsDTO.getBeadingCarId());
        if (!byId.isPresent()) {
            throw new RuntimeException("Car Not Found");
        }
        BidCars bidCars = convertToEntity(bidCarsDTO);
        BidCars save = bidCarsRepo.save(bidCars);
        return convertToDto(save);
    }

    @Override
    public BidDetailsDTO getbyBidId(Integer bidCarId, Integer beadingCarId) {
        return null;
    }

    @Override
    public List<BidCarsDTO> getByUserId(Integer userId) {
        return List.of();
    }


    public BidCars convertToEntity(BidCarsDTO bidCarsDTO){
        BidCars bdCarEntity = modelMapper.map(bidCarsDTO, BidCars.class);
        return bdCarEntity;
    }

    public BidCarsDTO convertToDto (BidCars bidCars){
        BidCarsDTO bdCarDto = modelMapper.map(bidCars, BidCarsDTO.class);
        return bdCarDto;
    }
}
