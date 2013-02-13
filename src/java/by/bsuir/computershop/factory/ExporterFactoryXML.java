/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.factory;

import by.bsuir.computershop.factory.notebook.ExporterNotebook;
import by.bsuir.computershop.factory.notebook.ExporterNotebookXML;
import by.bsuir.computershop.factory.pc.ExporterPersonalComputer;
import by.bsuir.computershop.factory.pc.ExporterPersonalComputerXML;

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
