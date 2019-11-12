import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataHandler {

	public DataHandler() {
		// TODO Auto-generated constructor stub
	}
	
	private boolean isEmpty(String str) {
		return str.length() == 0;
	} 
	
	private CrimeData processRow(String[] row){
		int id = Integer.parseInt(row[0]);
		String caseNumber = row[1];
		String date = row[2];
		String block = row[3];
		String primaryType = row[5];
		String description = row[6];
		String locationDescription = row[7];
		boolean arrest =  Boolean.parseBoolean(row[8]);
		boolean domestic = Boolean.parseBoolean(row[9]);
		double communityCode = isEmpty(row[12]) ? 0.0 : Double.parseDouble(row[12]) ;
		double xCoords = isEmpty(row[14]) ? 0.0 : Double.parseDouble(row[14]);
		double yCoords = isEmpty(row[15]) ? 0.0 : Double.parseDouble(row[15]);
		int year = isEmpty(row[16]) ? 0 :Integer.parseInt(row[16]);
		String updated = row[17];
		double lat =isEmpty(row[18])? 0.0 : Double.parseDouble(row[18]);
		double longitude = isEmpty(row[19])? 0.0 : Double.parseDouble(row[19]);
		String location = row[20];
		
		
		CrimeData processedRow = new CrimeData(id, caseNumber, date, block, primaryType,description, locationDescription,
				arrest, domestic, communityCode, xCoords, yCoords, year, updated, lat, longitude, location);
		
		return processedRow;
	}
	
	public ArrayList<CrimeData> processRawData(ArrayList<String> data) {
		ArrayList<CrimeData> crimeDataList = new ArrayList<CrimeData>();
		data.remove(0);
		for (String dataString : data) {
			String[] rowArr = dataString.split(",");
			CrimeData row = processRow(rowArr);
			crimeDataList.add(row);
		}

		
		return crimeDataList;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileHandler fh = new FileHandler();
		ArrayList<String> f = fh.readFile("test.csv");
		DataHandler dh = new DataHandler();
		ArrayList<CrimeData> pd = dh.processRawData(f);
		System.out.print(pd);
	}

}
