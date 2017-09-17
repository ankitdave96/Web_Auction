/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entitybeans.Items;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author stuti
 */
@Local
public interface ItemsFacadeLocal {

    void create(Items items);

    void edit(Items items);

    void remove(Items items);

    Items find(Object id);

    List<Items> findAll();

    List<Items> findRange(int[] range);

    int count();
    
}
