package entities;

import entities.TbAtendeeEvent;
import entities.TbAttendance;
import entities.TbDayCopartner;
import entities.TbEvent;
import entities.TbEventArea;
import entities.TbOrder;
import entities.TbWristband;
import entities.TbWrtType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbEventDay.class)
public class TbEventDay_ { 

    public static volatile SingularAttribute<TbEventDay, TbEvent> eventId;
    public static volatile CollectionAttribute<TbEventDay, TbAtendeeEvent> tbAtendeeEventCollection;
    public static volatile CollectionAttribute<TbEventDay, TbOrder> tbOrderCollection;
    public static volatile CollectionAttribute<TbEventDay, TbWrtType> tbWrtTypeCollection;
    public static volatile SingularAttribute<TbEventDay, Date> datetimeClose;
    public static volatile SingularAttribute<TbEventDay, String> eventDayId;
    public static volatile SingularAttribute<TbEventDay, Date> datetimeOpen;
    public static volatile CollectionAttribute<TbEventDay, TbAttendance> tbAttendanceCollection;
    public static volatile CollectionAttribute<TbEventDay, TbWristband> tbWristbandCollection;
    public static volatile CollectionAttribute<TbEventDay, TbDayCopartner> tbDayCopartnerCollection;
    public static volatile CollectionAttribute<TbEventDay, TbEventArea> tbEventAreaCollection;

}