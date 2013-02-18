/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.command;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Определяет оболочку для параметорв пришедшех в request
 *
 * @author Mariya Vasilevskaya
 */
public class WrapperParameter {

    private HttpSession session;
    private HttpServletRequest request;
    private HashMap<String, Object> requestParam;

    public WrapperParameter() {
        super();
    }

    public WrapperParameter(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        requestParam = new HashMap<String, Object>();
        session = request.getSession(true);
    }

    /**
     * Производит парсинг параметров из request.
     *
     * @return Map параметров
     */
    public Map<String, Object> parse() {
        Enumeration<String> en = request.getParameterNames();

        while (en.hasMoreElements()) {
            String paramName = (String) en.nextElement();
            requestParam.put(paramName, request.getParameter(paramName));
            System.out.println(paramName + " = " + request.getParameter(paramName));
        }
        return requestParam;
    }

    public HashMap<String, Object> getRequestParam() {
        return requestParam;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setRequestParam(HashMap<String, Object> requestParam) {
        this.requestParam = requestParam;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "WrapperParameter{" + "session=" + session + ", request=" + request + ", requestParam=" + requestParam + '}';
    }
}
