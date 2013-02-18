/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.abstractfactory;

import by.bsuir.computershop.abstractfactory.notebook.ExporterNotebook;
import by.bsuir.computershop.abstractfactory.pc.ExporterPersonalComputer;

/**
 *
 * @author 1
 */
public interface ExporterFactory {

    public ExporterNotebook createNotebook();

    public ExporterPersonalComputer createPersonalComputer();
}
