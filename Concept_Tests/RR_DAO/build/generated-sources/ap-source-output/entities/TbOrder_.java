package entities;

import entities.TbEventDay;
import entities.TbOrderPK;
import entities.TbOrderProduct;
import entities.TbUserDevice;
import entities.TbWristband;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbOrder.class)
public class TbOrder_ { 

    public static volatile SingularAttribute<TbOrder, TbOrderPK> tbOrderPK;
    public static volatile SingularAttribute<TbOrder, BigInteger> total;
    public static volatile SingularAttribute<TbOrder, TbWristband> tbWristband;
    public static volatile SingularAttribute<TbOrder, TbEventDay> tbEventDay;
    public static volatile SingularAttribute<TbOrder, TbUserDevice> tbUserDevice;
    public static volatile CollectionAttribute<TbOrder, TbOrderProduct> tbOrderProductCollection;

}