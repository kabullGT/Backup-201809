package entities;

import entities.TbAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAccountStatus.class)
public class TbAccountStatus_ { 

    public static volatile SingularAttribute<TbAccountStatus, String> dsc;
    public static volatile CollectionAttribute<TbAccountStatus, TbAccount> tbAccountCollection;
    public static volatile SingularAttribute<TbAccountStatus, String> accountStatusId;

}