package co.com.udem.nomina.dto;

public class EmpleadoDTO {

	private static String nombres;
	private static String apellidos;
	private static String cedula;
	private static String departamento;
	private static Double salario;

	private EmpleadoDTO() {

	}

	public static String getDepartamento() {
		return departamento;
	}

	public static void setDepartamento(String departamento) {
		EmpleadoDTO.departamento = departamento;
	}

	public static String getNombres() {
		return nombres;
	}

	public static void setNombres(String nombres) {
		EmpleadoDTO.nombres = nombres;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void setApellidos(String apellidos) {
		EmpleadoDTO.apellidos = apellidos;
	}

	public static String getCedula() {
		return cedula;
	}

	public static void setCedula(String cedula) {
		EmpleadoDTO.cedula = cedula;
	}

	public static Double getSalario() {
		return salario;
	}

	public static void setSalario(Double salario) {
		EmpleadoDTO.salario = salario;
	}

}
