package entities;

import entities.TbLog;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbLogType.class)
public class TbLogType_ { 

    public static volatile SingularAttribute<TbLogType, String> dsc;
    public static volatile SingularAttribute<TbLogType, String> name;
    public static volatile SingularAttribute<TbLogType, String> logTypeId;
    public static volatile CollectionAttribute<TbLogType, TbLog> tbLogCollection;

}