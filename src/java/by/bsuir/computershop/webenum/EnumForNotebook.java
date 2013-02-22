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

    NOTEBOOKS("notebooks"),
    PURCHASES("purchases"),
    NOTEBOOK("notebook"),
    IDNOTEBOOK("idNotebook"),
    IDTYPE("idType"),
    NAMENOTEBOOK("nameNotebook"),
    RELEASEDATE("releaseDate"),
    PLATFORM("platform"),
    PROCESSOR("processor"),
    NUMBEROFCORES("numberOfCores"),
    WEIGHT("weight"),
    DIAGONAL("diagonal"),
    OPERATIONMEMORY("operationMemory"),
    HARDDISK("hardDisk"),
    BATTERY("battery"),
    PRICE("price"),
    DISCOUNT("discount");
    
    private final String value;

    EnumForNotebook(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
