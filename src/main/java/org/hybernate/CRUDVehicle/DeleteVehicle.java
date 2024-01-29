package org.hybernate.CRUDVehicle;

import org.hibernate.Session;
import org.hybernate.MappingTablesENTITY.Vehicle;
import org.hybernate.Utility.HybernateUtil;

public class DeleteVehicle {

    public void deleteVehicle(int id){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Vehicle vehicle = session.get(Vehicle.class, id);
            session.delete(vehicle);
            session.getTransaction().commit();

        }

    }


}
