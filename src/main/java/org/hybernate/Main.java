package org.hybernate;

import org.hibernate.Session;
import org.hybernate.CRUDPeople.CreateOperation.CreatePeoples;
import org.hybernate.CRUDPeople.DeleteOperation.DeletePeoples;
import org.hybernate.CRUDPeople.ReadOperation.ReadPeoples;
import org.hybernate.CRUDPeople.UpdateOperation.UpdatePeoples;
import org.hybernate.CRUDVehicle.CreateVehicle;
import org.hybernate.CRUDVehicle.DeleteVehicle;
import org.hybernate.CRUDVehicle.ReadVehicle;
import org.hybernate.CRUDVehicle.UpdateVehicle;
import org.hybernate.Utility.HybernateUtil;



public class Main {

    public static void main(String[] args) {

        Session session = HybernateUtil.getSessionFactory().openSession();
        CreatePeoples createPeoples = new CreatePeoples();
        ReadPeoples readPeoples = new ReadPeoples();
        UpdatePeoples updatePeoples = new UpdatePeoples();
        DeletePeoples deletePeoples = new DeletePeoples();
        //vehicle table
        CreateVehicle createVehicle = new CreateVehicle();
        UpdateVehicle updateVehicle = new UpdateVehicle();
        DeleteVehicle deleteVehicle = new DeleteVehicle();
        ReadVehicle readVehicle = new ReadVehicle();



//            try {
//                People alesea = new People();
//
//                alesea.setNamePeople("Olesea");
//                alesea.setLastnamePeople("Semerenko");
//                alesea.setProfesionPeople("Not worked");
//                alesea.setPositionsPeople("");
//                alesea.setSalaryPeople(0);
//                createPeoples.savePeople(alesea);
//
//                System.out.println("New User Add");
//            } catch (HibernateException e) {
//                if (session.getTransaction() != null){session.getTransaction().rollback();}
//                throw new RuntimeException(e);
//
//            }finally {
//                session.close();
//                 }

//            try {
//
//                People nadya = new People();
//
//                nadya.setNamePeople("Nadya");
//                nadya.setLastnamePeople("Sheviliova");
//                nadya.setProfesionPeople("English teacher");
//                nadya.setPositionsPeople("Middle");
//                nadya.setSalaryPeople(600);
//                createPeoples.savePeople(nadya);
//                System.out.println("New User Add");
//
//            } catch (HibernateException e) {
//                if (session.getTransaction() != null){session.getTransaction().rollback();}
//                System.out.println("User not added");
//                throw new RuntimeException(e);
//
//            }finally {
//                session.close();
//            }

//        try {
//            People samePeople = readPeoples.readPeopleByID(2);
//            if (samePeople != null){
//                System.out.println("User ID: " + samePeople.getIdPeople());
//                System.out.println("First Name: " + samePeople.getNamePeople());
//                System.out.println("Last Name: " + samePeople.getLastnamePeople());
//                System.out.println("Position: " + samePeople.getProfesionPeople());
//                System.out.println("Position: " + samePeople.getPositionsPeople());
//                System.out.println("Salary: " + samePeople.getSalaryPeople());
//            }
//        } catch (HibernateException e) {
//            if (session.getTransaction() != null){session.getTransaction().rollback();}
//            System.out.println("User not read");
//            throw new RuntimeException(e);
//        }

//        try {
//            People samep = new People();
//            deletePeoples.deletePeople(21);
//        } catch (HibernateException e) {
//            if (session.getTransaction() != null){session.getTransaction().rollback();}
//            System.out.println("User not deleted");
//            throw new RuntimeException(e);
//        }

//        updatePeoples.updatePeopleName(7,"Oxana");
//        updatePeoples.updatePeopleLastName("Tean", 7);
//        updatePeoples.updatePeopleProfession("looking out for pensioners", 7 );
//        updatePeoples.updatePeoplePosition(7,"Senior");
//        updatePeoples.updatePeopleSalary(7,3000);
//        updatePeoples.updatePeopleSalaryAndPosition(6,"Junior", 700);
//        updatePeoples.updatePeopleAllValues(7,"Vladimir","Rudenko","Seller Manager", "Junior", 1000);
//        readPeoples.readPeopleNameForPositions();
//        createPeoples.addPeople("Victor","Sirbu","Police","Middle", 350);
//       createVehicle.createNewVehicle("Volkswagen","Jetta",2.0f,13000,"Cociorba");
//        updateVehicle.updateAllVehicleAttribute(1,"Audi", "A6",2.0f,24000,"Caranciuc");
//        deleteVehicle.deleteVehicle(18);
//        readVehicle.readAllVehicleAttributeById(1);




        HybernateUtil.close();
    }
}
