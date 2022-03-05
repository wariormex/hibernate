package com.mayab.desarrollo.main;
import com.mayab.desarrollo.hibernate.*;

public class Driver {
	 public static void main(String[] args) {
		 
	  CRUDOperations crudOperations = new CRUDOperations();
	  crudOperations.insertEntity();
	  crudOperations.findEntity();
	  crudOperations.updateEntity();
	  //crudOperations.removeEntity();
	  
	 }
	}
