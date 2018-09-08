package entities;

import entities.TbUserDevice;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbDevice.class)
public class TbDevice_ { 

    public static volatile CollectionAttribute<TbDevice, TbUserDevice> tbUserDeviceCollection;
    public static volatile SingularAttribute<TbDevice, String> dsc;
    public static volatile SingularAttribute<TbDevice, String> name;
    public static volatile SingularAttribute<TbDevice, String> model;
    public static volatile SingularAttribute<TbDevice, String> deviceId;
    public static volatile SingularAttribute<TbDevice, String> brand;

}