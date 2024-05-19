package com.tuuniversidad.deber2.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tuuniversidad.deber2.models.Libro;
import org.springframework.stereotype.Repository;

@Repository
public class LibroRepository {

    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
        libros.add(new Libro(1L, "A History", "Jonathan Clements", "British Film Institute", 2013));
        libros.add(new Libro(2L, "The Anime Machine", "Thomas Lamarre", "University of Minnesota Press", 2009));
        libros.add(new Libro(3L, "Anime Explosion!", "JPatrick Drazen", "Stone Bridge Press", 2002));
        libros.add(new Libro(4L, "Beautiful Fighting Girl", "Saitō Tamaki", "University of Minnesota Press", 2011));
        libros.add(new Libro(5L, "Anime's Media Mix", "Marc Steinberg", "University of Minnesota Press", 2012));
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
