package entities;

import entities.TbAccountStatus;
import entities.TbAccountType;
import entities.TbAccountWristband;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAccount.class)
public class TbAccount_ { 

    public static volatile SingularAttribute<TbAccount, TbAccountType> accountTypeId;
    public static volatile CollectionAttribute<TbAccount, TbAccountWristband> tbAccountWristbandCollection;
    public static volatile SingularAttribute<TbAccount, Double> balance;
    public static volatile SingularAttribute<TbAccount, String> acccountId;
    public static volatile SingularAttribute<TbAccount, TbAccountStatus> accountStatusId;

}