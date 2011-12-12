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
@Table(name = "login_kasir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginKasir.findAll", query = "SELECT l FROM LoginKasir l"),
    @NamedQuery(name = "LoginKasir.findById", query = "SELECT l FROM LoginKasir l WHERE l.id = :id"),
    @NamedQuery(name = "LoginKasir.findByPassword", query = "SELECT l FROM LoginKasir l WHERE l.password = :password")})
public class LoginKasir implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;

    public LoginKasir() {
    }

    public LoginKasir(Integer id) {
        this.id = id;
    }

    public LoginKasir(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof LoginKasir)) {
            return false;
        }
        LoginKasir other = (LoginKasir) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LoginKasir[ id=" + id + " ]";
    }
    
}
