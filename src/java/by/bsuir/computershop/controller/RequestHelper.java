/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.controller;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.NoCommand;
import by.bsuir.computershop.command.notebook.AddingNewNotebookCommand;
import by.bsuir.computershop.command.notebook.DeleteNotebookCommand;
import by.bsuir.computershop.command.notebook.EditPriceOrDiscountNotebookCommand;
import by.bsuir.computershop.command.notebook.PrepareEditPriceOrDicountNotebookCommand;
import by.bsuir.computershop.command.notebook.ViewAllNotebookCommand;
import by.bsuir.computershop.command.pc.AddingNewPCCommand;
import by.bsuir.computershop.command.pc.DeletePCCommand;
import by.bsuir.computershop.command.pc.EditPriceOrDiscountPCCommand;
import by.bsuir.computershop.command.pc.PrepareEditPriceOrDicountPCCommand;
import by.bsuir.computershop.command.pc.ViewAllPCCommand;
import by.bsuir.computershop.command.type.ViewTypesCommand;
import by.bsuir.computershop.commnad.purchase.PurchaseNotebookCommand;
import by.bsuir.computershop.commnad.purchase.PurchasePCCommand;
import by.bsuir.computershop.commnad.purchase.ViewAllPurchases;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

    private static RequestHelper instance = null;
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    private RequestHelper() {
        commands.put("viewPersonalComputers", new ViewAllPCCommand());
        commands.put("viewNotebooks", new ViewAllNotebookCommand());
        commands.put("editNotebookPage", new PrepareEditPriceOrDicountNotebookCommand());
        commands.put("editNotebook", new EditPriceOrDiscountNotebookCommand());
        commands.put("editPC", new EditPriceOrDiscountPCCommand());
        commands.put("editPCPage", new PrepareEditPriceOrDicountPCCommand());
        commands.put("addingNotebook", new AddingNewNotebookCommand());
        commands.put("addingPC", new AddingNewPCCommand());
        commands.put("addingNotebookPage", new ViewTypesCommand());
        commands.put("addingPCPage", new ViewTypesCommand());
        commands.put("deleteNotebook", new DeleteNotebookCommand());
        commands.put("deletePC", new DeletePCCommand());
        commands.put("buyNotebook", new PurchaseNotebookCommand());
        commands.put("buyPC", new PurchasePCCommand());
        commands.put("viewPurchases", new ViewAllPurchases());
    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getParameter("command");
        Command command = commands.get(action);
        if (command == null) {
            command = new NoCommand();
        }
        return command;
    }

    public static synchronized RequestHelper getInstance() {
        if (instance == null) {
            instance = new RequestHelper();
        }
        return instance;
    }
}
