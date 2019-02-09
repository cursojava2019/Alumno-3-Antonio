package es.indra.academia.controller.alumnos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.indra.academia.model.service.AlumnoService;

/**
 * Servlet implementation class EliminarAlumnoServlet
 */
@WebServlet("/admin/alumnos/eliminar.html")
public class EliminarAlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public EliminarAlumnoServlet() {
		super();
		
}

import java.util.Date;

public class Alumno {

	private Long id;

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String telefono;
	private String correo;
	private Boolean repetidor;
	private Date fechaAlta;
	private Date fechaBaja;
	private String observaciones;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Boolean getRepetidor() {
		if (this.repetidor == null) {
			return false;
		} else {
			return this.repetidor;
		}
	}

	public void setRepetidor(Boolean repetidor) {
		this.repetidor = repetidor;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + this.id + ", nombre=" + this.nombre + ", apellido1=" + this.apellido1 + ", apellido2="
				+ this.apellido2 + ", nif=" + this.nif + ", telefono=" + this.telefono + ", correo=" + this.correo
				+ ", repetidor=" + this.repetidor + ", fechaAlta=" + this.fechaAlta + ", fechaBaja=" + this.fechaBaja
				+ ", observaciones=" + this.observaciones + "]";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Long idLong = null;
		AlumnoService alumnoService = AlumnoService.getInstance();
		try {
			idLong = Long.parseLong(id);
		} catch (NumberFormatException e) {
			idLong = null;
		}
		if (idLong == null) {
			response.sendRedirect("./listado.html?mensaje=errorId");
		} else {
			Alumno alumno = alumnoService.find(idLong);
			if (alumno != null) {
				alumnoService.delete(idLong);
				response.sendRedirect("./listado.html?mensaje=correcto");
			} else {
				response.sendRedirect("./listado.html?mensaje=errorId");
			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}