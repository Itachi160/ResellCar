package com.spring.jwt.controller;

import com.spring.jwt.Interfaces.InspectorProfileService;
import com.spring.jwt.dto.InspectorProfileDto;
import com.spring.jwt.dto.ResponseDto;
import com.spring.jwt.exception.UserNotFoundExceptions;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ispProfile")
@RequiredArgsConstructor
public class InspectorProfileController {

    private final InspectorProfileService inspectorProfileService;

    @PatchMapping("/update")
    public ResponseEntity<ResponseDto> updateJobFields(@RequestBody InspectorProfileDto inspectorProfileDto, @RequestParam Integer inspectorProfileId) {
        try {
            String result = inspectorProfileService.updateProfile(inspectorProfileDto, inspectorProfileId);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto("success", result));
        } catch (UserNotFoundExceptions  profileNotFoundException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseDto("unsuccess", "Profile not found"));
        }
    }
}



