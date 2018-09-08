package entities;

import entities.TbDevice;
import entities.TbOrder;
import entities.TbTransaction;
import entities.TbUser;
import entities.TbUserDevicePK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbUserDevice.class)
public class TbUserDevice_ { 

    public static volatile SingularAttribute<TbUserDevice, TbUserDevicePK> tbUserDevicePK;
    public static volatile CollectionAttribute<TbUserDevice, TbOrder> tbOrderCollection;
    public static volatile SingularAttribute<TbUserDevice, TbUser> tbUser;
    public static volatile CollectionAttribute<TbUserDevice, TbTransaction> tbTransactionCollection;
    public static volatile SingularAttribute<TbUserDevice, TbDevice> tbDevice;

}