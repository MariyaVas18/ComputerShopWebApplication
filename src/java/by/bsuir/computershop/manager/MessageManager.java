/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.manager;

import java.util.ResourceBundle;

public class MessageManager {

    private static MessageManager instance;
    private ResourceBundle resourceBundle;
    private static final String BUNDLE_NAME = "by.bsuir.computershop.properties.messages";
    public static final String LOGIN_ERROR_MESSAGE = "errormessage.login";
    public static final String ROOM_ERROR_MESSAGE = "errormessage.room";
    public static final String CLIENT_ERROR_MESSAGE = "errormessage.client";
    public static final String ACCOUNT_ERROR_MESSAGE = "errormessage.account";
    public static final String ORDER_ERROR_MESSAGE = "errormessage.order";
    public static final String FORMAT_ERROR_MESSAGE = "errormessage.format";
    public static final String SERVLET_EXCEPTION_ERROR_MESSAGE =
            "errormessage.servletException";
    public static final String ORDER_CLIENT_MESSAGE = "message.order";
    public static final String REGISTRATION_CLIENT_MESSAGE = "message.registration";
    public static final String AUTORISATION__CLIENT_ERRORMESSAGE = "errormessage.autorisation";
    public static final String IO_EXCEPTION_ERROR_MESSAGE = "errormessage.ioException";

    public static MessageManager getInstance() {
        if (instance == null) {
            instance = new MessageManager();
            instance.resourceBundle =
                    ResourceBundle.getBundle(BUNDLE_NAME);
        }
        return instance;
    }

    public String getProperty(String key) {
        return (String) resourceBundle.getObject(key);
    }
}
