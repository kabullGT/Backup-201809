package entities;

import entities.TbCopartnerProduct;
import entities.TbOrder;
import entities.TbOrderProductPK;
import entities.TbSalepoint;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbOrderProduct.class)
public class TbOrderProduct_ { 

    public static volatile SingularAttribute<TbOrderProduct, TbSalepoint> tbSalepoint;
    public static volatile SingularAttribute<TbOrderProduct, TbCopartnerProduct> tbCopartnerProduct;
    public static volatile SingularAttribute<TbOrderProduct, TbOrder> tbOrder;
    public static volatile SingularAttribute<TbOrderProduct, Integer> qtty;
    public static volatile SingularAttribute<TbOrderProduct, TbOrderProductPK> tbOrderProductPK;

}