package entities;

import entities.TbAccessLevel;
import entities.TbUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbUserAccessLevel.class)
public class TbUserAccessLevel_ { 

    public static volatile SingularAttribute<TbUserAccessLevel, TbUser> tbUser;
    public static volatile SingularAttribute<TbUserAccessLevel, TbAccessLevel> tbAccessLevel;
    public static volatile SingularAttribute<TbUserAccessLevel, String> userId;

}