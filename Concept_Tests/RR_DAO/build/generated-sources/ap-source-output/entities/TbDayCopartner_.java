package entities;

import entities.TbCopartner;
import entities.TbEventDay;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbDayCopartner.class)
public class TbDayCopartner_ { 

    public static volatile SingularAttribute<TbDayCopartner, String> copartnerId;
    public static volatile SingularAttribute<TbDayCopartner, TbCopartner> tbCopartner;
    public static volatile SingularAttribute<TbDayCopartner, TbEventDay> eventDayId;

}