package fr.efrei.rag.web.rest.repository;

import fr.efrei.rag.web.rest.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}