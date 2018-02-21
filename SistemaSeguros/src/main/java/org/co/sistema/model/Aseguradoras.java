package org.co.sistema.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "aseguradoras", catalog = "segurosdb", schema = "")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Aseguradoras.findAll", query = "SELECT a FROM Aseguradoras a"),
		@NamedQuery(name = "Aseguradoras.findByConsecutivo", query = "SELECT a FROM Aseguradoras a WHERE a.consecutivo = :consecutivo"),
		@NamedQuery(name = "Aseguradoras.findByNit", query = "SELECT a FROM Aseguradoras a WHERE a.nit = :nit"),
		@NamedQuery(name = "Aseguradoras.findByNombre", query = "SELECT a FROM Aseguradoras a WHERE a.nombre = :nombre"),
		@NamedQuery(name = "Aseguradoras.findByContacto", query = "SELECT a FROM Aseguradoras a WHERE a.contacto = :contacto"),
		@NamedQuery(name = "Aseguradoras.findByTelefonocontacto", query = "SELECT a FROM Aseguradoras a WHERE a.telefonocontacto = :telefonocontacto"),
		@NamedQuery(name = "Aseguradoras.findByObservaciones", query = "SELECT a FROM Aseguradoras a WHERE a.observaciones = :observaciones") })
public class Aseguradoras implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "consecutivo", nullable = false)
	private Integer consecutivo;
	@Basic(optional = false)
	@Column(name = "nit", nullable = false, length = 20)
	private String nit;
	@Basic(optional = false)
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	@Column(name = "contacto", length = 60)
	private String contacto;
	@Column(name = "telefonocontacto", length = 50)
	private String telefonocontacto;
	@Column(name = "observaciones", length = 200)
	private String observaciones;
	@JsonIgnore
	@OneToMany(mappedBy = "consecutivoaseguradora")
	private Collection<Automotores> automotoresCollection;

	public Aseguradoras() {
	}

	public Aseguradoras(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Aseguradoras(Integer consecutivo, String nit, String nombre) {
		this.consecutivo = consecutivo;
		this.nit = nit;
		this.nombre = nombre;
	}

	public Integer getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getTelefonocontacto() {
		return telefonocontacto;
	}

	public void setTelefonocontacto(String telefonocontacto) {
		this.telefonocontacto = telefonocontacto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
		if (!(object instanceof Aseguradoras)) {
			return false;
		}
		Aseguradoras other = (Aseguradoras) object;
		if ((this.consecutivo == null && other.consecutivo != null)
				|| (this.consecutivo != null && !this.consecutivo.equals(other.consecutivo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Aseguradoras [consecutivo=" + consecutivo + ", nit=" + nit + ", nombre=" + nombre + ", contacto="
				+ contacto + ", telefonocontacto=" + telefonocontacto + ", observaciones=" + observaciones
				+ ", automotoresCollection=" + automotoresCollection + "]";
	}

}
