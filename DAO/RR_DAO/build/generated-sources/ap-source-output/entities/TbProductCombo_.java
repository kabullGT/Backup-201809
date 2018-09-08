package entities;

import entities.TbCombo;
import entities.TbProduct;
import entities.TbProductComboPK;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbProductCombo.class)
public class TbProductCombo_ { 

    public static volatile SingularAttribute<TbProductCombo, TbCombo> tbCombo;
    public static volatile SingularAttribute<TbProductCombo, BigInteger> cost;
    public static volatile SingularAttribute<TbProductCombo, String> imagePath;
    public static volatile SingularAttribute<TbProductCombo, BigInteger> saleprice;
    public static volatile SingularAttribute<TbProductCombo, TbProduct> tbProduct;
    public static volatile SingularAttribute<TbProductCombo, TbProductComboPK> tbProductComboPK;
    public static volatile SingularAttribute<TbProductCombo, Integer> qtty;

}