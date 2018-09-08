package entities;

import entities.TbEventDay;
import entities.TbSalepoint;
import entities.TbSubEvent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbEventArea.class)
public class TbEventArea_ { 

    public static volatile SingularAttribute<TbEventArea, String> areaId;
    public static volatile CollectionAttribute<TbEventArea, TbSubEvent> tbSubEventCollection;
    public static volatile SingularAttribute<TbEventArea, String> areaName;
    public static volatile SingularAttribute<TbEventArea, String> dsc;
    public static volatile SingularAttribute<TbEventArea, Date> datetimeClose;
    public static volatile SingularAttribute<TbEventArea, Date> datetimeOpen;
    public static volatile SingularAttribute<TbEventArea, TbEventDay> eventDayId;
    public static volatile CollectionAttribute<TbEventArea, TbSalepoint> tbSalepointCollection;

}