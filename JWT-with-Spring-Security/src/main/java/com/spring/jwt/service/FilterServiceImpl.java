package com.spring.jwt.service;

import com.spring.jwt.Interfaces.FilterService;
import com.spring.jwt.dto.CarDto;
import com.spring.jwt.dto.FilterDto;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Status;
import com.spring.jwt.exception.CarNotFoundException;
import com.spring.jwt.exception.PageNotFoundException;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.DealerRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterServiceImpl implements FilterService {

    @Autowired
    private CarRepo carRepo;
    @Autowired
    private DealerRepository dealerRepo;


    @Override
    public List<CarDto> searchByFilter(FilterDto filterDto, int pageNo) {
        return List.of();
    }

    @Override
    public List<CarDto> getAllCarsWithPages(int PageNo) {
        return List.of();
    }
}
