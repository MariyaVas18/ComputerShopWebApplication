/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.abstractfactory.notebook;

import by.bsuir.computershop.dao.entity.Notebook;
import java.util.List;

/**
 *
 * @author 1
 */
public class ExporterNotebookCSV implements ExporterNotebook{

    @Override
    public void saveToFileNotebooks(List<Notebook> notebooks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
