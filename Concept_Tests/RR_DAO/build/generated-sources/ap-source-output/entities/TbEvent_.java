package entities;

import entities.TbBlacklist;
import entities.TbEventDay;
import entities.TbEventOwner;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbEvent.class)
public class TbEvent_ { 

    public static volatile SingularAttribute<TbEvent, String> zipcode;
    public static volatile SingularAttribute<TbEvent, TbEventOwner> eventOwnerId;
    public static volatile SingularAttribute<TbEvent, String> eventId;
    public static volatile SingularAttribute<TbEvent, String> country;
    public static volatile SingularAttribute<TbEvent, String> address;
    public static volatile CollectionAttribute<TbEvent, TbEventDay> tbEventDayCollection;
    public static volatile CollectionAttribute<TbEvent, TbBlacklist> tbBlacklistCollection;
    public static volatile SingularAttribute<TbEvent, Date> datetimeClose;
    public static volatile SingularAttribute<TbEvent, String> imagePatch;
    public static volatile SingularAttribute<TbEvent, String> name;
    public static volatile SingularAttribute<TbEvent, Date> datetimeOpen;
    public static volatile SingularAttribute<TbEvent, Integer> capacity;

}