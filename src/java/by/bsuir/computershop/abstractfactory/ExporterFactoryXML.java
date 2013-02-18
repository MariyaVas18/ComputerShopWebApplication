/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.abstractfactory;

import by.bsuir.computershop.abstractfactory.notebook.ExporterNotebook;
import by.bsuir.computershop.abstractfactory.notebook.ExporterNotebookXML;
import by.bsuir.computershop.abstractfactory.pc.ExporterPersonalComputer;
import by.bsuir.computershop.abstractfactory.pc.ExporterPersonalComputerXML;

/**
 *
 * @author 1
 */
public class ExporterFactoryXML implements ExporterFactory {

    @Override
    public ExporterNotebook createNotebook() {

        return new ExporterNotebookXML();
    }

    @Override
    public ExporterPersonalComputer createPersonalComputer() {
        return new ExporterPersonalComputerXML();
    }
}
