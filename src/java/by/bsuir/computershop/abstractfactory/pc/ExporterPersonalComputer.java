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
public interface ExporterPersonalComputer {

    public void saveToFilePC(List<Personalcomputer> persComputers);
}
