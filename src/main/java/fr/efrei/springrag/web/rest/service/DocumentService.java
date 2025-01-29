package fr.efrei.springrag.web.rest.service;

import fr.efrei.springrag.web.rest.domain.Document;
import fr.efrei.springrag.web.rest.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document getDocumentById(Long id) {
        return documentRepository.getById(id);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document buildAndSave(Document document) {
        return documentRepository.save(document);
    }
}