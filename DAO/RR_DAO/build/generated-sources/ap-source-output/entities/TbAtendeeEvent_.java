package entities;

import entities.TbAtendee;
import entities.TbAtendeeEventPK;
import entities.TbEventDay;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAtendeeEvent.class)
public class TbAtendeeEvent_ { 

    public static volatile SingularAttribute<TbAtendeeEvent, String> eventId;
    public static volatile SingularAttribute<TbAtendeeEvent, TbAtendee> tbAtendee;
    public static volatile SingularAttribute<TbAtendeeEvent, TbEventDay> tbEventDay;
    public static volatile SingularAttribute<TbAtendeeEvent, TbAtendeeEventPK> tbAtendeeEventPK;

}