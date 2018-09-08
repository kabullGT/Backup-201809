package entities;

import entities.TbWristband;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbWristbandStatus.class)
public class TbWristbandStatus_ { 

    public static volatile SingularAttribute<TbWristbandStatus, String> wristbandStatusId;
    public static volatile SingularAttribute<TbWristbandStatus, String> dsc;
    public static volatile CollectionAttribute<TbWristbandStatus, TbWristband> tbWristbandCollection;

}