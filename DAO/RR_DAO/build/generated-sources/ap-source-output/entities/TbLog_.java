package entities;

import entities.TbLogType;
import entities.TbSystemModule;
import entities.TbTransaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbLog.class)
public class TbLog_ { 

    public static volatile SingularAttribute<TbLog, byte[]> logDsc;
    public static volatile CollectionAttribute<TbLog, TbTransaction> tbTransactionCollection;
    public static volatile SingularAttribute<TbLog, String> logId;
    public static volatile SingularAttribute<TbLog, TbSystemModule> moduleId;
    public static volatile SingularAttribute<TbLog, TbLogType> logTypeId;

}