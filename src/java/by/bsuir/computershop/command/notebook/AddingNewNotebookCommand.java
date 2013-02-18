/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.notebook;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Notebook;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.FillingObjects;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
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
public class AddingNewNotebookCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            String type = (String) requestParam.get(EnumForNotebook.TYPE.value());
            String nameNotebook = (String) requestParam.get(EnumForNotebook.NAMENOTEBOOK.value());
            String releaseDateString = (String) requestParam.get(EnumForNotebook.RELEASEDATE.value());
            String platform = (String) requestParam.get(EnumForNotebook.PLATFORM.value());
            String processor = (String) requestParam.get(EnumForNotebook.PROCESSOR.value());
            int numberOfCores = Integer.parseInt((String) requestParam.get(EnumForNotebook.NUMBEROFCORES.value()));
            float weight = Float.parseFloat((String) requestParam.get(EnumForNotebook.WEIGHT.value()));
            float diagonal = Float.parseFloat((String) requestParam.get(EnumForNotebook.DIAGONAL.value()));
            int operationMemory = Integer.parseInt((String) requestParam.get(EnumForNotebook.OPERATIONMEMORY.value()));
            String hardDisk = (String) requestParam.get(EnumForNotebook.HARDDISK.value());
            int battery = Integer.parseInt((String) requestParam.get(EnumForNotebook.HARDDISK.value()));
            float price = Float.parseFloat((String) requestParam.get(EnumForNotebook.PRICE.value()));
            Float discount = Float.parseFloat((String) requestParam.get(EnumForNotebook.DISCOUNT.value()));

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            Date releaseDate = dateFormat.parse(releaseDateString); 
    
            FillingObjects notebookObjForFill = new FillingObjects();
                        
            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLNotebookDAO notebookDAO = (MySQLNotebookDAO) mySQLFactory.getNotebookDAO();
            List<Notebook> notebooks = notebookDAO.getAllNotebook();
            notebookDAO.insertNotebook(notebookObjForFill.fillObjectNotebook(type, nameNotebook, releaseDate,
                    platform, processor, numberOfCores, weight, diagonal, operationMemory, 
                    hardDisk, battery, price, discount));
            wrapper.getSession().setAttribute(EnumForNotebook.NOTEBOOKS.value(), notebooks);

            //page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SHOW_ROOMS_PAGE_PATH);
            page = "/index.jsp";
        } catch (ParseException ex) {
            Logger.getLogger(AddingNewNotebookCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
