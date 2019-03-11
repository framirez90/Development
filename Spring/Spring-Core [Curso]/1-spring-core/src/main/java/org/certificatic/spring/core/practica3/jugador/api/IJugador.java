package org.certificatic.spring.core.practica3.jugador.api;

import org.certificatic.spring.core.practica3.liga.Partido;
import org.certificatic.spring.core.practica3.liga.Torneo;

public interface IJugador {
	void saludar();

	String getNombre();

	Partido getPartido();

	Torneo getTorneo();

}
