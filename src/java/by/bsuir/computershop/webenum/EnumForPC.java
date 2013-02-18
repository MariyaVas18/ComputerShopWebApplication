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

    PERSONALCOMPUTERS("personalComputers"),
    IDPERSONALCOMPUTER("idPersonalComputer"),
    TYPE("type"),
    NAMENOTEBOOK("namePc"),
    RELEASEDATE("releaseDate"),
    PLATFORM("platform"),
    PROCESSOR("processor"),
    NUMBEROFCORES("numberOfCores"),
    WEIGHT("weight"),
    DIAGONAL("diagonal"),
    OPERATIONMEMORY("operationMemory"),
    HARDDISK("hardDisk"),
    PRICE("price"),
    DISCONT("discount");
    private final String value;

    EnumForPC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
}
