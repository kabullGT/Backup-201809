package entities;

import entities.TbListNames;
import entities.TbUser;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbList.class)
public class TbList_ { 

    public static volatile SingularAttribute<TbList, String> listId;
    public static volatile SingularAttribute<TbList, BigInteger> topupAmount;
    public static volatile SingularAttribute<TbList, String> dsc;
    public static volatile CollectionAttribute<TbList, TbListNames> tbListNamesCollection;
    public static volatile SingularAttribute<TbList, BigInteger> chargeAmount;
    public static volatile SingularAttribute<TbList, TbUser> userId;

}