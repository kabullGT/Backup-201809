package entities;

import entities.TbAttendance;
import entities.TbEventArea;
import entities.TbWristband;
import entities.TbWrtType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbSubEvent.class)
public class TbSubEvent_ { 

    public static volatile SingularAttribute<TbSubEvent, String> subEventId;
    public static volatile SingularAttribute<TbSubEvent, Date> datetimeEnd;
    public static volatile SingularAttribute<TbSubEvent, TbEventArea> areaId;
    public static volatile CollectionAttribute<TbSubEvent, TbWrtType> tbWrtTypeCollection;
    public static volatile SingularAttribute<TbSubEvent, String> name;
    public static volatile SingularAttribute<TbSubEvent, Date> datetimeStart;
    public static volatile SingularAttribute<TbSubEvent, String> imagePatch;
    public static volatile CollectionAttribute<TbSubEvent, TbAttendance> tbAttendanceCollection;
    public static volatile CollectionAttribute<TbSubEvent, TbWristband> tbWristbandCollection;

}