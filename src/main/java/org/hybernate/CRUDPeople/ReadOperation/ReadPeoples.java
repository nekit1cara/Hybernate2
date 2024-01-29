package org.hybernate.CRUDPeople.ReadOperation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.People;
import org.hybernate.Utility.HybernateUtil;

public class ReadPeoples {


    public People readPeopleByID(int id_people){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            People people = session.get(People.class, id_people);
            session.getTransaction().commit();
            return people;
        } catch (HibernateException e){
        throw new RuntimeException(e);
      }
    }


    public void readPeopleNameForPositions(){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> midPeople = session.createQuery("SELECT namePeople from People WHERE positionsPeople = 'Middle'");
              //  midPeople.setParameter("positions",positions);
                session.getTransaction().commit();
            System.out.println(midPeople);
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }

    }

    public void readAllPeopleByIDWhereJunior(String position_people){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> readAllPeopleWherePosJun = session.createQuery("select idPeople, namePeople,lastnamePeople,profesionPeople,positionsPeople,salaryPeople FROM People WHERE positionsPeople = 'Junior'");
                readAllPeopleWherePosJun.setParameter("positionsPeople", position_people);
                int res = readAllPeopleWherePosJun.executeUpdate();
                session.getTransaction().commit();
                System.out.println("Result: " + res);
        } catch (HibernateException e){
            throw new RuntimeException(e);
        }

    }



//    public People readAllPeople(){
//        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
//            String hqlAllPeopl = "SELECT idPeople,namePeople,lastnamePeople,profesionPeople,positionsPeople,salaryPeople FROM People";
//            Query<People> allPeople = session.createQuery(hqlAllPeopl, People.class);
//            return allPeople.getSingleResultOrNull();
//        } catch (HibernateException e){
//            throw new RuntimeException(e);
//        }
//
//    }

}
