/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.webenum;

/**
 *
 * @author 1
 */
public enum EnumForPC {
     PERSONALCOMPUTERS("personalComputers");
    
    private final String value;

    EnumForPC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
