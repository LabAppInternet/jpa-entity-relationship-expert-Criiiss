package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "User_Lab")
public record UserLab(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id,

        @NotNull
        String username,

        @Email
        String email)
{ }
