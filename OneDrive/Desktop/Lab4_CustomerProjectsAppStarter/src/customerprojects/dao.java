/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerprojects;

import repositories.Repository;

/**
 *
 * @author user
 */
public interface dao {
    public interface DAOInterface  {
    public Repository load(String filename);

    public void store(String filename, Repository repository);
}
   public class DAOTextImpl implements DAOInterface {
    
    static final char DELIMITER=',';   

    @Override
    public Repository load(String filename) {
    }

}
