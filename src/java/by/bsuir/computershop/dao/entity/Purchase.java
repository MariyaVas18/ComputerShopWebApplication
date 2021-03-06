package by.bsuir.computershop.dao.entity;
// Generated Feb 12, 2013 8:53:05 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchase generated by hbm2java
 */
public class Purchase  implements java.io.Serializable {


     private int idPurchase;
     private Date date;
     private Float cost;
     private Set<Personalcomputer> personalcomputers = new HashSet<Personalcomputer>(0);
     private Set<Notebook> notebooks = new HashSet<Notebook>(0);

    public Purchase() {
    }

	
    public Purchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public Purchase(int idPurchase, Date date, Float cost, Set<Personalcomputer> personalcomputers, Set<Notebook> notebooks) {
       this.idPurchase = idPurchase;
       this.date = date;
       this.cost = cost;
       this.personalcomputers = personalcomputers;
       this.notebooks = notebooks;
    }
   
    public int getIdPurchase() {
        return this.idPurchase;
    }
    
    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Float getCost() {
        return this.cost;
    }
    
    public void setCost(Float cost) {
        this.cost = cost;
    }
    public Set<Personalcomputer> getPersonalcomputers() {
        return this.personalcomputers;
    }
    
    public void setPersonalcomputers(Set<Personalcomputer> personalcomputers) {
        this.personalcomputers = personalcomputers;
    }
    public Set<Notebook> getNotebooks() {
        return this.notebooks;
    }
    
    public void setNotebooks(Set<Notebook> notebooks) {
        this.notebooks = notebooks;
    }




}


