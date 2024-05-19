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
        libros.add(new Libro(1L, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
        libros.add(new Libro(2L, "La sombra del viento", "Carlos Ruiz Zafón", "Planeta", 2001));
        libros.add(new Libro(3L, "Rayuela", "Julio Cortázar", "Editorial Sudamericana", 1963));
        libros.add(new Libro(4L, "El amor en los tiempos del cólera", "Gabriel García Márquez", "Editorial Oveja Negra", 1985));
        libros.add(new Libro(5L, "Pedro Páramo", "Juan Rulfo", "Editorial Fondo de Cultura Económica", 1955));
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
