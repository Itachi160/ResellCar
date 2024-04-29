package com.spring.jwt.service;

import com.spring.jwt.Interfaces.PendingBookingService;
import com.spring.jwt.dto.BookingDtos.DealerDetails;
import com.spring.jwt.dto.BookingDtos.PendingBookingRequestDto;
import com.spring.jwt.dto.CarDto;
import com.spring.jwt.dto.DealerDto;
import com.spring.jwt.dto.PendingBookingDTO;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Dealer;
import com.spring.jwt.entity.PendingBooking;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.DealerRepository;
import com.spring.jwt.repository.PendingBookingRepository;
import com.spring.jwt.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PendingBookingServiceImpl implements PendingBookingService {

    private final PendingBookingRepository pendingBookingRepository;
    private final CarRepo carRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DealerRepository dealerRepository;


    @Override
    public PendingBookingRequestDto savePendingBooking(PendingBookingDTO pendingBookingDTO) {
        return null;
    }

    @Override
    public void deleteBooking(int id) {

    }

    @Override
    public void statusUpdate(PendingBookingDTO pendingBookingDTO) {

    }

    @Override
    public List<PendingBookingDTO> getAllPendingBookingWithPage(int PageNo) {
        return List.of();
    }

    @Override
    public List<com.spring.jwt.dto.BookingDtos.PendingBookingDTO> getAllPendingBookingByUserId(int pageNo, int userId) {
        return List.of();
    }

    @Override
    public com.spring.jwt.dto.BookingDtos.PendingBookingDTO getPendingBookingId(int bookingId) {
        return null;
    }

    @Override
    public List<com.spring.jwt.dto.BookingDtos.PendingBookingDTO> getPendingBookingsByDealerId(int pageNo, int dealerId) {
        return List.of();
    }

    @Override
    public List<com.spring.jwt.dto.BookingDtos.PendingBookingDTO> getPendingBookingsByCarId(int pageNo, int carId) {
        return List.of();
    }
}
