/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.pc;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.entity.Type;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.dao.pc.MySQLPCDAO;
import by.bsuir.computershop.dao.type.MySQLTypeDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import by.bsuir.computershop.webenum.EnumForPC;
import by.bsuir.computershop.webenum.EnumForType;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class PrepareEditPriceOrDicountPCCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            int idPC = Integer.parseInt((String) requestParam.get(EnumForPC.IDPERSONALCOMPUTER.value()));

            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLPCDAO pcDAO = (MySQLPCDAO) mySQLFactory.getPCDAO();
            MySQLTypeDAO typeDAO = (MySQLTypeDAO) mySQLFactory.getTypeDAO();
            Type type = typeDAO.getTypeByID(pcDAO.getPersonalComputerById(idPC).getType().getIdType());
            wrapper.getSession().setAttribute(EnumForType.TYPE.value(), type);

            Personalcomputer pc = pcDAO.getPersonalComputerById(idPC);

            wrapper.getSession().setAttribute(EnumForPC.PC.value(), pc);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/editingPC.jsp";
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
