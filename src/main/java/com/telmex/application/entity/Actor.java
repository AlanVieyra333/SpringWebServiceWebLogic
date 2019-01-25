package com.telmex.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ACTOR database table.
 * 
 */
@Entity
@NamedQuery(name="Actor.findAll", query="SELECT a FROM Actor a")
public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FOLIO_ACTOR")
	private long folioActor;

	@Column(name="ACTIVAR_CONFIRM_ACTOR")
	private String activarConfirmActor;

	@Column(name="APELLIDO_MAT_ACTOR")
	private String apellidoMatActor;

	@Column(name="APELLIDO_PAT_ACTOR")
	private String apellidoPatActor;

	@Column(name="CLAVE_LOCALIZADOR_ACTOR")
	private String claveLocalizadorActor;

	@Column(name="COD_FUNCION_ACTOR")
	private String codFuncionActor;

	@Column(name="COD_TITULO")
	private String codTitulo;

	@Column(name="COD_USR")
	private String codUsr;

	@Column(name="DIAS_ANUAL_BONO_ACTOR")
	private BigDecimal diasAnualBonoActor;

	@Column(name="DIAS_TRIMES_BONO_ACTOR")
	private BigDecimal diasTrimesBonoActor;

	@Column(name="EMAIL_ACTOR")
	private String emailActor;

	@Column(name="EXT_TELEFONO_ACTOR")
	private String extTelefonoActor;

	@Column(name="FAX_ACTOR")
	private String faxActor;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_BAJA_ACTOR")
	private Date fechaBajaActor;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CREACION_ACTOR")
	private Date fechaCreacionActor;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_RESCISION_ACTOR")
	private Date fechaRescisionActor;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_REV_ACTOR")
	private Date fechaRevActor;

	@Column(name="FOLIO_APP")
	private BigDecimal folioApp;

	@Column(name="FOLIO_ENTIDAD")
	private BigDecimal folioEntidad;

	@Column(name="LOCALIZADOR_ACTOR")
	private String localizadorActor;

	@Column(name="NOMBRE_ACTOR")
	private String nombreActor;

	@Column(name="NUM_EMPLEADO_ACTOR")
	private String numEmpleadoActor;

	@Column(name="TELCEL_ACTOR")
	private String telcelActor;

	@Column(name="TELEFONO_ACTOR")
	private String telefonoActor;

	public Actor() {
	}

	public long getFolioActor() {
		return this.folioActor;
	}

	public void setFolioActor(long folioActor) {
		this.folioActor = folioActor;
	}

	public String getActivarConfirmActor() {
		return this.activarConfirmActor;
	}

	public void setActivarConfirmActor(String activarConfirmActor) {
		this.activarConfirmActor = activarConfirmActor;
	}

	public String getApellidoMatActor() {
		return this.apellidoMatActor;
	}

	public void setApellidoMatActor(String apellidoMatActor) {
		this.apellidoMatActor = apellidoMatActor;
	}

	public String getApellidoPatActor() {
		return this.apellidoPatActor;
	}

	public void setApellidoPatActor(String apellidoPatActor) {
		this.apellidoPatActor = apellidoPatActor;
	}

	public String getClaveLocalizadorActor() {
		return this.claveLocalizadorActor;
	}

	public void setClaveLocalizadorActor(String claveLocalizadorActor) {
		this.claveLocalizadorActor = claveLocalizadorActor;
	}

	public String getCodFuncionActor() {
		return this.codFuncionActor;
	}

	public void setCodFuncionActor(String codFuncionActor) {
		this.codFuncionActor = codFuncionActor;
	}

	public String getCodTitulo() {
		return this.codTitulo;
	}

	public void setCodTitulo(String codTitulo) {
		this.codTitulo = codTitulo;
	}

	public String getCodUsr() {
		return this.codUsr;
	}

	public void setCodUsr(String codUsr) {
		this.codUsr = codUsr;
	}

	public BigDecimal getDiasAnualBonoActor() {
		return this.diasAnualBonoActor;
	}

	public void setDiasAnualBonoActor(BigDecimal diasAnualBonoActor) {
		this.diasAnualBonoActor = diasAnualBonoActor;
	}

	public BigDecimal getDiasTrimesBonoActor() {
		return this.diasTrimesBonoActor;
	}

	public void setDiasTrimesBonoActor(BigDecimal diasTrimesBonoActor) {
		this.diasTrimesBonoActor = diasTrimesBonoActor;
	}

	public String getEmailActor() {
		return this.emailActor;
	}

	public void setEmailActor(String emailActor) {
		this.emailActor = emailActor;
	}

	public String getExtTelefonoActor() {
		return this.extTelefonoActor;
	}

	public void setExtTelefonoActor(String extTelefonoActor) {
		this.extTelefonoActor = extTelefonoActor;
	}

	public String getFaxActor() {
		return this.faxActor;
	}

	public void setFaxActor(String faxActor) {
		this.faxActor = faxActor;
	}

	public Date getFechaBajaActor() {
		return this.fechaBajaActor;
	}

	public void setFechaBajaActor(Date fechaBajaActor) {
		this.fechaBajaActor = fechaBajaActor;
	}

	public Date getFechaCreacionActor() {
		return this.fechaCreacionActor;
	}

	public void setFechaCreacionActor(Date fechaCreacionActor) {
		this.fechaCreacionActor = fechaCreacionActor;
	}

	public Date getFechaRescisionActor() {
		return this.fechaRescisionActor;
	}

	public void setFechaRescisionActor(Date fechaRescisionActor) {
		this.fechaRescisionActor = fechaRescisionActor;
	}

	public Date getFechaRevActor() {
		return this.fechaRevActor;
	}

	public void setFechaRevActor(Date fechaRevActor) {
		this.fechaRevActor = fechaRevActor;
	}

	public BigDecimal getFolioApp() {
		return this.folioApp;
	}

	public void setFolioApp(BigDecimal folioApp) {
		this.folioApp = folioApp;
	}

	public BigDecimal getFolioEntidad() {
		return this.folioEntidad;
	}

	public void setFolioEntidad(BigDecimal folioEntidad) {
		this.folioEntidad = folioEntidad;
	}

	public String getLocalizadorActor() {
		return this.localizadorActor;
	}

	public void setLocalizadorActor(String localizadorActor) {
		this.localizadorActor = localizadorActor;
	}

	public String getNombreActor() {
		return this.nombreActor;
	}

	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}

	public String getNumEmpleadoActor() {
		return this.numEmpleadoActor;
	}

	public void setNumEmpleadoActor(String numEmpleadoActor) {
		this.numEmpleadoActor = numEmpleadoActor;
	}

	public String getTelcelActor() {
		return this.telcelActor;
	}

	public void setTelcelActor(String telcelActor) {
		this.telcelActor = telcelActor;
	}

	public String getTelefonoActor() {
		return this.telefonoActor;
	}

	public void setTelefonoActor(String telefonoActor) {
		this.telefonoActor = telefonoActor;
	}

}
