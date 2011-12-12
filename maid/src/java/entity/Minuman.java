/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "minuman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Minuman.findAll", query = "SELECT m FROM Minuman m"),
    @NamedQuery(name = "Minuman.findById", query = "SELECT m FROM Minuman m WHERE m.id = :id"),
    @NamedQuery(name = "Minuman.findBySodagembira", query = "SELECT m FROM Minuman m WHERE m.sodagembira = :sodagembira"),
    @NamedQuery(name = "Minuman.findByEsteh", query = "SELECT m FROM Minuman m WHERE m.esteh = :esteh"),
    @NamedQuery(name = "Minuman.findByEsjerukl", query = "SELECT m FROM Minuman m WHERE m.esjerukl = :esjerukl"),
    @NamedQuery(name = "Minuman.findByEsdawet", query = "SELECT m FROM Minuman m WHERE m.esdawet = :esdawet")})
public class Minuman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Sodagembira")
    private String sodagembira;
    @Basic(optional = false)
    @Column(name = "Esteh")
    private String esteh;
    @Basic(optional = false)
    @Column(name = "Esjerukl")
    private String esjerukl;
    @Basic(optional = false)
    @Column(name = "Esdawet")
    private String esdawet;

    public Minuman() {
    }

    public Minuman(Integer id) {
        this.id = id;
    }

    public Minuman(Integer id, String sodagembira, String esteh, String esjerukl, String esdawet) {
        this.id = id;
        this.sodagembira = sodagembira;
        this.esteh = esteh;
        this.esjerukl = esjerukl;
        this.esdawet = esdawet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSodagembira() {
        return sodagembira;
    }

    public void setSodagembira(String sodagembira) {
        this.sodagembira = sodagembira;
    }

    public String getEsteh() {
        return esteh;
    }

    public void setEsteh(String esteh) {
        this.esteh = esteh;
    }

    public String getEsjerukl() {
        return esjerukl;
    }

    public void setEsjerukl(String esjerukl) {
        this.esjerukl = esjerukl;
    }

    public String getEsdawet() {
        return esdawet;
    }

    public void setEsdawet(String esdawet) {
        this.esdawet = esdawet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Minuman)) {
            return false;
        }
        Minuman other = (Minuman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Minuman[ id=" + id + " ]";
    }
    
}
