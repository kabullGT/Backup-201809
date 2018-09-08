package entities;

import entities.TbAccountWristband;
import entities.TbLog;
import entities.TbSystemModule;
import entities.TbTransaction;
import entities.TbTransactionType;
import entities.TbUserDevice;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-03T21:46:59")
@StaticMetamodel(TbTransaction.class)
public class TbTransaction_ { 

    public static volatile SingularAttribute<TbTransaction, BigInteger> amount;
    public static volatile SingularAttribute<TbTransaction, String> trnId;
    public static volatile SingularAttribute<TbTransaction, TbUserDevice> tbUserDevice;
    public static volatile SingularAttribute<TbTransaction, Date> trnDatetime;
    public static volatile SingularAttribute<TbTransaction, TbLog> logId;
    public static volatile SingularAttribute<TbTransaction, TbTransaction> tbTransaction;
    public static volatile SingularAttribute<TbTransaction, TbSystemModule> moduleId;
    public static volatile SingularAttribute<TbTransaction, TbTransaction> trnId1;
    public static volatile SingularAttribute<TbTransaction, TbAccountWristband> tbAccountWristband;
    public static volatile SingularAttribute<TbTransaction, TbTransactionType> trnTypeId;

}