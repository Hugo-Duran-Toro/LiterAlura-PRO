package com.alura.literalura.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import com.alura.literalura.repository.LibroRepository;
import com.alura.literalura.service.impl.LibroServiceImpl;
import com.alura.literalura.model.Libro;

public class LibroServiceTest {

    @Test
    void testTop10() {

        LibroRepository repo = Mockito.mock(LibroRepository.class);
        LibroServiceImpl service = new LibroServiceImpl(repo);

        Mockito.when(repo.findTop10ByOrderByNumeroDescargasDesc())
                .thenReturn(List.of(new Libro()));

        List<Libro> resultado = service.top10();

        assertFalse(resultado.isEmpty());
    }
}
