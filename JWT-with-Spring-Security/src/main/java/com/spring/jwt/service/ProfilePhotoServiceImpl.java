package com.spring.jwt.service;

import com.spring.jwt.Interfaces.ProfilePhotoService;
import com.spring.jwt.repository.ProfilePhotoRepo;
import com.spring.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfilePhotoServiceImpl implements ProfilePhotoService {
@Autowired
private  ProfilePhotoRepo profilePhotoRepo;
@Autowired
private UserRepository userRepository;


    @Override
    public void addprofilephoto(byte[] data) {
        return ;
    }

    @Override
    public byte[] getprofilePhotoData(Long id) {
        return new byte[0];
    }

    @Override
    public void updateprofilePhoto(Long id, byte[] data) {

    }

    @Override
    public void deleteprofilePhoto(Long id) {

    }

    @Override
    public void setUserPhotoID(int UserId, long profilePhotId) {

    }
}
