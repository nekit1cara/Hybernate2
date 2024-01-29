package org.hybernate.CRUDPeople.CreateOperation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.People;
import org.hybernate.Utility.HybernateUtil;

public class CreatePeoples {

    public People savePeople(People people){
        //сразу получаем готовый SessionFactory и сразу создаём сессию
        try(Session session = HybernateUtil.getSessionFactory().openSession();) {
               session.getTransaction().begin();
               session.save(people);
               session.getTransaction().commit();

            } catch (HibernateException e){
                throw new RuntimeException(e);
        }
        return people;
    }


    public void addPeople(String name, String lname, String profesion, String positions, int salary){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> addnewPeople = session.createQuery("INSERT INTO People(namePeople,lastnamePeople,profesionPeople,positionsPeople,salaryPeople) VALUES(:name,:lname,:profesion,:positions,:salary)");
                addnewPeople.setParameter("name", name);
                addnewPeople.setParameter("lname", lname);
                addnewPeople.setParameter("profesion", profesion);
                addnewPeople.setParameter("positions", positions);
                addnewPeople.setParameter("salary",salary);
            int res = addnewPeople.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result count query: " + res);
        }catch (HibernateException e){
        throw new RuntimeException(e);
    }

    }


}
