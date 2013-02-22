/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.commnad.purchase;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Purchase;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.notebook.FillingObjects;
import by.bsuir.computershop.dao.notebook.MySQLNotebookDAO;
import by.bsuir.computershop.dao.purchase.MySQLPurchaseDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class PurchaseNotebookCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        try {
            HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
            int idNotebook = Integer.parseInt((String) requestParam.get(EnumForNotebook.IDNOTEBOOK.value()));
            float price = Float.parseFloat((String) requestParam.get(EnumForNotebook.PRICE.value()));
            Float discount = Float.parseFloat((String) requestParam.get(EnumForNotebook.DISCOUNT.value()));

            float cost = price - price * discount / 100;

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //get current date time with Date()
            Date date = new Date();
            System.out.println(dateFormat.format(date));

            //get current date time with Calendar()
            Calendar cal = Calendar.getInstance();
            String dateOfpurchaseString = dateFormat.format(cal.getTime());
            Date dateOfPurchase = dateFormat.parse(dateOfpurchaseString);
            DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                    ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
            MySQLPurchaseDAO purchaseDAO = (MySQLPurchaseDAO) mySQLFactory.getPurchaseDAO();

            MySQLNotebookDAO notebookDAO = (MySQLNotebookDAO) mySQLFactory.getNotebookDAO();
            FillingObjects obj = new FillingObjects();
            
            Purchase purchase = obj.fillObjectPurchaseForAdding(cost, dateOfPurchase);
            purchase.getNotebooks().add(notebookDAO.getNotebookById(idNotebook));
            
            purchaseDAO.insertPurchase(purchase);

            page = "/index.jsp";
        } catch (ParseException ex) {
            Logger.getLogger(PurchaseNotebookCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
        }

        return page;
    }
}
