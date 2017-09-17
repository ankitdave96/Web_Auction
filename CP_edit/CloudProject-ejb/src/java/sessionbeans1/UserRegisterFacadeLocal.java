/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans1;

import entitybeans.UserRegister;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author stuti
 */
@Local
public interface UserRegisterFacadeLocal {

    void create(UserRegister userRegister);

    void edit(UserRegister userRegister);

    void remove(UserRegister userRegister);

    UserRegister find(Object id);

    List<UserRegister> findAll();

    List<UserRegister> findRange(int[] range);

    int count();
    
}
