package entities;

import entities.TbProductCombo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbCombo.class)
public class TbCombo_ { 

    public static volatile SingularAttribute<TbCombo, String> dsc;
    public static volatile CollectionAttribute<TbCombo, TbProductCombo> tbProductComboCollection;
    public static volatile SingularAttribute<TbCombo, String> comboId;

}