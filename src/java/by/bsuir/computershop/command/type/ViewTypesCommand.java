/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command.type;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.WrapperParameter;
import by.bsuir.computershop.dao.entity.Type;
import by.bsuir.computershop.dao.factory.DAOFactory;
import by.bsuir.computershop.dao.type.MySQLTypeDAO;
import by.bsuir.computershop.manager.ConfigurationManager;
import by.bsuir.computershop.webenum.EnumForNotebook;
import by.bsuir.computershop.webenum.EnumForType;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;

/**
 *
 * @author 1
 */
public class ViewTypesCommand implements Command {

    @Override
    public String execute(WrapperParameter wrapper) throws ServletException, IOException {
        String page = null;
        DAOFactory mySQLFactory = DAOFactory.getDAOFactory(
                ConfigurationManager.getInstance().getProperty(ConfigurationManager.MY_FACTORY));
        MySQLTypeDAO typeDAO = (MySQLTypeDAO) mySQLFactory.getTypeDAO();
        List<Type> types = typeDAO.getAllType();
        wrapper.getSession().setAttribute(EnumForType.TYPES.value(), types);

        HashMap<String, Object> requestParam = (HashMap<String, Object>) wrapper.parse();
        String typeProduct = (String) requestParam.get("command");
        if("addingPCPage".equals(typeProduct)){
            page = "/addingPC.jsp";
        }
        if("addingNotebookPage".equals(typeProduct)){
        page = "/addingNotebook.jsp";
        }
        return page;
    }
}
