package org.hybernate.CRUDVehicle;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.Vehicle;
import org.hybernate.Utility.HybernateUtil;

public class CreateVehicle {

    public void createNewVehicle(String name,String classveh, float volume, int price, String owner){

        try(Session session = HybernateUtil.getSessionFactory().openSession()){
            session.getTransaction().begin();
            Query<Vehicle> addNewVehicle = session.createQuery("INSERT INTO Vehicle(nameVehicle,classVehicle,volumeVehicle,priceVehicle,ownerVehicle) VALUES(:name,:classveh,:volume,:price,:owner)");
            addNewVehicle.setParameter("name", name);
            addNewVehicle.setParameter("classveh",classveh);
            addNewVehicle.setParameter("volume",volume);
            addNewVehicle.setParameter("price",price);
            addNewVehicle.setParameter("owner",owner);
            int res = addNewVehicle.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result count query: " + res);
            } catch (HibernateException e){
            throw new RuntimeException(e);
         }
        }
    }
