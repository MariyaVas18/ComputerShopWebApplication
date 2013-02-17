/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command;

import by.bsuir.computershop.manager.ConfigurationManager;
import java.io.IOException;
import javax.servlet.ServletException;

/**
 * Исполнитель действия, если команда, пришедшая из сервлелта, не известна.
 *
 * @author Mariya Vasilevskaya
 */
public class NoCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper)
            throws ServletException, IOException
             {
        String page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.MAIN_PATH);
        return page;
    }
}
