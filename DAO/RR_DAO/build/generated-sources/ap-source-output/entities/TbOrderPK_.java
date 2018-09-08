package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbOrderPK.class)
public class TbOrderPK_ { 

    public static volatile SingularAttribute<TbOrderPK, Date> orderDatetime;
    public static volatile SingularAttribute<TbOrderPK, String> orderId;
    public static volatile SingularAttribute<TbOrderPK, String> wrtUid;
    public static volatile SingularAttribute<TbOrderPK, String> eventDayId;

}