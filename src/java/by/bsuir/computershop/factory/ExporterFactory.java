/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.factory;

import by.bsuir.computershop.factory.notebook.ExporterNotebook;
import by.bsuir.computershop.factory.pc.ExporterPersonalComputer;

/**
 *
 * @author 1
 */
public interface ExporterFactory {

    public ExporterNotebook createNotebook();

    public ExporterPersonalComputer createPersonalComputer();
}
