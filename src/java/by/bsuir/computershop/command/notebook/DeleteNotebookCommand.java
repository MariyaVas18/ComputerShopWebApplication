/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.notebook;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class DeleteNotebookCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page;

        HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
        int idNotebook = Integer.parseInt((String) requestParam.get(EnumForNotebook.IDNOTEBOOK.value()));
        DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
        MySQLNotebookDAO notebookDAO = (MySQLNotebookDAO) mySQLFactory.getNotebookDAO();

        notebookDAO.deleteNotebookById(idNotebook);

        List<Notebook> notebooks = notebookDAO.getAllNotebook();
        wrapper.getSession().setAttribute(EnumForNotebook.NOTEBOOKS.value(), notebooks);

        page = "/index.jsp";
        return page;
    }
}
