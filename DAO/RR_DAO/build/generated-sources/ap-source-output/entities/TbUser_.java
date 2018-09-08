package entities;

import entities.TbList;
import entities.TbUserAccessLevel;
import entities.TbUserDevice;
import entities.TbUserType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbUser.class)
public class TbUser_ { 

    public static volatile CollectionAttribute<TbUser, TbUserDevice> tbUserDeviceCollection;
    public static volatile SingularAttribute<TbUser, TbUserType> userTypeId;
    public static volatile SingularAttribute<TbUser, TbUserAccessLevel> tbUserAccessLevel;
    public static volatile SingularAttribute<TbUser, String> accessLevelId;
    public static volatile SingularAttribute<TbUser, String> name;
    public static volatile SingularAttribute<TbUser, String> imagePatch;
    public static volatile CollectionAttribute<TbUser, TbList> tbListCollection;
    public static volatile SingularAttribute<TbUser, String> pwd;
    public static volatile SingularAttribute<TbUser, String> moduleId;
    public static volatile SingularAttribute<TbUser, String> userId;

}