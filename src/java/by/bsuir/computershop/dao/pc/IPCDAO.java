/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.pc;

import by.bsuir.computershop.dao.entity.Personalcomputer;
import java.util.Collection;

/**
 *
 * @author Masha
 */
public interface IPCDAO {
    
    public Collection getAllPersonalComputer();

    public Personalcomputer getPersonalComputerById(int idPC);

    public boolean deletePersonalComputerById(int idPC);

    public boolean insertPersonalComputer(Personalcomputer pc);

    public boolean updatePersonalComputer(Personalcomputer pc);
}
