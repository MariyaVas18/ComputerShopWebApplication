/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.coomand.notebook;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.manager.ConfigurationManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.webenum.EnumForNotebook;

public class ViewAllNotebookCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLNotebookDAO notebookDAO = (MySQLNotebookDAO) mySQLFactory.getNotebookDAO();
            List<Notebook> notebooks = notebookDAO.getAllNotebook();
            wrapper.getSession().setAttribute(EnumForNotebook.NOTEBOOKS.value(), notebooks);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/index.jsp";
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
