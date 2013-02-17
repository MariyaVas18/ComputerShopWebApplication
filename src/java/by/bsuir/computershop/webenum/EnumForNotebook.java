/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.webenum;

/**
 *
 * @author 1
 */
public enum EnumForNotebook {
    NOTEBOOKS("notebooks");
    
    private final String value;

    EnumForNotebook(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
