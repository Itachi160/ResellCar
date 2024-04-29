package com.spring.jwt.service;

import com.spring.jwt.Interfaces.BiddingTimerService;
import com.spring.jwt.dto.BiddingTimerRequestDTO;
import com.spring.jwt.entity.BiddingTimerRequest;
import com.spring.jwt.repository.BiddingTImerRepo;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BiddingTimerServiceImpl implements BiddingTimerService {

    private final BiddingTImerRepo biddingTImerRepo;

    private final ModelMapper modelMapper;

    private final JavaMailSender javaMailSender;

    private final Logger logger = LoggerFactory.getLogger(BiddingTimerServiceImpl.class);



    @Override
    public BiddingTimerRequestDTO startTimer(BiddingTimerRequestDTO biddingTimerRequest) {

        BiddingTimerRequest biddingTimerRequest1 = convertToEntity(biddingTimerRequest);
        BiddingTimerRequest save = biddingTImerRepo.save(biddingTimerRequest1);
        BiddingTimerRequestDTO biddingTimerRequestDTO = convertToDto(save);
        return biddingTimerRequestDTO;
    }

    @Override
    public void sendBulkEmails(List<String> recipients, String message) {

    }


    public BiddingTimerRequest convertToEntity(BiddingTimerRequestDTO biddingTimerRequestDTO){
        BiddingTimerRequest biddingtime = modelMapper.map(biddingTimerRequestDTO, BiddingTimerRequest.class);
        return biddingtime;
    }

    public BiddingTimerRequestDTO convertToDto (BiddingTimerRequest biddingTimerRequest) {
        BiddingTimerRequestDTO biddingtimeDto = modelMapper.map(biddingTimerRequest, BiddingTimerRequestDTO.class);
        return biddingtimeDto;
    }
}
