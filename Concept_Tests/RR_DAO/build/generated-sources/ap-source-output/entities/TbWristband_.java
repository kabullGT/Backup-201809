package entities;

import entities.TbAccountWristband;
import entities.TbAtendeeWristband;
import entities.TbAttendance;
import entities.TbEventDay;
import entities.TbOrder;
import entities.TbSubEvent;
import entities.TbWristbandStatus;
import entities.TbWrtType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbWristband.class)
public class TbWristband_ { 

    public static volatile SingularAttribute<TbWristband, TbWristbandStatus> wristbandStatusId;
    public static volatile SingularAttribute<TbWristband, String> eventId;
    public static volatile CollectionAttribute<TbWristband, TbAccountWristband> tbAccountWristbandCollection;
    public static volatile CollectionAttribute<TbWristband, TbOrder> tbOrderCollection;
    public static volatile SingularAttribute<TbWristband, TbWrtType> wrtTypeId;
    public static volatile CollectionAttribute<TbWristband, TbSubEvent> tbSubEventCollection;
    public static volatile SingularAttribute<TbWristband, String> wrtCode;
    public static volatile SingularAttribute<TbWristband, String> wrtUid;
    public static volatile CollectionAttribute<TbWristband, TbAttendance> tbAttendanceCollection;
    public static volatile SingularAttribute<TbWristband, TbEventDay> eventDayId;
    public static volatile SingularAttribute<TbWristband, TbAtendeeWristband> tbAtendeeWristband;

}