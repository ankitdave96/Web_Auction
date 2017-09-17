package entitybeans;

import entitybeans.Items;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-10T11:58:16")
@StaticMetamodel(UserRegister.class)
public class UserRegister_ { 

    public static volatile SingularAttribute<UserRegister, String> fname;
    public static volatile SingularAttribute<UserRegister, String> country;
    public static volatile SingularAttribute<UserRegister, String> address;
    public static volatile SingularAttribute<UserRegister, String> uname;
    public static volatile SingularAttribute<UserRegister, String> city;
    public static volatile CollectionAttribute<UserRegister, Items> itemsCollection;
    public static volatile SingularAttribute<UserRegister, String> phno;
    public static volatile SingularAttribute<UserRegister, String> ccardno;
    public static volatile SingularAttribute<UserRegister, String> lname;
    public static volatile SingularAttribute<UserRegister, String> pin;
    public static volatile SingularAttribute<UserRegister, String> state;
    public static volatile SingularAttribute<UserRegister, String> pwd;
    public static volatile SingularAttribute<UserRegister, String> email;

}