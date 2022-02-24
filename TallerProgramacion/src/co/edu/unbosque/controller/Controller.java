package co.edu.unbosque.controller;

import java.util.Iterator;

import co.edu.unbosque.model.ECommerceData;
import co.edu.unbosque.model.persistence.CSVFile;

public class Controller {
	private final CSVFile csvFile;
	public ECommerceData e;


	public Controller() {
		csvFile = new CSVFile("TallerProgramacion\\csv\\data.csv");
		funcionar();
	}

	public void funcionar() {
		
		
		
		
		for (ECommerceData data : csvFile.getCommerceDataList()) {
			System.out.println(data);
		
		System.out.println(csvFile.SumaTotales());
			
		}
	}

}
