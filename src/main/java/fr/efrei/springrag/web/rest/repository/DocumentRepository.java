package fr.efrei.springrag.web.rest.repository;

import fr.efrei.springrag.web.rest.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
