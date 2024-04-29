package com.spring.jwt.service;

import com.spring.jwt.Interfaces.PlacedBidService;
import com.spring.jwt.dto.BeedingDtos.PlacedBidDTO;
import com.spring.jwt.entity.BidCars;
import com.spring.jwt.entity.PlacedBid;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.BidCarsRepo;
import com.spring.jwt.repository.PlacedBidRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlacedBidServiceImpl implements PlacedBidService {
      private final PlacedBidRepo placedBidRepo;

      private final  BidCarsRepo bidCarsRepo;

      private final ModelMapper modelMapper;

      private final UserRepository userRepository;


    @Override
    public String placeBid(PlacedBidDTO placedBidDTO, Integer bidCarId) throws BidAmountLessException, BidForSelfAuctionException {
        return "";
    }

    @Override
    public List<PlacedBidDTO> getByUserId(Integer userId) {
        return List.of();
    }

    @Override
    public List<PlacedBidDTO> getByCarID(Integer bidCarId) {
        return List.of();
    }

    @Override
    public PlacedBidDTO getById(Integer placedBidId) {
        return null;
    }

    @Override
    public List<PlacedBidDTO> getTopThree(Integer bidCarId) {
        return List.of();
    }
}
