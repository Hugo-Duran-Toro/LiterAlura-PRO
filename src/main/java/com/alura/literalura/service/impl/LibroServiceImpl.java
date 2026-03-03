package com.alura.literalura.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.*;

import com.alura.literalura.service.LibroService;
import com.alura.literalura.repository.LibroRepository;
import com.alura.literalura.model.Libro;

@Service
@RequiredArgsConstructor
public class LibroServiceImpl implements LibroService {

    private final LibroRepository repository;

    @Override
    public Libro guardar(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public List<Libro> listar() {
        return repository.findAll();
    }

    @Override
    public List<Libro> top10() {
        return repository.findTop10ByOrderByNumeroDescargasDesc();
    }

    @Override
    public List<Libro> buscarPorIdioma(String idioma) {
        return repository.findByIdiomaIgnoreCase(idioma);
    }
}
