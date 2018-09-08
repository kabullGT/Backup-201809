package entities;

import entities.TbAtendeeEvent;
import entities.TbAtendeeIdType;
import entities.TbAtendeeWristband;
import entities.TbBlacklist;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbAtendee.class)
public class TbAtendee_ { 

    public static volatile SingularAttribute<TbAtendee, String> country;
    public static volatile CollectionAttribute<TbAtendee, TbAtendeeEvent> tbAtendeeEventCollection;
    public static volatile SingularAttribute<TbAtendee, String> address;
    public static volatile SingularAttribute<TbAtendee, TbAtendeeIdType> idType;
    public static volatile SingularAttribute<TbAtendee, String> atendeeRuid;
    public static volatile SingularAttribute<TbAtendee, String> phone2;
    public static volatile SingularAttribute<TbAtendee, String> imagePatch;
    public static volatile SingularAttribute<TbAtendee, Date> birth;
    public static volatile SingularAttribute<TbAtendee, TbAtendeeWristband> tbAtendeeWristband;
    public static volatile SingularAttribute<TbAtendee, String> phone1;
    public static volatile SingularAttribute<TbAtendee, String> zipcode;
    public static volatile CollectionAttribute<TbAtendee, TbBlacklist> tbBlacklistCollection;
    public static volatile SingularAttribute<TbAtendee, String> name;
    public static volatile SingularAttribute<TbAtendee, String> id;
    public static volatile SingularAttribute<TbAtendee, String> email;
    public static volatile SingularAttribute<TbAtendee, String> ticketid;

}