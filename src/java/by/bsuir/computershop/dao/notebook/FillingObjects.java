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

    public Notebook fillObjectNotebook(Type type, String nameNotebook, Date releaseDate,
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

    public Personalcomputer fillObjectPC(Type type, String namePC, Date releaseDate,
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
}
