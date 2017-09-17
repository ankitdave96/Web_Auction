package entitybeans;

import entitybeans.Category;
import entitybeans.UserRegister;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-10T11:58:16")
@StaticMetamodel(Items.class)
public class Items_ { 

    public static volatile SingularAttribute<Items, String> summary;
    public static volatile SingularAttribute<Items, String> itemid;
    public static volatile SingularAttribute<Items, Date> stdate;
    public static volatile SingularAttribute<Items, Category> catid;
    public static volatile SingularAttribute<Items, Date> enddate;
    public static volatile SingularAttribute<Items, UserRegister> sellerid;
    public static volatile SingularAttribute<Items, String> itemname;
    public static volatile SingularAttribute<Items, String> incrPrice;
    public static volatile SingularAttribute<Items, String> description;
    public static volatile SingularAttribute<Items, String> startprice;
    public static volatile SingularAttribute<Items, String> bidcnt;

}