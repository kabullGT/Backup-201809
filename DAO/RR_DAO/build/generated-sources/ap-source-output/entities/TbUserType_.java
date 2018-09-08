package entities;

import entities.TbUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbUserType.class)
public class TbUserType_ { 

    public static volatile SingularAttribute<TbUserType, String> userTypeId;
    public static volatile SingularAttribute<TbUserType, String> dsc;
    public static volatile CollectionAttribute<TbUserType, TbUser> tbUserCollection;

}