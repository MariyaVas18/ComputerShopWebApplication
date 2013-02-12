/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.purchase;

import by.bsuir.computershop.dao.entity.Purchase;
import java.util.Collection;
import java.util.Date;



/**
 *
 * @author Masha
 */
public interface IPurchaseDAO {
    
    public Collection getAllPurchase();
    
    public Purchase getPurchaseById(int idPurcase);
    
    public Purchase getPurchaseByDate(Date date);

}
