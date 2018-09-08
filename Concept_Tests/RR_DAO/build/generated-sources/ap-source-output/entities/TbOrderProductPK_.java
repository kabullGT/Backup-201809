package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbOrderProductPK.class)
public class TbOrderProductPK_ { 

    public static volatile SingularAttribute<TbOrderProductPK, Date> orderDatetime;
    public static volatile SingularAttribute<TbOrderProductPK, String> productId;
    public static volatile SingularAttribute<TbOrderProductPK, String> orderId;
    public static volatile SingularAttribute<TbOrderProductPK, String> copartnerId;
    public static volatile SingularAttribute<TbOrderProductPK, String> idSalepoint;
    public static volatile SingularAttribute<TbOrderProductPK, String> wrtUid;
    public static volatile SingularAttribute<TbOrderProductPK, String> eventDayId;

}