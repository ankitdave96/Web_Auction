package entitybeans;

import entitybeans.Items;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-10T11:58:16")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> catId;
    public static volatile SingularAttribute<Category, String> catName;
    public static volatile CollectionAttribute<Category, Items> itemsCollection;

}