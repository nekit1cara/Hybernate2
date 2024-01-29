package org.hybernate.CRUDVehicle;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.Vehicle;
import org.hybernate.Utility.HybernateUtil;

public class ReadVehicle {

    public void readAllVehicleAttributeById(int id){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<Vehicle> readVehicle = session.createQuery("SELECT idVehicle, nameVehicle,classVehicle,volumeVehicle,priceVehicle,ownerVehicle FROM  Vehicle WHERE idVehicle = :id");
            String res = readVehicle.toString();
            readVehicle.setParameter("id", id);
            System.out.println(res);
            session.close();
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

}
