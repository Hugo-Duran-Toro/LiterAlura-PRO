package com.alura.literalura.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="libros", uniqueConstraints=@UniqueConstraint(columnNames="titulo"))
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    private String idioma;
    private Integer numeroDescargas;

    @ManyToOne
    private Autor autor;
}
