package com.mayab.desarrollo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.mayab.desarrollo.entities.*;
import com.mayab.desarrollo.util.*;
public class CRUDOperations {

	    public void insertEntity() {
	    	
	        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        EntityTransaction entityTransaction = entityManager.getTransaction();
	        entityTransaction.begin();
	        
	        Alumno alumno = new Alumno("alumno1", "hola", "hola@hola.com");
	        entityManager.persist(alumno);
	        
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void findEntity() {
	        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();
	        
	        Alumno alumno = entityManager.find(Alumno.class, 1);
	        System.out.println("alumno id :: " + alumno.getId());
	        System.out.println("alumno firstname :: " + alumno.getFirstName());
	        System.out.println("alumno lastname :: " + alumno.getLastName());
	        System.out.println("alumno email :: " + alumno.getEmail());
	        
	        entityManager.getTransaction().commit();
	        
	        entityManager.close();
	    }

	    public void updateEntity() {
	        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();

	        Alumno alumno = entityManager.find(Alumno.class, 1);
	        System.out.println("alumno id :: " + alumno.getId());
	        System.out.println("alumno firstname :: " + alumno.getFirstName());
	        System.out.println("alumno lastname :: " + alumno.getLastName());
	        System.out.println("alumno email :: " + alumno.getEmail());

	        // The entity object is physically updated in the database when the transaction
	        // is committed
	        alumno.setFirstName("Alumno Nuevo");
	        alumno.setLastName("Hola nuevo");
	        entityManager.getTransaction().commit();
	        
	        entityManager.close();
	    }

	    public void removeEntity() {
	        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();

	        Alumno alumno = entityManager.find(Alumno.class, 1);
	        
	        System.out.println("alumno id :: " + alumno.getId());
	        System.out.println("alumno firstname :: " + alumno.getFirstName());
	        System.out.println("alumno lastname :: " + alumno.getLastName());
	        System.out.println("alumno email :: " + alumno.getEmail());
	        
	        entityManager.remove(alumno);
	        entityManager.getTransaction().commit();
	        
	        entityManager.close();
	    }
}

