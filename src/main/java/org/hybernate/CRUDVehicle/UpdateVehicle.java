package org.hybernate.CRUDVehicle;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.Vehicle;
import org.hybernate.Utility.HybernateUtil;

public class UpdateVehicle {

    public void updateAllVehicleAttribute(int id, String name,String vehclass,float volume, int price, String owner){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<Vehicle> setAllParameters = session.createQuery("UPDATE Vehicle SET nameVehicle = :name,classVehicle = :vehclass, volumeVehicle = :volume, priceVehicle = :price, ownerVehicle = :owner WHERE idVehicle = :id");
            setAllParameters.setParameter("id", id);
            setAllParameters.setParameter("name", name);
            setAllParameters.setParameter("vehclass", vehclass);
            setAllParameters.setParameter("volume", volume);
            setAllParameters.setParameter("price", price);
            setAllParameters.setParameter("owner", owner);
            int res = setAllParameters.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result query count: " + res);

          } catch (HibernateException e){
             throw new RuntimeException(e);
        }

    }

}
