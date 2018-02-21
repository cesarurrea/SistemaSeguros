package org.co.sistema.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "clientes", catalog = "segurosdb", schema = "", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "tipodocumento", "documento" }) })
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
		@NamedQuery(name = "Clientes.findByConsecutivo", query = "SELECT c FROM Clientes c WHERE c.consecutivo = :consecutivo"),
		@NamedQuery(name = "Clientes.findByTipodocumento", query = "SELECT c FROM Clientes c WHERE c.tipodocumento = :tipodocumento"),
		@NamedQuery(name = "Clientes.findByDocumento", query = "SELECT c FROM Clientes c WHERE c.documento = :documento"),
		@NamedQuery(name = "Clientes.findByNombres", query = "SELECT c FROM Clientes c WHERE c.nombres = :nombres"),
		@NamedQuery(name = "Clientes.findByApellidos", query = "SELECT c FROM Clientes c WHERE c.apellidos = :apellidos"),
		@NamedQuery(name = "Clientes.findByTelefonosfijos", query = "SELECT c FROM Clientes c WHERE c.telefonosfijos = :telefonosfijos"),
		@NamedQuery(name = "Clientes.findByCelulares", query = "SELECT c FROM Clientes c WHERE c.celulares = :celulares"),
		@NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
		@NamedQuery(name = "Clientes.findByFechanacimiento", query = "SELECT c FROM Clientes c WHERE c.fechanacimiento = :fechanacimiento") })
public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "consecutivo", nullable = false)
	private Integer consecutivo;
	@Basic(optional = false)
	@Column(name = "tipodocumento", nullable = false, length = 2)
	private String tipodocumento;
	@Basic(optional = false)
	@Column(name = "documento", nullable = false, length = 15)
	private String documento;
	@Column(name = "nombres", length = 60)
	private String nombres;
	@Column(name = "apellidos", length = 60)
	private String apellidos;
	@Column(name = "telefonosfijos", length = 60)
	private String telefonosfijos;
	@Column(name = "celulares", length = 60)
	private String celulares;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "fechanacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;
	@OneToMany(mappedBy = "consecutivocliente")
	private Collection<Automotores> automotoresCollection;

	public Clientes() {
	}

	public Clientes(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Clientes(Integer consecutivo, String tipodocumento, String documento) {
		this.consecutivo = consecutivo;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
	}

	public Integer getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefonosfijos() {
		return telefonosfijos;
	}

	public void setTelefonosfijos(String telefonosfijos) {
		this.telefonosfijos = telefonosfijos;
	}

	public String getCelulares() {
		return celulares;
	}

	public void setCelulares(String celulares) {
		this.celulares = celulares;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@XmlTransient
	public Collection<Automotores> getAutomotoresCollection() {
		return automotoresCollection;
	}

	public void setAutomotoresCollection(Collection<Automotores> automotoresCollection) {
		this.automotoresCollection = automotoresCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (consecutivo != null ? consecutivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Clientes)) {
			return false;
		}
		Clientes other = (Clientes) object;
		if ((this.consecutivo == null && other.consecutivo != null)
				|| (this.consecutivo != null && !this.consecutivo.equals(other.consecutivo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Clientes [consecutivo=" + consecutivo + ", tipodocumento=" + tipodocumento + ", documento=" + documento
				+ ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefonosfijos=" + telefonosfijos
				+ ", celulares=" + celulares + ", email=" + email + ", fechanacimiento=" + fechanacimiento
				+ ", automotoresCollection=" + automotoresCollection + "]";
	}

}
