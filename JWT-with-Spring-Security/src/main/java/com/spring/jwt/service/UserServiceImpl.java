package com.spring.jwt.service;

import com.spring.jwt.Interfaces.UserService;
import com.spring.jwt.dto.PasswordChange;
import com.spring.jwt.dto.RegisterDto;
import com.spring.jwt.dto.ResponseDto;
import com.spring.jwt.dto.UserProfileDto;
import com.spring.jwt.entity.*;
import com.spring.jwt.exception.*;
import com.spring.jwt.repository.RoleRepository;
import com.spring.jwt.repository.UserProfileRepository;
import com.spring.jwt.repository.UserRepository;
import com.spring.jwt.utils.BaseResponseDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserProfileRepository userProfileRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public BaseResponseDTO registerAccount(RegisterDto registerDto) {
        BaseResponseDTO response = new BaseResponseDTO();

        validateAccount(registerDto);

        User user = insertUser(registerDto);


        try {
            userRepository.save(user);
            response.setCode(String.valueOf(HttpStatus.OK.value()));
            response.setMessage("Account Created");
        } catch (UserAlreadyExistException e) {
            response.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
            response.setMessage("User already exist");
        }catch (BaseException e){
            response.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
            response.setMessage("Invalid role");
        }
        return response;
    }



    private User insertUser(RegisterDto registerDto) {
        User user = new User();
        user.setEmail(registerDto.getEmail());
        user.setMobileNo(registerDto.getMobileNo());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.findByName(registerDto.getRoles());
        roles.add(role);
        user.setRoles(roles);

        if (role.getName().equals("USER")) {
            Userprofile profile = new Userprofile();
            profile.setAddress(registerDto.getAddress());
            profile.setCity(registerDto.getCity());
            profile.setFirstName(registerDto.getFirstName());
            profile.setLastName(registerDto.getLastName());

            user.setProfile(profile);
            profile.setUser(user);
        } else if (role.getName().equals("DEALER")) {

            Dealer dealer = new Dealer();
            dealer.setAddress(registerDto.getAddress());
            dealer.setArea(registerDto.getArea());
            dealer.setCity(registerDto.getCity());
            dealer.setStatus(registerDto.status);
            dealer.setFirstname(registerDto.getFirstName());
            dealer.setLastName(registerDto.getLastName());
            dealer.setMobileNo(registerDto.getMobileNo());
            dealer.setShopName(registerDto.getShopName());
            dealer.setEmail(registerDto.getEmail());

            user.setDealer(dealer);
            dealer.setUser(user);

        } else if (role.getName().equals("INSPECTOR")) {
            InspectorProfile inspectorProfile = new InspectorProfile();
            inspectorProfile.setAddress(registerDto.getAddress());
            inspectorProfile.setCity(registerDto.getCity());
            inspectorProfile.setFirstName(registerDto.getFirstName());
            inspectorProfile.setLastName(registerDto.getLastName());
            user.setInspectorProfile(inspectorProfile);
            inspectorProfile.setUser(user);
        }
        return user;
    }

    private void validateAccount(RegisterDto registerDto) {
        if (ObjectUtils.isEmpty(registerDto)) {
            throw new BaseException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Data must not be empty");
        }

        User user = userRepository.findByEmail(registerDto.getEmail());
        if (!ObjectUtils.isEmpty(user)) {
            throw new UserAlreadyExistException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Username already exists");
        }

        List<String> roles = roleRepository.findAll().stream().map(Role::getName).toList();
        if (!roles.contains(registerDto.getRoles())) {
            throw new BaseException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Invalid role");
        }
    }
    @Override
    public BaseResponseDTO changePassword(int id, PasswordChange passwordChange) {
        return null;
    }

    @Override
    public BaseResponseDTO editUser(UserProfileDto userProfileDto, int id) {
        return null;
    }

    @Override
    public BaseResponseDTO removeUser(int id) {
        return null;
    }

    @Override
    public List<UserProfileDto> getAllUsers(int pageNo) {
        return List.of();
    }

    @Override
    public UserProfileDto getUser(int id) {
        return null;
    }

    @Override
    public void updateResetPassword(String token, String email) {

    }

    @Override
    public ResponseDto forgotPass(String email, String resetPasswordLink, String domain) throws UserNotFoundExceptions {
        return null;
    }

    @Override
    public ResponseDto updatePassword(String token, String newPassword) {
        return null;
    }

}
