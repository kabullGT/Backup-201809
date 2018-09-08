package entities;

import entities.TbCopartnerProduct;
import entities.TbProductCombo;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbProduct.class)
public class TbProduct_ { 

    public static volatile CollectionAttribute<TbProduct, TbCopartnerProduct> tbCopartnerProductCollection;
    public static volatile SingularAttribute<TbProduct, BigInteger> cost;
    public static volatile SingularAttribute<TbProduct, String> productId;
    public static volatile SingularAttribute<TbProduct, String> dsc;
    public static volatile CollectionAttribute<TbProduct, TbProductCombo> tbProductComboCollection;
    public static volatile SingularAttribute<TbProduct, String> name;
    public static volatile SingularAttribute<TbProduct, BigInteger> saleprice;
    public static volatile SingularAttribute<TbProduct, String> imagePatch;
    public static volatile SingularAttribute<TbProduct, BigInteger> qtty;

}