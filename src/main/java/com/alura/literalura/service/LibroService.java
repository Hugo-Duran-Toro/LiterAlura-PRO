package com.alura.literalura.service;

import com.alura.literalura.model.Libro;
import java.util.*;

public interface LibroService {

    Libro guardar(Libro libro);

    List<Libro> listar();

    List<Libro> top10();

    List<Libro> buscarPorIdioma(String idioma);
}
