/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.notebook;

import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.entity.Purchase;
import by.bsuir.computershop.dao.entity.Type;
import java.util.Date;

/**
 *
 * @author 1
 */
public class FillingObjects {
    
    public Notebook fillObjectNotebookForAdding(Type type, String nameNotebook, Date releaseDate,
            String platform, String processor, int numberOfCores, float weight, float diagonal,
            int operationMemory, String hardDisk, int battery, float price, Float discount) {
        
        Notebook notebook = new Notebook();
        notebook.setBattery(battery);
        notebook.setDiagonal(diagonal);
        notebook.setDiscount(discount);
        notebook.setHardDisk(hardDisk);
        notebook.setNameNotebook(nameNotebook);
        notebook.setNumberOfCores(numberOfCores);
        notebook.setOperationMemory(operationMemory);
        notebook.setPlatform(platform);
        notebook.setPrice(price);
        notebook.setProcessor(processor);
        notebook.setReleaseDate(releaseDate);
        notebook.setType(type);
        notebook.setWeight(weight);
        
        return notebook;
    }

    public Notebook fillObjectNotebookForEdit(int idNotebook, Type type, String nameNotebook, Date releaseDate,
            String platform, String processor, int numberOfCores, float weight, float diagonal,
            int operationMemory, String hardDisk, int battery, float price, Float discount) {
        
        Notebook notebook = new Notebook();
        notebook.setIdNotebook(idNotebook);
        notebook.setBattery(battery);
        notebook.setDiagonal(diagonal);
        notebook.setDiscount(discount);
        notebook.setHardDisk(hardDisk);
        notebook.setNameNotebook(nameNotebook);
        notebook.setNumberOfCores(numberOfCores);
        notebook.setOperationMemory(operationMemory);
        notebook.setPlatform(platform);
        notebook.setPrice(price);
        notebook.setProcessor(processor);
        notebook.setReleaseDate(releaseDate);
        notebook.setType(type);
        notebook.setWeight(weight);
        
        return notebook;
    }

    public Personalcomputer fillObjectPCForAdding(Type type, String namePC, Date releaseDate,
            String platform, String processor, int numberOfCores, float weight, float diagonal,
            int operationMemory, int hardDisk, float price, Float discount) {
        Personalcomputer pc = new Personalcomputer();
        
        pc.setDiagonal(diagonal);
        pc.setDiscount(discount);
        pc.setHardDisk(hardDisk);
        pc.setNamePc(namePC);
        pc.setNumberOfCores(numberOfCores);
        pc.setOperationMemory(operationMemory);
        pc.setPlatform(platform);
        pc.setPrice(price);
        pc.setProcessor(processor);
        pc.setReleaseDate(releaseDate);
        pc.setType(type);
        pc.setWeight(weight);
        return pc;
    }
    public Personalcomputer fillObjectPCForEdit(int idPC, Type type, String namePC, Date releaseDate,
            String platform, String processor, int numberOfCores, float weight, float diagonal,
            int operationMemory, int hardDisk, float price, Float discount) {
        Personalcomputer pc = new Personalcomputer();
        
        pc.setIdPersonalComputer(idPC);
        pc.setDiagonal(diagonal);
        pc.setDiscount(discount);
        pc.setHardDisk(hardDisk);
        pc.setNamePc(namePC);
        pc.setNumberOfCores(numberOfCores);
        pc.setOperationMemory(operationMemory);
        pc.setPlatform(platform);
        pc.setPrice(price);
        pc.setProcessor(processor);
        pc.setReleaseDate(releaseDate);
        pc.setType(type);
        pc.setWeight(weight);
        return pc;
    }
    public Purchase fillObjectPurchaseForAdding(float cost, Date date) {
        Purchase purchase = new Purchase();
        
        purchase.setCost(cost);
        purchase.setDate(date);
        return purchase;
    }
}
