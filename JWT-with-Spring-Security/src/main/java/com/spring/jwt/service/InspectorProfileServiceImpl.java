package com.spring.jwt.service;

import com.spring.jwt.Interfaces.InspectorProfileService;
import com.spring.jwt.dto.InspectorProfileDto;
import com.spring.jwt.entity.InspectorProfile;
import com.spring.jwt.exception.UserNotFoundExceptions;
import com.spring.jwt.repository.InspectorProfileRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InspectorProfileServiceImpl implements InspectorProfileService {

    private final InspectorProfileRepo inspectorProfileRepo;

    @Override
    public String updateProfile(InspectorProfileDto inspectorProfileDto, Integer InspectorProfileId) {
        InspectorProfile profile = inspectorProfileRepo.findById(InspectorProfileId).orElseThrow(() -> new UserNotFoundExceptions("Profile not found", HttpStatus.NOT_FOUND));

        if (inspectorProfileDto.getAddress() != null) {
            profile.setAddress(inspectorProfileDto.getAddress());
        }
        if (inspectorProfileDto.getCity() != null) {
            profile.setCity(inspectorProfileDto.getCity());
        }
        if (inspectorProfileDto.getFirstName() != null) {
            profile.setFirstName(inspectorProfileDto.getFirstName());
        }
        if (inspectorProfileDto.getLastName() != null) {
            profile.setLastName(inspectorProfileDto.getLastName());
        }
        inspectorProfileRepo.save(profile);
        return "Profile fields updated successfully";
    }
}