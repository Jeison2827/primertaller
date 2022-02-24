package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Scanner;

import co.edu.unbosque.model.ECommerceData;
import co.edu.unbosque.model.persistence.CSVFile;

public class Controller {
	private final CSVFile csvFile;
	public ECommerceData e;
	public Scanner sc = new Scanner(System.in);


	public Controller() {
		csvFile = new CSVFile("TallerProgramacion\\csv\\data.csv");
		funcionar();
	}

	public void funcionar() {

		
		
		// La linea comentareada en la parte de abajo permite imprimir el contenido del archivo csv
		/*for (ECommerceData data : csvFile.getCommerceDataList()) {
			System.out.println(data);*/
		
		
		
		// Imprime por pantalla el metodo SumaTotales con su debida respuesa
		System.out.println("LAS VENTAS TOTALES SON:  "+csvFile.SumaTotales() + "\n" + "\n" + "\n");
		
		
		//Solicita numero e imprime el metodo de BuscarRecibo con su infomacion solicitada
		System.out.println("INGRESE EL NUMERO DEL RECIBO: ");
		String referencia = sc.next();
		System.out.println(csvFile.BuscarRecibo(referencia)+ "\n" + "\n" + "\n");
		
		
		//Solicita numero del stock e imprime el numero de productos por stock
		System.out.println("INGRESE EL NUMERO DEL STOCK DESEADO: ");
		String referencia2 = sc.next();
		System.out.println("El numero de productos con el Stock deseado es: " + csvFile.BuscarStocke(referencia2));
		}
	}


