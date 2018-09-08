package entities;

import entities.TbEventDay;
import entities.TbSubEvent;
import entities.TbWristband;
import entities.TbWrtSubType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbWrtType.class)
public class TbWrtType_ { 

    public static volatile SingularAttribute<TbWrtType, String> wrtTypeId;
    public static volatile CollectionAttribute<TbWrtType, TbEventDay> tbEventDayCollection;
    public static volatile CollectionAttribute<TbWrtType, TbSubEvent> tbSubEventCollection;
    public static volatile SingularAttribute<TbWrtType, String> dsc;
    public static volatile SingularAttribute<TbWrtType, String> name;
    public static volatile SingularAttribute<TbWrtType, String> imagePatch;
    public static volatile CollectionAttribute<TbWrtType, TbWristband> tbWristbandCollection;
    public static volatile SingularAttribute<TbWrtType, TbWrtSubType> wrtSubTypeId;

}