/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioalimentos.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AndresA
 */
@Entity
@Table(name = "BENEFICIARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiario.findAll", query = "SELECT b FROM Beneficiario b")
    , @NamedQuery(name = "Beneficiario.findByIdbeneficiario", query = "SELECT b FROM Beneficiario b WHERE b.idbeneficiario = :idbeneficiario")
    , @NamedQuery(name = "Beneficiario.findByNombre", query = "SELECT b FROM Beneficiario b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Beneficiario.findByApellido", query = "SELECT b FROM Beneficiario b WHERE b.apellido = :apellido")
    , @NamedQuery(name = "Beneficiario.findByCedula", query = "SELECT b FROM Beneficiario b WHERE b.cedula = :cedula")})
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDBENEFICIARIO")
    private Integer idbeneficiario;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CEDULA")
    private String cedula;

    public Beneficiario() {
    }

    public Beneficiario(Integer idbeneficiario) {
        this.idbeneficiario = idbeneficiario;
    }

    public Integer getIdbeneficiario() {
        return idbeneficiario;
    }

    public void setIdbeneficiario(Integer idbeneficiario) {
        this.idbeneficiario = idbeneficiario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbeneficiario != null ? idbeneficiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiario)) {
            return false;
        }
        Beneficiario other = (Beneficiario) object;
        if ((this.idbeneficiario == null && other.idbeneficiario != null) || (this.idbeneficiario != null && !this.idbeneficiario.equals(other.idbeneficiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventarioalimentos.persistencia.Beneficiario[ idbeneficiario=" + idbeneficiario + " ]";
    }
    
}
