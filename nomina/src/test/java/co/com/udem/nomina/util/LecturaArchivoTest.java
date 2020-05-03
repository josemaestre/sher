package co.com.udem.nomina.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import co.com.udem.nomina.dto.EmpleadoDTO;

public class LecturaArchivoTest {

	@Test
	public void llenarDTOTest() {
		LecturaArchivo.leerArchivo();
		Assertions.assertNotNull(EmpleadoDTO.getApellidos());
		Assertions.assertNotNull(EmpleadoDTO.getNombres());
		Assertions.assertNotNull(EmpleadoDTO.getCedula());
		Assertions.assertNotNull(EmpleadoDTO.getDepartamento());
		Assertions.assertNotNull(EmpleadoDTO.getSalario());
	}

	@ParameterizedTest
	@ValueSource(strings = { "Carlos Andres", "Andrea Estefania", "Walter Armando" })
	void leerNombresTest(String names) {
		String message = "Este nombre no se encuentra en uso";
		assertEquals(names, EmpleadoDTO.getNombres(), message);
	}

	@ParameterizedTest
	@ValueSource(strings = { "Llano Suarez", "Sanchez Flores", "Valencia Lopez" })
	void leerApellidosTest(String apellidos) {
		String message = "Este apellido no se encuentra en uso";
		assertEquals(apellidos, EmpleadoDTO.getApellidos(), message);
	}

}
