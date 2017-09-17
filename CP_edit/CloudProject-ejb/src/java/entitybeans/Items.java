/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitybeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stuti
 */
@Entity
@Table(name = "items", catalog = "webauction", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i")
    , @NamedQuery(name = "Items.findByItemid", query = "SELECT i FROM Items i WHERE i.itemid = :itemid")
    , @NamedQuery(name = "Items.findByItemname", query = "SELECT i FROM Items i WHERE i.itemname = :itemname")
    , @NamedQuery(name = "Items.findByDescription", query = "SELECT i FROM Items i WHERE i.description = :description")
    , @NamedQuery(name = "Items.findBySummary", query = "SELECT i FROM Items i WHERE i.summary = :summary")
    , @NamedQuery(name = "Items.findByStartprice", query = "SELECT i FROM Items i WHERE i.startprice = :startprice")
    , @NamedQuery(name = "Items.findByIncrPrice", query = "SELECT i FROM Items i WHERE i.incrPrice = :incrPrice")
    , @NamedQuery(name = "Items.findByStdate", query = "SELECT i FROM Items i WHERE i.stdate = :stdate")
    , @NamedQuery(name = "Items.findByEnddate", query = "SELECT i FROM Items i WHERE i.enddate = :enddate")
    , @NamedQuery(name = "Items.findByBidcnt", query = "SELECT i FROM Items i WHERE i.bidcnt = :bidcnt")})
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "itemid")
    private String itemid;
    @Size(max = 20)
    @Column(name = "itemname")
    private String itemname;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @Size(max = 50)
    @Column(name = "summary")
    private String summary;
    @Size(max = 8)
    @Column(name = "startprice")
    private String startprice;
    @Size(max = 5)
    @Column(name = "incr_price")
    private String incrPrice;
    @Column(name = "stdate")
    @Temporal(TemporalType.DATE)
    private Date stdate;
    @Column(name = "enddate")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 4)
    @Column(name = "bidcnt")
    private String bidcnt;
    @JoinColumn(name = "catid", referencedColumnName = "cat_id")
    @ManyToOne
    private Category catid;
    @JoinColumn(name = "sellerid", referencedColumnName = "uname")
    @ManyToOne
    private UserRegister sellerid;

    public Items() {
    }

    public Items(String itemid) {
        this.itemid = itemid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStartprice() {
        return startprice;
    }

    public void setStartprice(String startprice) {
        this.startprice = startprice;
    }

    public String getIncrPrice() {
        return incrPrice;
    }

    public void setIncrPrice(String incrPrice) {
        this.incrPrice = incrPrice;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getBidcnt() {
        return bidcnt;
    }

    public void setBidcnt(String bidcnt) {
        this.bidcnt = bidcnt;
    }

    public Category getCatid() {
        return catid;
    }

    public void setCatid(Category catid) {
        this.catid = catid;
    }

    public UserRegister getSellerid() {
        return sellerid;
    }

    public void setSellerid(UserRegister sellerid) {
        this.sellerid = sellerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitybeans.Items[ itemid=" + itemid + " ]";
    }
    
}
