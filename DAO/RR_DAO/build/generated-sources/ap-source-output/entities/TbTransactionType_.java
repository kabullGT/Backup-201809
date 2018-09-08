package entities;

import entities.TbTransaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbTransactionType.class)
public class TbTransactionType_ { 

    public static volatile SingularAttribute<TbTransactionType, String> dsc;
    public static volatile CollectionAttribute<TbTransactionType, TbTransaction> tbTransactionCollection;
    public static volatile SingularAttribute<TbTransactionType, String> trnTypeId;

}