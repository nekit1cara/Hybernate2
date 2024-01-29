package org.hybernate.CRUDPeople.DeleteOperation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hybernate.MappingTablesENTITY.People;
import org.hybernate.Utility.HybernateUtil;

public class DeletePeoples {

    public People deletePeople(int id_people){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            People people = session.get(People.class, id_people);
            session.delete(people);
            session.getTransaction().commit();
        }catch (HibernateException e){
        throw new RuntimeException(e);
    }

        return null;
    }

}
