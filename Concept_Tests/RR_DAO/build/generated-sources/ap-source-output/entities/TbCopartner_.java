package entities;

import entities.TbCopartnerProduct;
import entities.TbDayCopartner;
import entities.TbSalepoint;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbCopartner.class)
public class TbCopartner_ { 

    public static volatile SingularAttribute<TbCopartner, String> country;
    public static volatile SingularAttribute<TbCopartner, String> eventId;
    public static volatile SingularAttribute<TbCopartner, String> address;
    public static volatile SingularAttribute<TbCopartner, String> phone2;
    public static volatile SingularAttribute<TbCopartner, String> imagePatch;
    public static volatile SingularAttribute<TbCopartner, String> phone1;
    public static volatile SingularAttribute<TbCopartner, String> zipcode;
    public static volatile SingularAttribute<TbCopartner, TbDayCopartner> tbDayCopartner;
    public static volatile CollectionAttribute<TbCopartner, TbCopartnerProduct> tbCopartnerProductCollection;
    public static volatile SingularAttribute<TbCopartner, String> copartnerId;
    public static volatile SingularAttribute<TbCopartner, String> name;
    public static volatile SingularAttribute<TbCopartner, String> eventDayId;
    public static volatile CollectionAttribute<TbCopartner, TbSalepoint> tbSalepointCollection;
    public static volatile SingularAttribute<TbCopartner, String> email;

}