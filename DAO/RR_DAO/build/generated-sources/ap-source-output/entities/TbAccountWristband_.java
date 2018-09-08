package entities;

import entities.TbAccount;
import entities.TbAccountWristbandPK;
import entities.TbTransaction;
import entities.TbWristband;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAccountWristband.class)
public class TbAccountWristband_ { 

    public static volatile SingularAttribute<TbAccountWristband, TbWristband> tbWristband;
    public static volatile CollectionAttribute<TbAccountWristband, TbTransaction> tbTransactionCollection;
    public static volatile SingularAttribute<TbAccountWristband, Double> limit;
    public static volatile SingularAttribute<TbAccountWristband, TbAccountWristbandPK> tbAccountWristbandPK;
    public static volatile SingularAttribute<TbAccountWristband, TbAccount> tbAccount;

}