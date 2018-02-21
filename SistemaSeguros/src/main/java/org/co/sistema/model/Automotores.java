package org.co.sistema.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cesar
 */
@Entity
@Table(name = "automotores", catalog = "segurosdb", schema = "")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Automotores.findAll", query = "SELECT a FROM Automotores a"),
		@NamedQuery(name = "Automotores.findByConsecutivo", query = "SELECT a FROM Automotores a WHERE a.consecutivo = :consecutivo"),
		@NamedQuery(name = "Automotores.findByPlaca", query = "SELECT a FROM Automotores a WHERE a.placa = :placa"),
		@NamedQuery(name = "Automotores.findByFechavencimientosoat", query = "SELECT a FROM Automotores a WHERE a.fechavencimientosoat = :fechavencimientosoat"),
		@NamedQuery(name = "Automotores.findByFechavencimientopoliza", query = "SELECT a FROM Automotores a WHERE a.fechavencimientopoliza = :fechavencimientopoliza"),
		@NamedQuery(name = "Automotores.findByFechatecnicomecanica", query = "SELECT a FROM Automotores a WHERE a.fechatecnicomecanica = :fechatecnicomecanica"),
		@NamedQuery(name = "Automotores.findByFechapago", query = "SELECT a FROM Automotores a WHERE a.fechapago = :fechapago") })
public class Automotores implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "consecutivo", nullable = false)
	private Integer consecutivo;
	@Column(name = "placa", length = 20)
	private String placa;
	@Column(name = "fechavencimientosoat")
	@Temporal(TemporalType.DATE)
	private Date fechavencimientosoat;
	@Column(name = "fechavencimientopoliza")
	@Temporal(TemporalType.DATE)
	private Date fechavencimientopoliza;
	@Column(name = "fechatecnicomecanica")
	@Temporal(TemporalType.DATE)
	private Date fechatecnicomecanica;
	@Column(name = "fechapago")
	@Temporal(TemporalType.DATE)
	private Date fechapago;
	@JoinColumn(name = "consecutivoaseguradora", referencedColumnName = "consecutivo")
	@ManyToOne
	private Aseguradoras consecutivoaseguradora;
	@JoinColumn(name = "consecutivocliente", referencedColumnName = "consecutivo")
	@ManyToOne
	private Clientes consecutivocliente;
	@JoinColumn(name = "consecutivotipoautomotor", referencedColumnName = "consecutivo")
	@ManyToOne
	private Tipoautomotor consecutivotipoautomotor;
	@JoinColumn(name = "consecutivotipopago", referencedColumnName = "consecutivo")
	@ManyToOne
	private Tipopago consecutivotipopago;

	public Automotores() {
	}

	public Automotores(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Integer getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getFechavencimientosoat() {
		return fechavencimientosoat;
	}

	public void setFechavencimientosoat(Date fechavencimientosoat) {
		this.fechavencimientosoat = fechavencimientosoat;
	}

	public Date getFechavencimientopoliza() {
		return fechavencimientopoliza;
	}

	public void setFechavencimientopoliza(Date fechavencimientopoliza) {
		this.fechavencimientopoliza = fechavencimientopoliza;
	}

	public Date getFechatecnicomecanica() {
		return fechatecnicomecanica;
	}

	public void setFechatecnicomecanica(Date fechatecnicomecanica) {
		this.fechatecnicomecanica = fechatecnicomecanica;
	}

	public Date getFechapago() {
		return fechapago;
	}

	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}

	public Aseguradoras getConsecutivoaseguradora() {
		return consecutivoaseguradora;
	}

	public void setConsecutivoaseguradora(Aseguradoras consecutivoaseguradora) {
		this.consecutivoaseguradora = consecutivoaseguradora;
	}

	public Clientes getConsecutivocliente() {
		return consecutivocliente;
	}

	public void setConsecutivocliente(Clientes consecutivocliente) {
		this.consecutivocliente = consecutivocliente;
	}

	public Tipoautomotor getConsecutivotipoautomotor() {
		return consecutivotipoautomotor;
	}

	public void setConsecutivotipoautomotor(Tipoautomotor consecutivotipoautomotor) {
		this.consecutivotipoautomotor = consecutivotipoautomotor;
	}

	public Tipopago getConsecutivotipopago() {
		return consecutivotipopago;
	}

	public void setConsecutivotipopago(Tipopago consecutivotipopago) {
		this.consecutivotipopago = consecutivotipopago;
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
		if (!(object instanceof Automotores)) {
			return false;
		}
		Automotores other = (Automotores) object;
		if ((this.consecutivo == null && other.consecutivo != null)
				|| (this.consecutivo != null && !this.consecutivo.equals(other.consecutivo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Automotores [consecutivo=" + consecutivo + ", placa=" + placa + ", fechavencimientosoat="
				+ fechavencimientosoat + ", fechavencimientopoliza=" + fechavencimientopoliza
				+ ", fechatecnicomecanica=" + fechatecnicomecanica + ", fechapago=" + fechapago
				+ ", consecutivoaseguradora=" + consecutivoaseguradora + ", consecutivocliente=" + consecutivocliente
				+ ", consecutivotipoautomotor=" + consecutivotipoautomotor + ", consecutivotipopago="
				+ consecutivotipopago + "]";
	}

}
