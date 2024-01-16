package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItemOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item1 = new Item();
		item1.setName("saree");
		item1.setPrice(8000);
		item1.setQty(1);

		Item item2 = new Item();
		item2.setName("mirror");
		item2.setPrice(500);
		item2.setQty(1);

//		Item item3 = new Item();
//		item3.setName("mobile cover");
//		item3.setPrice(800);
//		item3.setQty(1);

		AmazonOrder amazonOrder = new AmazonOrder();
		amazonOrder.setName("for my friend wife");
		amazonOrder.setAddress("katraguppe");
		amazonOrder.setStatus("on the way");
		
		
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		//item3.setAmazonOrder(amazonOrder);

		entityTransaction.begin();
		entityManager.persist(item1);
		entityManager.persist(item2);
		//entityManager.persist(item3);

		entityManager.persist(amazonOrder);

		entityTransaction.commit();

	}

}
