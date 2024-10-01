package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Set;
@Entity
public record Note(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @NotNull
        @ManyToOne
        @JoinColumn(name = "owner_id")
        UserLab owner,

        @NotNull
        String title,
        @NotNull
        String content,
        @NotNull
        LocalDateTime creationDate,

        @ManyToMany
        @JoinTable(
                name = "Note_Tag",
                joinColumns = @JoinColumn(name = "note_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_name")
        )
        Set<Tag> tags) {
}
