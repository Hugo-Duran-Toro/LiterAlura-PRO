package com.alura.literalura.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name="autores")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer fechaNacimiento;
    private Integer fechaFallecimiento;

    @OneToMany(mappedBy="autor", cascade=CascadeType.ALL)
    private List<Libro> libros = new ArrayList<>();
}
