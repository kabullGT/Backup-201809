package entities;

import entities.TbCopartner;
import entities.TbCopartnerProductPK;
import entities.TbOrderProduct;
import entities.TbProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbCopartnerProduct.class)
public class TbCopartnerProduct_ { 

    public static volatile SingularAttribute<TbCopartnerProduct, TbCopartnerProductPK> tbCopartnerProductPK;
    public static volatile SingularAttribute<TbCopartnerProduct, TbCopartner> tbCopartner;
    public static volatile CollectionAttribute<TbCopartnerProduct, TbOrderProduct> tbOrderProductCollection;
    public static volatile SingularAttribute<TbCopartnerProduct, TbProduct> tbProduct;

}