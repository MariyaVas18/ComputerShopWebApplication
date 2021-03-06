package by.bsuir.computershop.dao.entity;
// Generated Feb 12, 2013 8:53:05 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Notebook generated by hbm2java
 */
public class Notebook  implements java.io.Serializable {


     private int idNotebook;
     private Type type;
     private String nameNotebook;
     private Date releaseDate;
     private String platform;
     private String processor;
     private int numberOfCores;
     private float weight;
     private float diagonal;
     private int operationMemory;
     private String hardDisk;
     private int battery;
     private float price;
     private Float discount;
     private Set<Purchase> purchases = new HashSet<Purchase>(0);

    public Notebook() {
    }

	
    public Notebook(int idNotebook, Type type, String nameNotebook, Date releaseDate, String platform, String processor, int numberOfCores, float weight, float diagonal, int operationMemory, String hardDisk, int battery, float price) {
        this.idNotebook = idNotebook;
        this.type = type;
        this.nameNotebook = nameNotebook;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.processor = processor;
        this.numberOfCores = numberOfCores;
        this.weight = weight;
        this.diagonal = diagonal;
        this.operationMemory = operationMemory;
        this.hardDisk = hardDisk;
        this.battery = battery;
        this.price = price;
    }
    public Notebook(int idNotebook, Type type, String nameNotebook, Date releaseDate, String platform, String processor, int numberOfCores, float weight, float diagonal, int operationMemory, String hardDisk, int battery, float price, Float discount, Set<Purchase> purchases) {
       this.idNotebook = idNotebook;
       this.type = type;
       this.nameNotebook = nameNotebook;
       this.releaseDate = releaseDate;
       this.platform = platform;
       this.processor = processor;
       this.numberOfCores = numberOfCores;
       this.weight = weight;
       this.diagonal = diagonal;
       this.operationMemory = operationMemory;
       this.hardDisk = hardDisk;
       this.battery = battery;
       this.price = price;
       this.discount = discount;
       this.purchases = purchases;
    }
   
    public int getIdNotebook() {
        return this.idNotebook;
    }
    
    public void setIdNotebook(int idNotebook) {
        this.idNotebook = idNotebook;
    }
    public Type getType() {
        return this.type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }
    public String getNameNotebook() {
        return this.nameNotebook;
    }
    
    public void setNameNotebook(String nameNotebook) {
        this.nameNotebook = nameNotebook;
    }
    public Date getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getProcessor() {
        return this.processor;
    }
    
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getNumberOfCores() {
        return this.numberOfCores;
    }
    
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
    public float getWeight() {
        return this.weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getDiagonal() {
        return this.diagonal;
    }
    
    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
    public int getOperationMemory() {
        return this.operationMemory;
    }
    
    public void setOperationMemory(int operationMemory) {
        this.operationMemory = operationMemory;
    }
    public String getHardDisk() {
        return this.hardDisk;
    }
    
    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
    public int getBattery() {
        return this.battery;
    }
    
    public void setBattery(int battery) {
        this.battery = battery;
    }
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    public Float getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Float discount) {
        this.discount = discount;
    }
    public Set<Purchase> getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }




}


