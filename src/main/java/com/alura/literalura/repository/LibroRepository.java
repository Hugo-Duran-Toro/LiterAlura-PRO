package com.alura.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alura.literalura.model.Libro;
import java.util.*;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloIgnoreCase(String titulo);

    List<Libro> findTop10ByOrderByNumeroDescargasDesc();

    List<Libro> findByIdiomaIgnoreCase(String idioma);
}
