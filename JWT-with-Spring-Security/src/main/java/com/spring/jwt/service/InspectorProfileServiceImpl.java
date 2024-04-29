package com.spring.jwt.service;

import com.spring.jwt.Interfaces.InspectorProfileService;
import com.spring.jwt.dto.InspectorProfileDto;
import com.spring.jwt.entity.InspectorProfile;
import com.spring.jwt.entity.User;
import com.spring.jwt.exception.UserNotFoundExceptions;
import com.spring.jwt.repository.InspectorProfileRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InspectorProfileServiceImpl implements InspectorProfileService {

    private final InspectorProfileRepo inspectorProfileRepo;

    private final UserRepository userRepository;


    @Override
    public String updateProfile(InspectorProfileDto inspectorProfileDto, Integer InspectorProfileId) {
        return "";
    }

    @Override
    public InspectorProfileDto getProfileById(Integer inspectorProfileId) {
        return null;
    }

    @Override
    public String deleteProfile(Integer inspectorProfileId) {
        return "";
    }

    @Override
    public InspectorProfileDto getProfileByUserId(Integer userId) {
        return null;
    }
}