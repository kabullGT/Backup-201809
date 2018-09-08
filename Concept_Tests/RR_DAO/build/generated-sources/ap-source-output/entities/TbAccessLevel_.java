package entities;

import entities.TbAccessLevelPK;
import entities.TbSystemModule;
import entities.TbUserAccessLevel;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAccessLevel.class)
public class TbAccessLevel_ { 

    public static volatile SingularAttribute<TbAccessLevel, TbAccessLevelPK> tbAccessLevelPK;
    public static volatile SingularAttribute<TbAccessLevel, String> dsc;
    public static volatile SingularAttribute<TbAccessLevel, String> name;
    public static volatile CollectionAttribute<TbAccessLevel, TbUserAccessLevel> tbUserAccessLevelCollection;
    public static volatile SingularAttribute<TbAccessLevel, TbSystemModule> tbSystemModule;

}