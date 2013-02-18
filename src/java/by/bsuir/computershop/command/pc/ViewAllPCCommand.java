/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.pc;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.pc.MySQLPCDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForPC;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class ViewAllPCCommand implements Command{

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
         String page = null;
        try {
            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLPCDAO pcDAO = (MySQLPCDAO) mySQLFactory.getPCDAO();
            List<Personalcomputer> persComputers = pcDAO.getAllPersonalComputer();
            wrapper.getSession().setAttribute(EnumForPC.PERSONALCOMPUTERS.value(), persComputers);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/index.jsp";
        } catch (NumberFormatException ex) {
        }

        return page;
    }
    
}
