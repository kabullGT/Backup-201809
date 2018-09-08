package entities;

import entities.TbAccessLevel;
import entities.TbLog;
import entities.TbTransaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbSystemModule.class)
public class TbSystemModule_ { 

    public static volatile CollectionAttribute<TbSystemModule, TbAccessLevel> tbAccessLevelCollection;
    public static volatile SingularAttribute<TbSystemModule, String> dsc;
    public static volatile CollectionAttribute<TbSystemModule, TbTransaction> tbTransactionCollection;
    public static volatile SingularAttribute<TbSystemModule, String> moduleName;
    public static volatile SingularAttribute<TbSystemModule, String> moduleId;
    public static volatile SingularAttribute<TbSystemModule, String> config;
    public static volatile CollectionAttribute<TbSystemModule, TbLog> tbLogCollection;

}