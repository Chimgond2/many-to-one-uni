package com.ty.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetItemOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		
		Item item=entityManager.find(Item.class, 3);
		List<Item> items=new ArrayList<Item>();
		
		if(item !=null) {
			System.out.println("item id is : "+item.getId());
			System.out.println("item name is : "+item.getName());
			System.out.println("item price is : "+item.getPrice());
			System.out.println("item qty is : "+item.getQty());
			System.out.println("=============");
			AmazonOrder amazonOrder=item.getAmazonOrder();
			System.out.println(amazonOrder.getId());
			System.out.println(amazonOrder.getName());
			System.out.println(amazonOrder.getStatus());
			System.out.println("-------------------");
			
		}else {
			System.out.println("there is no item to show");
		}
		
	}

}
