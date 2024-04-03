package com.spring.jwt.Interfaces;
import com.spring.jwt.dto.FinalBidDto;
import com.spring.jwt.exception.BidAmountLessException;
import com.spring.jwt.exception.BidForSelfAuctionException;

import java.util.List;

public interface FinalBidService {
    public String placeBid(FinalBidDto finalBidDto, Integer bidCarId) throws BidAmountLessException, BidForSelfAuctionException;

    public List<FinalBidDto> getByUserId(Integer userId);

    public  FinalBidDto getByCarID(Integer bidCarId );

    public FinalBidDto getByPlacedBidId(Integer placedBidId);

    public FinalBidDto getById(Integer placedBidId);

    public  FinalBidDto getTopOne(Integer bidCarId);

}
