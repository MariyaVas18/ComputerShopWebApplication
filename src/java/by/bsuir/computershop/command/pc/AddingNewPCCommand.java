/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.pc;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
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
public class AddingNewPCCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            int idType = Integer.parseInt((String) requestParam.get(EnumForPC.IDTYPE.value()));
            String namePC = (String) requestParam.get(EnumForPC.NAMEPC.value());
            String releaseDateString = (String) requestParam.get(EnumForPC.RELEASEDATE.value());
            String platform = (String) requestParam.get(EnumForPC.PLATFORM.value());
            String processor = (String) requestParam.get(EnumForPC.PROCESSOR.value());
            int numberOfCores = Integer.parseInt((String) requestParam.get(EnumForPC.NUMBEROFCORES.value()));
            float weight = Float.parseFloat((String) requestParam.get(EnumForPC.WEIGHT.value()));
            float diagonal = Float.parseFloat((String) requestParam.get(EnumForPC.DIAGONAL.value()));
            int operationMemory = Integer.parseInt((String) requestParam.get(EnumForPC.OPERATIONMEMORY.value()));
            int hardDisk = Integer.parseInt((String) requestParam.get(EnumForPC.HARDDISK.value()));
            float price = Float.parseFloat((String) requestParam.get(EnumForPC.PRICE.value()));
            Float discount = Float.parseFloat((String) requestParam.get(EnumForPC.DISCOUNT.value()));

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            Date releaseDate = dateFormat.parse(releaseDateString);

            FillingObjects pcObjForFill = new FillingObjects();

            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLPCDAO pcDAO = (MySQLPCDAO) mySQLFactory.getPCDAO();
            MySQLTypeDAO typeDAO = (MySQLTypeDAO) mySQLFactory.getTypeDAO();
            
            pcDAO.insertPersonalComputer(pcObjForFill.fillObjectPC(typeDAO.getTypeByID(idType),
                    namePC, releaseDate,
                    platform, processor, numberOfCores, weight, diagonal, operationMemory,
                    hardDisk, price, discount));
            List<Personalcomputer> persComputers = pcDAO.getAllPersonalComputer();
            wrapper.getSession().setAttribute(EnumForPC.PERSONALCOMPUTERS.value(), persComputers);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/index.jsp";
        } catch (ParseException ex) {
            Logger.getLogger(AddingNewPCCommand.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException ex) {
        }

        return page;
    }

}
