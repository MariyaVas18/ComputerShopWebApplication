/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.abstractfactory;

import by.bsuir.computershop.abstractfactory.notebook.ExporterNotebook;
import by.bsuir.computershop.abstractfactory.notebook.ExporterNotebookCSV;
import by.bsuir.computershop.abstractfactory.pc.ExporterPersonalComputer;
import by.bsuir.computershop.abstractfactory.pc.ExporterPersonalComputerCSV;

/**
 *
 * @author 1
 */
public class ExporterFactoryCSV implements ExporterFactory {

    @Override
    public ExporterNotebook createNotebook() {
        return new ExporterNotebookCSV();
    }

    @Override
    public ExporterPersonalComputer createPersonalComputer() {
        return new ExporterPersonalComputerCSV();
    }
}
