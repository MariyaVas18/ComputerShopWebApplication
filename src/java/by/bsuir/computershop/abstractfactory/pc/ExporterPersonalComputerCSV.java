/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.abstractfactory.pc;

import by.bsuir.computershop.dao.entity.Personalcomputer;
import java.util.List;

/**
 *
 * @author 1
 */
public class ExporterPersonalComputerCSV implements ExporterPersonalComputer{

    @Override
    public void saveToFilePC(List<Personalcomputer> persComputers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
