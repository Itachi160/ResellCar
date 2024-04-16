package com.spring.jwt.Interfaces;


import com.spring.jwt.dto.DocumentDto;
import com.spring.jwt.entity.Document;

import java.util.List;

public interface IDocument {
    public String addDocument(DocumentDto documentDto);

    public List<Document> getAllDocument(Integer userId, String DocumentType);

    public List<Document> getByUserId(Integer userId);
}
