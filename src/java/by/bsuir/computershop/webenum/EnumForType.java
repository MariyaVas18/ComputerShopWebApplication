/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.webenum;

/**
 *
 * @author 1
 */
public enum EnumForType {
    TYPES("types");
    private final String value;

    EnumForType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
