/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.notebook;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Type;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.FillingObjects;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.dao.type.MySQLTypeDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import by.bsuir.computershop.webenum.EnumForType;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class PrepareEditPriceOrDicountNotebookCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            int idNotebook = Integer.parseInt((String) requestParam.get(EnumForNotebook.IDNOTEBOOK.value()));

            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLNotebookDAO notebookDAO = (MySQLNotebookDAO) mySQLFactory.getNotebookDAO();
            MySQLTypeDAO typeDAO = (MySQLTypeDAO) mySQLFactory.getTypeDAO();
            Type type = typeDAO.getTypeByID(notebookDAO.getNotebookById(idNotebook).getType().getIdType());
            wrapper.getSession().setAttribute(EnumForType.TYPE.value(), type);

            Notebook notebook = notebookDAO.getNotebookById(idNotebook);

            wrapper.getSession().setAttribute(EnumForNotebook.NOTEBOOK.value(), notebook);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/editingNotebook.jsp";
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
