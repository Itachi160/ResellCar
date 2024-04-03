package com.spring.jwt.service;

import com.spring.jwt.Interfaces.FinalBidService;
import com.spring.jwt.dto.FinalBidDto;
import com.spring.jwt.entity.Final1stBid;
import com.spring.jwt.exception.BidAmountLessException;
import com.spring.jwt.exception.BidForSelfAuctionException;
import org.modelmapper.ModelMapper;

import java.util.List;

public class Final1stBidServiceImpl implements FinalBidService {

    private final ModelMapper modelMapper;

    public Final1stBidServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public String placeBid(FinalBidDto finalBidDto, Integer bidCarId) throws BidAmountLessException, BidForSelfAuctionException {
        return null;
    }

    @Override
    public List<FinalBidDto> getByUserId(Integer userId) {
        return null;
    }

    @Override
    public FinalBidDto getByCarID(Integer bidCarId) {
        return null;
    }

    @Override
    public FinalBidDto getByPlacedBidId(Integer placedBidId) {
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



    public Final1stBid convertToEntity( FinalBidDto finalBidDto){
        Final1stBid final1stBid= modelMapper.map(finalBidDto,Final1stBid.class);
        return  final1stBid;
    }
    public FinalBidDto finalBidDto (Final1stBid final1stBid){
        FinalBidDto finalBidDto = modelMapper.map(final1stBid, FinalBidDto.class);
        return  finalBidDto;
    }



}
