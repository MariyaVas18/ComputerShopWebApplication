/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.pc;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.dao.pc.MySQLPCDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import by.bsuir.computershop.webenum.EnumForPC;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class DeletePCCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page;

        HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
        int idPC = Integer.parseInt((String) requestParam.get(EnumForPC.IDPERSONALCOMPUTER.value()));
        DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
        MySQLPCDAO pcDAO = (MySQLPCDAO) mySQLFactory.getPCDAO();

        pcDAO.deletePersonalComputerById(idPC);

        List<Personalcomputer> persComputers = pcDAO.getAllPersonalComputer();
        wrapper.getSession().setAttribute(EnumForPC.PERSONALCOMPUTERS.value(), persComputers);

        page = "/index.jsp";
        return page;
    }
}
