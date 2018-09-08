/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_dao;

import entities.TbGeneralConfig;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Kabull
 */
public class Test_DAO {
    
    public static Connection connObj;
    public static String JDBC_URL = "jdbc:sqlserver://localhost;databaseName=RR_DB;username=sa;password=123456";//"jdbc:sqlserver://localhost:1433;databaseName=RR_DB;integratedSecurity=true";
    public static EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("RR_DAOPU");
   
    
    public static void printJDBCDriverInfo() {
        try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          connObj = DriverManager.getConnection(JDBC_URL);
          if(connObj != null) {
              DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
              System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
          }
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      }
    }
    
    public static boolean insertObject(Object obj){
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        try{
            em.persist(obj);
            em.getTransaction().commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
        }
    }
    
    public static boolean updateObject(Object obj, String id){
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        try{
            Object findRes = em.find(obj.getClass(), id);
            if( findRes != null) 
            {
                //em.detach(findRes);
                em.merge(obj);
                em.getTransaction().commit();
            }else {
                System.out.println("Register not found!");
            }
            
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
        }
    }

    public static boolean deleteObject(Object obj, String id){
        EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        try{
            Object findRes = em.find(obj.getClass(), id);
            if( findRes != null) 
            {
                em.remove(findRes);
                em.getTransaction().commit();
            }else {
                System.out.println("Register not found!");
            }
       
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
        }
    }    

    public static Object selectObjectByID(Object obj, String id){
    EntityManager em = emf.createEntityManager(); 
    em.getTransaction().begin();
    try{
        Object findRes = em.find(obj.getClass(), id);
        if( findRes == null) 
        {
            System.out.println("Register not found!");
        }
        return findRes;
    }catch (Exception e){
        System.out.println(e.getMessage());
        return null;
    }finally{
            em.close();
    }
}   
        
    public static byte[] getByteArray(){
        byte[] tmp = new byte[] { (byte)0xe0, 0x4f, (byte)0xd0,
            0x20, (byte)0xea, 0x3a, 0x69, 0x10, (byte)0xa2, (byte)0xd8, 0x08, 0x00, 0x2b,
            0x30, 0x30, (byte)0x9d };
        return tmp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printJDBCDriverInfo();
        TbGeneralConfig tbGenConf = new TbGeneralConfig(UUID.randomUUID().toString());
        
        //Select
        System.out.println("SELECT ID: '" + tbGenConf.getId() + "'");
        System.out.println((TbGeneralConfig)selectObjectByID(tbGenConf, tbGenConf.getId()));
        
        //Insert
        System.out.println("INSERT NEW RECORD");
        tbGenConf.setExternalId("Ext ID");
        tbGenConf.setDsc("Desc".getBytes());  
        tbGenConf.setValue("Value".getBytes());
        tbGenConf.setSource("Source".getBytes());
        insertObject(tbGenConf);
        System.out.println((TbGeneralConfig)selectObjectByID(tbGenConf, tbGenConf.getId()));      
        
        //Update
        System.out.println("UPDATE INSERTED RECORD");
        tbGenConf.setExternalId("UPD >>" + tbGenConf.getExternalId());
        updateObject(tbGenConf, tbGenConf.getId());
        System.out.println((TbGeneralConfig)selectObjectByID(tbGenConf, tbGenConf.getId()));   
        

        //Delete
        //deleteObject(tbGenConf, tbGenConf.getId());
        
    }
    
}
