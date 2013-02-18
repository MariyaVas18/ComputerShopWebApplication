/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command;

import java.io.IOException;
import javax.servlet.ServletException;

/**
 * Исполнитель команд, приходящих из сервлелта.
 *
 * @author Mariya Vasilevskaya
 */
public interface Command {

   
    public String execute(WrapperParameter wrapper)
            throws ServletException, IOException;
}
