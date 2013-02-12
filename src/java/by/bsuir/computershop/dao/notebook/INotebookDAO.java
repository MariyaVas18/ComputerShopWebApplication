/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.computershop.dao.notebook;

import by.bsuir.computershop.dao.entity.Notebook;
import java.util.Collection;

/**
 *
 * @author Masha
 */
public interface INotebookDAO {

    public Collection getAllNotebook();

    public Notebook getNotebookById(int idNotebook);
    
    public boolean deleteNotebookById(int idNotebook);

    public boolean insertNotebook(Notebook notebook);

    public boolean updateNotebook(Notebook notebook);
}
