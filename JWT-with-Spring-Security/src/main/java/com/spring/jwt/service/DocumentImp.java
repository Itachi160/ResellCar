package com.spring.jwt.service;

import com.spring.jwt.Interfaces.IDocument;
import com.spring.jwt.dto.DocumentDto;
import com.spring.jwt.entity.Document;
import com.spring.jwt.entity.User;
import com.spring.jwt.repository.DocumentRepo;
import com.spring.jwt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class DocumentImp implements IDocument {
    private final UserRepository userRepository;
    private final DocumentRepo documentRepo;


    @Override
    public String addDocument(DocumentDto documentDto) {
        return "";
    }

    @Override
    public List<Document> getAllDocument(Integer userId, String DocumentType) {
        return List.of();
    }

    @Override
    public List<Document> getByUserId(Integer userId) {
        return List.of();
    }
}
