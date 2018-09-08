package entities;

import entities.TbCopartner;
import entities.TbEventArea;
import entities.TbOrderProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbSalepoint.class)
public class TbSalepoint_ { 

    public static volatile SingularAttribute<TbSalepoint, TbEventArea> areaId;
    public static volatile SingularAttribute<TbSalepoint, String> dsc;
    public static volatile SingularAttribute<TbSalepoint, TbCopartner> copartnerId;
    public static volatile SingularAttribute<TbSalepoint, String> idSalepoint;
    public static volatile CollectionAttribute<TbSalepoint, TbOrderProduct> tbOrderProductCollection;

}