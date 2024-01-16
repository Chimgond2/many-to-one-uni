package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch1 = new Branch();
		branch1.setName("manipal yalahanka");
		branch1.setPhone(11255344);
		branch1.setCountry("india");
		branch1.setState("karnataka");

		Branch branch2 = new Branch();
		branch2.setName("manipal devanahalli");
		branch2.setPhone(11266);
		branch2.setCountry("india");
		branch2.setState("karnataka");

		Branch branch3 = new Branch();
		branch3.setName("manipal kengeri");
		branch3.setPhone(1334552114);
		branch3.setCountry("india");
		branch3.setState("karnataka");
		
		
	

		Hospital hospital = new Hospital();
		hospital.setName("maipal");
		hospital.setWeb("www.maipal.com");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		

		entityTransaction.begin();
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(hospital);
		entityTransaction.commit();

	}

}
