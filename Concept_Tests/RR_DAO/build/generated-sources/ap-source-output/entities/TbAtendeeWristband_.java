package entities;

import entities.TbAtendee;
import entities.TbAtendeeWristbandPK;
import entities.TbWristband;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAtendeeWristband.class)
public class TbAtendeeWristband_ { 

    public static volatile SingularAttribute<TbAtendeeWristband, TbWristband> tbWristband;
    public static volatile SingularAttribute<TbAtendeeWristband, TbAtendee> tbAtendee;
    public static volatile SingularAttribute<TbAtendeeWristband, Date> registerDatetime;
    public static volatile SingularAttribute<TbAtendeeWristband, TbAtendeeWristbandPK> tbAtendeeWristbandPK;

}