package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public record Permission(

        @Id
        @ManyToOne
        @JoinColumn(name = "user_Id")
        UserLab owner,
        @Id
        @ManyToOne
        @JoinColumn(name = "note_Id")
        Note note,

        @NotNull
        boolean canRead,

        @NotNull
        boolean canEdit) {
}
