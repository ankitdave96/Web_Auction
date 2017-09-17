/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitybeans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stuti
 */
@Entity
@Table(name = "user_register")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRegister.findAll", query = "SELECT u FROM UserRegister u")
    , @NamedQuery(name = "UserRegister.findByUname", query = "SELECT u FROM UserRegister u WHERE u.uname = :uname")
    , @NamedQuery(name = "UserRegister.findByPwd", query = "SELECT u FROM UserRegister u WHERE u.pwd = :pwd")
    , @NamedQuery(name = "UserRegister.findByFname", query = "SELECT u FROM UserRegister u WHERE u.fname = :fname")
    , @NamedQuery(name = "UserRegister.findByLname", query = "SELECT u FROM UserRegister u WHERE u.lname = :lname")
    , @NamedQuery(name = "UserRegister.findByEmail", query = "SELECT u FROM UserRegister u WHERE u.email = :email")
    , @NamedQuery(name = "UserRegister.findByPhno", query = "SELECT u FROM UserRegister u WHERE u.phno = :phno")
    , @NamedQuery(name = "UserRegister.findByAddress", query = "SELECT u FROM UserRegister u WHERE u.address = :address")
    , @NamedQuery(name = "UserRegister.findByCity", query = "SELECT u FROM UserRegister u WHERE u.city = :city")
    , @NamedQuery(name = "UserRegister.findByState", query = "SELECT u FROM UserRegister u WHERE u.state = :state")
    , @NamedQuery(name = "UserRegister.findByPin", query = "SELECT u FROM UserRegister u WHERE u.pin = :pin")
    , @NamedQuery(name = "UserRegister.findByCountry", query = "SELECT u FROM UserRegister u WHERE u.country = :country")
    , @NamedQuery(name = "UserRegister.findByCcardno", query = "SELECT u FROM UserRegister u WHERE u.ccardno = :ccardno")})
public class UserRegister implements Serializable {

    @OneToMany(mappedBy = "sellerid")
    private Collection<Items> itemsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "uname")
    private String uname;
    @Size(max = 20)
    @Column(name = "pwd")
    private String pwd;
    @Size(max = 20)
    @Column(name = "fname")
    private String fname;
    @Size(max = 20)
    @Column(name = "lname")
    private String lname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "phno")
    private String phno;
    @Size(max = 20)
    @Column(name = "address")
    private String address;
    @Size(max = 20)
    @Column(name = "city")
    private String city;
    @Size(max = 20)
    @Column(name = "state")
    private String state;
    @Size(max = 20)
    @Column(name = "pin")
    private String pin;
    @Size(max = 20)
    @Column(name = "country")
    private String country;
    @Size(max = 16)
    @Column(name = "ccardno")
    private String ccardno;

    public UserRegister() {
    }

    public UserRegister(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCcardno() {
        return ccardno;
    }

    public void setCcardno(String ccardno) {
        this.ccardno = ccardno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uname != null ? uname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRegister)) {
            return false;
        }
        UserRegister other = (UserRegister) object;
        if ((this.uname == null && other.uname != null) || (this.uname != null && !this.uname.equals(other.uname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitybeans.UserRegister[ uname=" + uname + " ]";
    }

    @XmlTransient
    public Collection<Items> getItemsCollection() {
        return itemsCollection;
    }

    public void setItemsCollection(Collection<Items> itemsCollection) {
        this.itemsCollection = itemsCollection;
    }
    
}
