/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.pc;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.command.notebook.*;
import by.bsuir.computershop.dao.entity.Personalcomputer;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.FillingObjects;
import by.bsuir.computershop.dao.pc.MySQLPCDAO;
import by.bsuir.computershop.dao.type.MySQLTypeDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForPC;
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
public class EditPriceOrDiscountPCCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            int idType = Integer.parseInt((String) requestParam.get(EnumForPC.IDTYPE.value()));
            int idPC = Integer.parseInt((String) requestParam.get(EnumForPC.IDPERSONALCOMPUTER.value()));
            float price = Float.parseFloat((String) requestParam.get(EnumForPC.PRICE.value()));
            Float discount = Float.parseFloat((String) requestParam.get(EnumForPC.DISCOUNT.value()));

            FillingObjects pcObjForFill = new FillingObjects();

            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLPCDAO pcDAO = (MySQLPCDAO) mySQLFactory.getPCDAO();
            MySQLTypeDAO typeDAO = (MySQLTypeDAO) mySQLFactory.getTypeDAO();

            pcDAO.updatePersonalComputer(pcObjForFill.fillObjectPCForEdit(idPC, typeDAO.getTypeByID(idType),
                    pcDAO.getPersonalComputerById(idPC).getNamePc(), pcDAO.getPersonalComputerById(idPC).getReleaseDate(),
                    pcDAO.getPersonalComputerById(idPC).getPlatform(), pcDAO.getPersonalComputerById(idPC).getProcessor(),
                    pcDAO.getPersonalComputerById(idPC).getNumberOfCores(), pcDAO.getPersonalComputerById(idPC).getWeight(),
                    pcDAO.getPersonalComputerById(idPC).getDiagonal(), pcDAO.getPersonalComputerById(idPC).getOperationMemory(),
                    pcDAO.getPersonalComputerById(idPC).getHardDisk(), price, discount));
            List<Personalcomputer> persComputers = pcDAO.getAllPersonalComputer();
            wrapper.getSession().setAttribute(EnumForPC.PERSONALCOMPUTERS.value(), persComputers);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/index.jsp";
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
