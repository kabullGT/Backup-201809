package entities;

import entities.TbAtendee;
import entities.TbBlacklistPK;
import entities.TbEvent;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbBlacklist.class)
public class TbBlacklist_ { 

    public static volatile SingularAttribute<TbBlacklist, byte[]> reason;
    public static volatile SingularAttribute<TbBlacklist, TbBlacklistPK> tbBlacklistPK;
    public static volatile SingularAttribute<TbBlacklist, Boolean> deleted;
    public static volatile SingularAttribute<TbBlacklist, TbAtendee> tbAtendee;
    public static volatile SingularAttribute<TbBlacklist, TbEvent> tbEvent;

}