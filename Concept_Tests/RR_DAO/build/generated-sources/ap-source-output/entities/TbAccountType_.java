package entities;

import entities.TbAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAccountType.class)
public class TbAccountType_ { 

    public static volatile SingularAttribute<TbAccountType, String> accountTypeId;
    public static volatile SingularAttribute<TbAccountType, String> dsc;
    public static volatile CollectionAttribute<TbAccountType, TbAccount> tbAccountCollection;

}