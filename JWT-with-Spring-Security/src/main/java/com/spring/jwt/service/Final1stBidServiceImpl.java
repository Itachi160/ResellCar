package com.spring.jwt.service;

import com.spring.jwt.Interfaces.FinalBidService;
import com.spring.jwt.dto.FinalBidDto;
import com.spring.jwt.entity.BidCars;
import com.spring.jwt.entity.Final1stBid;
import com.spring.jwt.entity.PlacedBid;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.BidCarsRepo;
import com.spring.jwt.repository.FinalBidRepo;
import com.spring.jwt.repository.PlacedBidRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Final1stBidServiceImpl implements FinalBidService {


    private final FinalBidRepo finalBidRepo;

    private final BidCarsRepo bidCarsRepo;

    private final ModelMapper modelMapper;

    private final UserRepository userRepository;


    public FinalBidDto convertToDto(Final1stBid final1stBid) {
        return modelMapper.map(final1stBid, FinalBidDto.class);
    }

    @Override
    public String FinalPlaceBid(FinalBidDto finalBidDto) throws BidAmountLessException, BidForSelfAuctionException {
        return "";
    }

    @Override
    public List<FinalBidDto> getByUserId(Integer userId) {
        return List.of();
    }

    @Override
    public FinalBidDto getByCarID(Integer bidCarId) {
        return null;
    }

    @Override
    public Final1stBid getByPlacedBidId(Integer placedBidId) {
        return null;
    }

    @Override
    public FinalBidDto getById(Integer placedBidId) {
        return null;
    }

    @Override
    public FinalBidDto getTopOne(Integer bidCarId) {
        return null;
    }
}
