package org.hybernate.CRUDPeople.UpdateOperation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hybernate.MappingTablesENTITY.People;
import org.hybernate.Utility.HybernateUtil;


public class UpdatePeoples {

    Session session = HybernateUtil.getSessionFactory().openSession();

    public void updatePeopleName(int id, String newName) {

        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> setNewName = session.createQuery("UPDATE People SET namePeople = :newName WHERE idPeople = :id");
            setNewName.setParameter("newName", newName);
            setNewName.setParameter("id", id);
            int res = setNewName.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result count query: " + res);
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePeopleLastName(String newLName, int id){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> setNewLName = session.createQuery("UPDATE People SET lastnamePeople = :newLName WHERE idPeople = :id");
                setNewLName.setParameter("newLName", newLName);
                setNewLName.setParameter("id",id);
            int res = setNewLName.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result query count: " + res);
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePeopleProfession(String profesion, int id){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> setNewProfession = session.createQuery("UPDATE People SET profesionPeople = :profesion WHERE idPeople = :id");
                setNewProfession.setParameter("profesion", profesion);
                setNewProfession.setParameter("id", id);
            int res = setNewProfession.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Result query count: " + res);
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }

    }


    public void updatePeoplePosition(int IDpeople, String position_people) {

        try (Session session = HybernateUtil.getSessionFactory().openSession();) {
            session.getTransaction().begin();

            // HQL-запрос для обновления данных пользователя с Id
            Query<People> updatePosition = session.createQuery("UPDATE People SET positionsPeople = :position_people WHERE idPeople = :IDpeople");
            updatePosition.setParameter("position_people", position_people);
            updatePosition.setParameter("IDpeople", IDpeople);
            int res = updatePosition.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Number of users updated: " + res);
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePeopleSalary(int id, int salary){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> setNewSalary = session.createQuery("UPDATE People SET salaryPeople = :salary WHERE idPeople = :id");
                setNewSalary.setParameter("id", id);
                setNewSalary.setParameter("salary", salary);
            int res = setNewSalary.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Number of users updated: " + res);
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }finally {
            session.close();
        }
    }

    public void updatePeopleSalaryAndPosition(int id, String positions, int salary){

        try(Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> setNewSalaryForTheNewPosition = session.createQuery("UPDATE People SET positionsPeople = :positions, salaryPeople = :salary WHERE idPeople = :id");
                setNewSalaryForTheNewPosition.setParameter("id", id);
                setNewSalaryForTheNewPosition.setParameter("positions", positions);
                setNewSalaryForTheNewPosition.setParameter("salary", salary);
            int res = setNewSalaryForTheNewPosition.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Number of users updated: " + res);
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePeopleAllValues(int id, String name, String lname, String profesion, String positions, int salary) {
        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            Query<People> updateAllValues = session.createQuery("UPDATE People SET namePeople = :name, lastnamePeople = :lname, profesionPeople = :profesion, positionsPeople = :positions, salaryPeople = :salary WHERE idPeople = :id");
            updateAllValues.setParameter("name", name);
            updateAllValues.setParameter("lname", lname);
            updateAllValues.setParameter("profesion", profesion);
            updateAllValues.setParameter("positions", positions);
            updateAllValues.setParameter("salary", salary);
            updateAllValues.setParameter("id", id);
            int res = updateAllValues.executeUpdate();
            session.getTransaction().commit();
            System.out.println("Count Query result: " + res);
        }
    }

}
