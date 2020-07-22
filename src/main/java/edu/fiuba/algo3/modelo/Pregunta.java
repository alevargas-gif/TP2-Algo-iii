package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public interface Pregunta {
    Integer PuntajeConOpciones(ArrayList<Opcion> opciones);
    void Iniciar(Jugador jugador);
    void SeleccionarOpcion(Opcion opcion);
    Respuesta Confirmar();
}
