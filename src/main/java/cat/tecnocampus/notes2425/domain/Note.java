package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Set;


public record Note(Long id, UserLab owner, String title, String content, LocalDateTime creationDate, Set<Tag> tags) {










}
