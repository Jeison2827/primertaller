package co.edu.unbosque.model.persistence;

import com.opencsv.CSVReader;

import co.edu.unbosque.model.ECommerceData;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {
	public ArrayList<ECommerceData> commerceDataList;

	public CSVFile(String path) {
		commerceDataList = new ArrayList<>();
		uploadData(path);
	}

	public void uploadData(String path) {
		try {
			CSVReader reader = new CSVReader(new FileReader(path));
			String[] currentLine;
			reader.readNext();
			
			currentLine = reader.readNext();
			
			while(currentLine != null) {
				currentLine = reader.readNext();
				
				if (currentLine == null) {
					break;
				}
				try {
					String invoiceNo = currentLine[0];
					String stockCode = currentLine[1];
					String description = currentLine[2];
					String quantity = currentLine[3];
					String invoiceDate = currentLine[4];
					String unitPrice = currentLine[5];
					String customerId = currentLine[6];
					String country = currentLine[7];
					ECommerceData data = new ECommerceData(invoiceNo, stockCode, description, quantity, invoiceDate,
							unitPrice, customerId, country);
					commerceDataList.add(data);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			reader.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// Este metodo permite realizar la suma total de las ventas del archivo csv
		public double SumaTotales() {


	        double Total = 0;
	        for (int i=0; i<commerceDataList.size();i++) {

	        	ECommerceData producto = commerceDataList.get(i);
	            double cantidad = Double.parseDouble(producto.getQuantity()) ;
	            double precio = Double.parseDouble(producto.getUnitPrice());



	            double numero = cantidad * precio;
	            Total += numero;
	        }

	        return Total;
		}
		
		
		// Este metodo permite realizar la busqueda de un recibo en especifico e imprime todos los objetos contenidos en el recibo
		public String BuscarRecibo(String invoiceNo) {
	        String recibo = "";
	        for (int i=0; i<commerceDataList.size(); i++) {
	        	
	        	ECommerceData referencia = commerceDataList.get(i);
	        	
	        	
	            if (referencia.getInvoiceNo().equals(invoiceNo)) {

	                recibo += referencia + "\n";
	            }
	        }

	        return recibo;
		}
		
		// Este metodo permite calcular la cantidad de unidades vendidas para un stock solicitado
		public int BuscarStocke(String stockCode) {

	        int num = 0;

	        for (int i = 0; i < commerceDataList.size(); i++) {
	        	ECommerceData referencia = commerceDataList.get(i);
	            if (referencia.getStockCode().equalsIgnoreCase(stockCode)) {
	                num += Integer.parseInt(referencia.getQuantity());
	            }
	        }

	        return num;
	    }


	public ArrayList<ECommerceData> getCommerceDataList() {
		return commerceDataList;
	}

	public void setCsvList(ArrayList<ECommerceData> commerceDataList) {
		this.commerceDataList = commerceDataList;
	}
}
