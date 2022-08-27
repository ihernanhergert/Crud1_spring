package com.example.project1.project1.entities;
import javax.persistence.*;

@Entity
@Table(name = "estudiantes")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 50)
    private String apellido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    public Student() {}
    public Student(Long id, String nombre, String apellidos, String email){
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.email = email;
    }

    public Student(String nombre, String apellidos, String email){
        super();
        this.nombre = nombre;
        this.apellido = apellidos;
        this.email = email;
    }

}
