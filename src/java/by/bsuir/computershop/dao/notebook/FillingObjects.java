/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.notebook;

import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.entity.Type;
import java.util.Date;

/**
 *
 * @author 1
 */
public class FillingObjects {
    
    public Notebook fillObjectNotebook(String type, String nameNotebook, Date releaseDate, 
            String platform, String processor, int numberOfCores, float weight, float diagonal, 
            int operationMemory, String hardDisk, int battery, float price, Float discount){
        Type typeOfNotebook = new Type();
        typeOfNotebook.setNameType(type);
        
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
        notebook.setType(typeOfNotebook);
        notebook.setWeight(weight);
      
        return notebook;
    }
    
    public Personalcomputer fillObjectPC(){
        Personalcomputer pc = new Personalcomputer();
        return pc;
    }
}
