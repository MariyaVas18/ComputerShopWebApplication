/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.controller;

import by.bsuir.computershop.command.Command;
import by.bsuir.computershop.command.NoCommand;
import by.bsuir.computershop.command.notebook.AddingNewNotebookCommand;
import by.bsuir.computershop.command.notebook.ViewAllNotebookCommand;
import by.bsuir.computershop.command.pc.ViewAllPCCommand;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

    private static RequestHelper instance = null;
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    private RequestHelper() {
        commands.put("viewPersonalComputers", new ViewAllPCCommand());
        commands.put("viewNotebooks", new ViewAllNotebookCommand());
        commands.put("addingNotebook", new AddingNewNotebookCommand());
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
