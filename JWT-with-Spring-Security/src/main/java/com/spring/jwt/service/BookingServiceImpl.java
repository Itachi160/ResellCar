package com.spring.jwt.service;


import com.spring.jwt.Interfaces.BookingService;
import com.spring.jwt.Interfaces.ICarRegister;
import com.spring.jwt.dto.BookingDto;
import com.spring.jwt.dto.CarDto;
import com.spring.jwt.entity.Booking;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.PendingBooking;
import com.spring.jwt.entity.Status;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.BookingRepository;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.PendingBookingRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor

public class BookingServiceImpl implements BookingService {


    @Override
    public BookingDto saveBooking(BookingDto bookingDTO) {
        return null;
    }

    @Override
    public List<BookingDto> getAllBooking(int pageNo) {
        return List.of();
    }

    @Override
    public BookingDto getAllBookingsByUserId(int userId) {
        return null;
    }

    @Override
    public List<BookingDto> getAllBookingsByDealerId(int dealerId, int pageNo) {
        return List.of();
    }

    @Override
    public BookingDto getBookingById(int id) {
        return null;
    }
}
