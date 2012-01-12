/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import controller.controllerLoginKoki;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "login_koki")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginKoki.findAll", query = "SELECT l FROM LoginKoki l"),
    @NamedQuery(name = "LoginKoki.findById", query = "SELECT l FROM LoginKoki l WHERE l.id = :id"),
    @NamedQuery(name = "LoginKoki.findByPassword", query = "SELECT l FROM LoginKoki l WHERE l.password = :password")})
public class LoginKoki implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAMA")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOGINSTAT")
    private boolean loginstat;
    
    private static final long serialVersionUID = 1L;
    
    public LoginKoki() {
    }

    public LoginKoki(Integer id) {
        this.id = id;
    }

    public LoginKoki(Integer id, String password) {
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
        if (!(object instanceof LoginKoki)) {
            return false;
        }
        LoginKoki other = (LoginKoki) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LoginKoki[ id=" + id + " ]";
    }

    

    public LoginKoki(Integer id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    

    public LoginKoki(Integer id, String nama, String password, boolean loginstat) {
        this.id = id;
        this.nama = nama;
        this.password = password;
        this.loginstat = loginstat;
    }


    public Boolean getLoginstat() {
        return loginstat;
    }

    public void setLoginstat(boolean loginstat) {
        this.loginstat = loginstat;
    }

}
