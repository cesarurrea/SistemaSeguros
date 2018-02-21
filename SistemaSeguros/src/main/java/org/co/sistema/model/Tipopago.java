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

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "tipopago", catalog = "segurosdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopago.findAll", query = "SELECT t FROM Tipopago t")
    , @NamedQuery(name = "Tipopago.findByConsecutivo", query = "SELECT t FROM Tipopago t WHERE t.consecutivo = :consecutivo")
    , @NamedQuery(name = "Tipopago.findByNombre", query = "SELECT t FROM Tipopago t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tipopago.findByObservaciones", query = "SELECT t FROM Tipopago t WHERE t.observaciones = :observaciones")})
public class Tipopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consecutivo", nullable = false)
    private Integer consecutivo;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;
    @Column(name = "observaciones", length = 200)
    private String observaciones;
    @OneToMany(mappedBy = "consecutivotipopago")
    private Collection<Automotores> automotoresCollection;

    public Tipopago() {
    }

    public Tipopago(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Tipopago(Integer consecutivo, String nombre) {
        this.consecutivo = consecutivo;
        this.nombre = nombre;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Tipopago)) {
            return false;
        }
        Tipopago other = (Tipopago) object;
        if ((this.consecutivo == null && other.consecutivo != null) || (this.consecutivo != null && !this.consecutivo.equals(other.consecutivo))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Tipopago [consecutivo=" + consecutivo + ", nombre=" + nombre + ", observaciones=" + observaciones
				+ ", automotoresCollection=" + automotoresCollection + "]";
	}

    
    
}
