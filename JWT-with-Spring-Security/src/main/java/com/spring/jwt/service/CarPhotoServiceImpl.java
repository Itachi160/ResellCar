package com.spring.jwt.service;

import com.spring.jwt.Interfaces.CarPhotoService;
import com.spring.jwt.entity.Car;
import com.spring.jwt.entity.Photo;
import com.spring.jwt.repository.CarRepo;
import com.spring.jwt.repository.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarPhotoServiceImpl implements CarPhotoService {

    private final PhotoRepo photoRepo;
    @Autowired
    private CarRepo carRepo;
      @Autowired
      public CarPhotoServiceImpl(PhotoRepo photoRepo)
        {
            this.photoRepo = photoRepo;
        }

    @Override
    public long addphoto(byte[] data) {
        return 0;
    }

    @Override
    public byte[] getPhotoData(Long id) {
        return new byte[0];
    }

    @Override
    public void updatePhoto(Long id, byte[] data) {

    }

    @Override
    public void deletePhoto(Long id, int carId) {

    }

    @Override
    public void setCarPhotoIdInCar(int carId, long carPhotoId) {

    }
}
