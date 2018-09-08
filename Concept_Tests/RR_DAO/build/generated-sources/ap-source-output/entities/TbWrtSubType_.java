package entities;

import entities.TbWrtType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbWrtSubType.class)
public class TbWrtSubType_ { 

    public static volatile SingularAttribute<TbWrtSubType, String> dsc;
    public static volatile CollectionAttribute<TbWrtSubType, TbWrtType> tbWrtTypeCollection;
    public static volatile SingularAttribute<TbWrtSubType, String> name;
    public static volatile SingularAttribute<TbWrtSubType, String> wrtSubTypeId;

}