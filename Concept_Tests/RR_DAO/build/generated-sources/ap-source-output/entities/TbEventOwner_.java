package entities;

import entities.TbEvent;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbEventOwner.class)
public class TbEventOwner_ { 

    public static volatile SingularAttribute<TbEventOwner, String> eventOwnerId;
    public static volatile SingularAttribute<TbEventOwner, String> zipcode;
    public static volatile SingularAttribute<TbEventOwner, String> country;
    public static volatile SingularAttribute<TbEventOwner, String> address;
    public static volatile SingularAttribute<TbEventOwner, String> contactName;
    public static volatile CollectionAttribute<TbEventOwner, TbEvent> tbEventCollection;
    public static volatile SingularAttribute<TbEventOwner, String> phone2;
    public static volatile SingularAttribute<TbEventOwner, String> imagePatch;
    public static volatile SingularAttribute<TbEventOwner, String> name;
    public static volatile SingularAttribute<TbEventOwner, String> id;
    public static volatile SingularAttribute<TbEventOwner, String> email;
    public static volatile SingularAttribute<TbEventOwner, String> phone1;

}