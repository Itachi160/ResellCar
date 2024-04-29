package com.spring.jwt.service;


import com.spring.jwt.Interfaces.ICarRegister;
import com.spring.jwt.dto.CarDto;
import com.spring.jwt.dto.FilterDto;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Dealer;
import com.spring.jwt.entity.Status;
import com.spring.jwt.exception.CarNotFoundException;
import com.spring.jwt.exception.DealerNotFoundException;
import com.spring.jwt.exception.PageNotFoundException;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.DealerRepository;
import com.spring.jwt.repository.PhotoRepo;
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
import java.util.Optional;

@Service
public class CarRegisterImp implements ICarRegister {
    @Autowired
    private CarRepo carRepo;


    @Autowired
    private DealerRepository dealerRepo;
    @Autowired
    private PhotoRepo photoRepo;



    @Override
    public String AddCarDetails(CarDto carDto) {
//        System.out.println(carDto.getDealer_id());
        Dealer dealer=dealerRepo.findById(carDto.getDealer_id()).orElseThrow(()->new CarNotFoundException(("Dealer Not Found For ID" +carDto.getDealer_id()),HttpStatus.NOT_FOUND));
//        System.out.println(dealer.toString());
//        List<Car> dealerCar = new ArrayList<>();


              Car car =new Car(carDto);
//              car.setDealer(dealer);
//              dealerCar=dealer.getCars();

//              dealer.setCars(dealerCar);
//              dealerRepo.save(dealer);
              carRepo.save(car);
              return "car Added";



    }

    @Override
    public String editCarDetails(CarDto carDto, int id) {
        return "";
    }

    @Override
    public List<CarDto> getAllCarsWithPages(int PageNo, int pageSize) {
        return List.of();
    }

    @Override
    public String deleteCar(int carId, int DealerId) {
        return "";
    }

    @Override
    public CarDto getCarById(int carId) {
        return null;
    }

    @Override
    public List<CarDto> searchByFilter(FilterDto filterDto, int pageNo) {
        return List.of();
    }

    @Override
    public CarDto findById(int carId) {
        return null;
    }

    @Override
    public String editCarDetails(CarDto carDto) {
        return "";
    }

    @Override
    public List<CarDto> getDetails(int dealerId, Status carStatus, int pageNo) {
        return List.of();
    }


}
