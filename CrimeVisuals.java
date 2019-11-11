import java.util.*;

public class CrimeVisuals {
	public static void main(String[] args) {
		CrimeVisuals cv = new CrimeVisuals();
		// listIncidentsByLocation locList = new listIncidentsByLocation();

		// pull the hashmap of loaded data and filter it for the time range and crime
		// specified by the user
		// pass the new, filtered hashmap to the GUI

		// locList.getLocList
	}

//incidentSelection, startDate, and endDate are provided by the user. 
//TODO: build UI to get user inputs
	public HashMap<Integer, CrimeData> GetUserList(int incidentSelection, String startDate, String endDate) {
		HashMap<Integer, CrimeData> filteredListHM = new HashMap<>();

		for (int key : crimeDataHM.keySet()) { // TODO: crimeDataHM = the hashmap output of the crime data loader.
												// Substitute with actual values as applicable
			if (crimeDataHM.get(key).getyear() > startDate && crimeDataHM.get(key).getyear() < endDate) {
				filteredListHM.put(key, crimeDataHM.get(key));
			}

		}

		return filteredListHM;
	}

//Creates a distinct ArrayList of crime types for use in later methods.
	public ArrayList<String> listOfCrimeTypes(HashMap<Integer, CrimeData> crimeDataHM) {
		ArrayList<String> aryCrimes = new ArrayList<String>();
		int i = 0;
		for (int key : crimeDataHM.keySet()) {
			boolean notAddedYet = true;
			for (String a : aryCrimes) {
				if (a.trim().equals((crimeDataHM.get(key).getcrimeType().trim()))) {
					notAddedYet = false;
				}

			}
			if (notAddedYet == true) {
				aryCrimes.add(crimeDataHM.get(key).getcrimeType().trim());
			}
		}

		return aryCrimes;
	}

//Create the hashmap for a histogram of crime counts by type over the time range specified by the user. 
//Dependent on filteredListHM to get the relevant date range and listOfCrimeTypes to get a distinct list of incident types
	public HashMap<String, Integer> CrimeCountHM(HashMap<Integer, CrimeData> filteredListHM,
			ArrayList<String> aryCrimes) {
		HashMap<String, Integer> histogramHM = new HashMap<>();

		for (String crimeType : aryCrimes) {
			int j = 0;
			for (int key : filteredListHM.keySet()) {
				if(filteredListHM.get(key).getcrimeType().equals(crimeType)) {
					j++;
				}
			}
			histogramHM.put(crimeType, j); //Adds incident type and number of incidents to the
		}

		return histogramHM;
	}
}
