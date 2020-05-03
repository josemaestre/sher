package co.com.udem.nomina.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import co.com.udem.nomina.dto.EmpleadoDTO;

public class PoblarEstructura {
	private PoblarEstructura() {

	}

	private static final HashMap<String, EmpleadoDTO> empleados = new HashMap<String, EmpleadoDTO>();
	private static final Logger logger = LogManager.getLogger(PoblarEstructura.class);

	public static void llenarHashMap(EmpleadoDTO empleadoDTO) {
		empleados.put(EmpleadoDTO.getCedula(), empleadoDTO);
	}

	public static void imprimirHashMap() {
		BasicConfigurator.configure();
		Collection<EmpleadoDTO> coleccionEmpleados = empleados.values();
		Iterator<EmpleadoDTO> iterator = coleccionEmpleados.iterator();
		StringBuilder empleados = new StringBuilder();

		while (iterator.hasNext()) {
			iterator.next();
			empleados.append(EmpleadoDTO.getNombres());
			empleados.append(",");
			empleados.append(EmpleadoDTO.getApellidos());
			empleados.append(",");
			empleados.append(EmpleadoDTO.getCedula());
			empleados.append(",");
			empleados.append(EmpleadoDTO.getDepartamento());
			empleados.append(",");
			empleados.append(EmpleadoDTO.getSalario());
			logger.info(empleados.toString());
		}

	}

	public static int tamanoHashMap() {
		return empleados.size();
	}
}
