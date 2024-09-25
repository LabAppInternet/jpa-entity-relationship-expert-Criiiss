package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "User_lab")  // lo pongo por si hay diferencia de nombre en la tabla
public class UserLab{

    //constructor???
    public UserLab() {
    }

    @Id//marca id como primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // como no dice nada el enunciado lo pongo para generar automaticamente
    private Long id;
    @NotNull  // para que no pueda ser null
    private String username;

    @Email  // obligo un formato de email
    private String email;

    @OneToMany(mappedBy = "owner")
    // relaciono user con la clase de notas y le digo que el campo owner es el que relaciona las dos tablas ya que es el fk
    private List<Note> notes;

    @OneToMany(mappedBy = "owner")
    // relaciono user con la clase de permisos y le digo que el campo owner es el que relaciona las dos tablas ya que es el fk
    private List<Permission> permissions;


    // getters y setters
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
