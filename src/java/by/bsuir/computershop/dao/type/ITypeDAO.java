/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.type;

import by.bsuir.computershop.dao.entity.Type;
import java.util.Collection;


/**
 *
 * @author Masha
 */
public interface ITypeDAO {
    
    public Collection getAllType();
    
    public Type getTypeByID(int id);

}
