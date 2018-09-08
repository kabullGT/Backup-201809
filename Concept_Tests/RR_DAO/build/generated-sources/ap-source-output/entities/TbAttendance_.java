package entities;

import entities.TbAttendancePK;
import entities.TbEventDay;
import entities.TbSubEvent;
import entities.TbWristband;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAttendance.class)
public class TbAttendance_ { 

    public static volatile SingularAttribute<TbAttendance, Date> checkin;
    public static volatile SingularAttribute<TbAttendance, TbWristband> tbWristband;
    public static volatile SingularAttribute<TbAttendance, TbEventDay> tbEventDay;
    public static volatile SingularAttribute<TbAttendance, TbSubEvent> tbSubEvent;
    public static volatile SingularAttribute<TbAttendance, TbAttendancePK> tbAttendancePK;
    public static volatile SingularAttribute<TbAttendance, Date> checkout;

}