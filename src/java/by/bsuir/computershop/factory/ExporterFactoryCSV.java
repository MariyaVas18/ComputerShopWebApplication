/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.factory;

import by.bsuir.computershop.factory.notebook.ExporterNotebook;
import by.bsuir.computershop.factory.notebook.ExporterNotebookCSV;
import by.bsuir.computershop.factory.pc.ExporterPersonalComputer;
import by.bsuir.computershop.factory.pc.ExporterPersonalComputerCSV;

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
