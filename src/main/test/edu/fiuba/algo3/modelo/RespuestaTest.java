package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class RespuestaTest {
    @Test
    public void seCreaRespuestaIndicandoPreguntaYJugador() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        assertEquals(jugador,respuesta.jugador);
        assertEquals(pregunta,respuesta.pregunta);
    }

    @Test
    public void seCreaRespuestaYListaDeOpcionesElgidasEstaVacia() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertTrue((opcionesElegidas).isEmpty());
    }

    @Test
    public void seAgregaUnaOpcionCorrectaAListaDeOpcionesElegidasYSuTamanioEsUno() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion = new Opcion("Si",1);
        respuesta.agregarOpcion(opcion);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion,(opcionesElegidas).get(0));
    }

    @Test
    public void seAgregaUnaOpcionIncorrectaSinPenalidadAListaDeOpcionesElegidasYSuTamanioEsUno() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion = new Opcion("Si",0);
        respuesta.agregarOpcion(opcion);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion,(opcionesElegidas).get(0));
    }

    @Test
    public void seAgregaUnaOpcionIncorrectaConPenalidadAListaDeOpcionesElegidasYLaDevuelve() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion = new Opcion("Si",-1);
        respuesta.agregarOpcion(opcion);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion,(opcionesElegidas).get(0));
    }

    @Test
    public void seAgreganVariasOpcionesCorrectasAListaDeOpcionesElegidasYLasDevuelveEnOrdenQueFueronAgregadas() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion1 = new Opcion("Si",1);
        Opcion opcion2 = new Opcion("Si",1);
        Opcion opcion3 = new Opcion("Si",1);
        respuesta.agregarOpcion(opcion1);
        respuesta.agregarOpcion(opcion2);
        respuesta.agregarOpcion(opcion3);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion1,(opcionesElegidas).get(0));
        assertEquals(opcion2,(opcionesElegidas).get(1));
        assertEquals(opcion3,(opcionesElegidas).get(2));
    }

    @Test
    public void seAgreganVariasOpcionesIncorrectasSinPenalidadAListaDeOpcionesElegidasYLasDevuelveEnOrdenQueFueronAgregadas() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion1 = new Opcion("Si",0);
        Opcion opcion2 = new Opcion("Si",0);
        Opcion opcion3 = new Opcion("Si",0);
        respuesta.agregarOpcion(opcion1);
        respuesta.agregarOpcion(opcion2);
        respuesta.agregarOpcion(opcion3);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion1,(opcionesElegidas).get(0));
        assertEquals(opcion2,(opcionesElegidas).get(1));
        assertEquals(opcion3,(opcionesElegidas).get(2));
    }

    @Test
    public void seAgreganVariasOpcionesIncorrectasConPenalidadAListaDeOpcionesElegidasYLasDevuelveEnOrdenQueFueronAgregadas() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion1 = new Opcion("Si",-1);
        Opcion opcion2 = new Opcion("Si",-1);
        Opcion opcion3 = new Opcion("Si",-1);
        respuesta.agregarOpcion(opcion1);
        respuesta.agregarOpcion(opcion2);
        respuesta.agregarOpcion(opcion3);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion1,(opcionesElegidas).get(0));
        assertEquals(opcion2,(opcionesElegidas).get(1));
        assertEquals(opcion3,(opcionesElegidas).get(2));
    }

    @Test
    public void seAgreganVariasOpcionesAListaDeOpcionesElegidasYLasDevuelveEnOrdenQueFueronAgregadas() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta,jugador);

        Opcion opcion1 = new Opcion("Si",1);
        Opcion opcion2 = new Opcion("Si",0);
        Opcion opcion3 = new Opcion("Si",-1);
        respuesta.agregarOpcion(opcion1);
        respuesta.agregarOpcion(opcion2);
        respuesta.agregarOpcion(opcion3);

        ArrayList<Opcion> opcionesElegidas = respuesta.obtenerOpcionesElegidas();

        assertEquals(opcion1,(opcionesElegidas).get(0));
        assertEquals(opcion2,(opcionesElegidas).get(1));
        assertEquals(opcion3,(opcionesElegidas).get(2));
    }

    @Test
    public void seAgreganDosOpcionesCorrectasIgualesAListaDeOpcionesElegidasYSeLanzaExcepcion() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta, jugador);

        Opcion opcion = new Opcion("Si",1);
        respuesta.agregarOpcion(opcion);

        assertThrows(RespuestaError.class, () -> respuesta.agregarOpcion(opcion));
    }

    @Test
    public void seAgreganDosOpcionesIncorrectasSinPenalidadIgualesAListaDeOpcionesElegidasYSeLanzaExcepcion() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta, jugador);

        Opcion opcion = new Opcion("Si",0);
        respuesta.agregarOpcion(opcion);

        assertThrows(RespuestaError.class, () -> respuesta.agregarOpcion(opcion));
    }

    @Test
    public void seAgreganDosOpcionesIncorrectasConPenalidadIgualesAListaDeOpcionesElegidasYSeLanzaExcepcion() throws RespuestaError {
        Pregunta pregunta = mock(Pregunta.class);
        Jugador jugador = new Jugador("Juan");
        Respuesta respuesta = new Respuesta(pregunta, jugador);

        Opcion opcion = new Opcion("Si",-1);
        respuesta.agregarOpcion(opcion);

        assertThrows(RespuestaError.class, () -> respuesta.agregarOpcion(opcion));
    }
}
