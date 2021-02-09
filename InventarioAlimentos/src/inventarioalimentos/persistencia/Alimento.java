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
@Table(name = "ALIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alimento.findAll", query = "SELECT a FROM Alimento a")
    , @NamedQuery(name = "Alimento.findByIdalimento", query = "SELECT a FROM Alimento a WHERE a.idalimento = :idalimento")
    , @NamedQuery(name = "Alimento.findByNombrealimento", query = "SELECT a FROM Alimento a WHERE a.nombrealimento = :nombrealimento")
    , @NamedQuery(name = "Alimento.findByCategoria", query = "SELECT a FROM Alimento a WHERE a.categoria = :categoria")
    , @NamedQuery(name = "Alimento.findByTipo", query = "SELECT a FROM Alimento a WHERE a.tipo = :tipo")
    , @NamedQuery(name = "Alimento.findByFecharecepcion", query = "SELECT a FROM Alimento a WHERE a.fecharecepcion = :fecharecepcion")
    , @NamedQuery(name = "Alimento.findByFechacaducidad", query = "SELECT a FROM Alimento a WHERE a.fechacaducidad = :fechacaducidad")
    , @NamedQuery(name = "Alimento.findByCantidad", query = "SELECT a FROM Alimento a WHERE a.cantidad = :cantidad")})
public class Alimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDALIMENTO")
    private Integer idalimento;
    @Column(name = "NOMBREALIMENTO")
    private String nombrealimento;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "FECHARECEPCION")
    private String fecharecepcion;
    @Column(name = "FECHACADUCIDAD")
    private String fechacaducidad;
    @Column(name = "CANTIDAD")
    private Integer cantidad;

    public Alimento() {
    }

    public Alimento(Integer idalimento) {
        this.idalimento = idalimento;
    }

    public Integer getIdalimento() {
        return idalimento;
    }

    public void setIdalimento(Integer idalimento) {
        this.idalimento = idalimento;
    }

    public String getNombrealimento() {
        return nombrealimento;
    }

    public void setNombrealimento(String nombrealimento) {
        this.nombrealimento = nombrealimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecharecepcion() {
        return fecharecepcion;
    }

    public void setFecharecepcion(String fecharecepcion) {
        this.fecharecepcion = fecharecepcion;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalimento != null ? idalimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alimento)) {
            return false;
        }
        Alimento other = (Alimento) object;
        if ((this.idalimento == null && other.idalimento != null) || (this.idalimento != null && !this.idalimento.equals(other.idalimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventarioalimentos.persistencia.Alimento[ idalimento=" + idalimento + " ]";
    }
    
}
