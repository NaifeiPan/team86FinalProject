//Data sourced from Kaggle: https://www.kaggle.com/djonafegnem/chicago-crime-data-analysis
public class CrimeData {
	private int ID;
	private String caseNumber;
	private String dateTimeOfIncident;// TODO: Split into separate variables: date & time. Will probably need to use
										// REGEX
	private String blockAddresss; // NOTE: Last two digits of addresses replaced with "XX" to anonymize. Will need
									// to use Lat/Long or XY coordinates for precise map plotting.
	private String crimeType;
	private String crimeSubType;
	private String locationDescription; // NOTE: This will be a good field to ask questions about
	private boolean resultsInArrest;
	private boolean domesticDispute;
	private int communityCode;
	private int xCoordinate;
	private int yCoordinate;
	private int year;
	private String lastUpdate;
	private double latitude;
	private double longitude;
	private String latLongLocation; // Concatenation of lat & long in '(lat, long)' format.

	public CrimeData(int passedID, String passedcaseNumber, String passeddateTimeOfIncident, String passedblockAddresss,
			String passedcrimeType, String passedcrimeSubType, String passedlocationDescription,
			boolean passedresultsInArrest, boolean passeddomesticDispute, int passedcommunityCode,
			int passedxCoordinate, int passedyCoordinate, int passedyear, String passedlastUpdate,
			double passedlatitude, double passedlongitude, String passedlatLongLocation) {
		ID = passedID;
		caseNumber = passedcaseNumber;
		dateTimeOfIncident = passeddateTimeOfIncident;
		blockAddresss = passedblockAddresss;
		crimeType = passedcrimeType;
		crimeSubType = passedcrimeSubType;
		locationDescription = passedlocationDescription;
		resultsInArrest = passedresultsInArrest;
		domesticDispute = passeddomesticDispute;
		communityCode = passedcommunityCode;
		xCoordinate = passedxCoordinate;
		yCoordinate = passedyCoordinate;
		year = passedyear;
		lastUpdate = passedlastUpdate;
		latitude = passedlatitude;
		longitude = passedlongitude;
		latLongLocation = passedlatLongLocation;

	}

	public int getID() {
		return ID;
	}

	public String getcaseNumber() {
		return caseNumber;
	}

	public String getdateTimeOfIncident() {
		return dateTimeOfIncident;
	}

	public String getblockAddresss() {
		return blockAddresss;
	}

	public String getcrimeType() {
		return crimeType;
	}

	public String getcrimeSubType() {
		return crimeSubType;
	}

	public String getlocationDescription() {
		return locationDescription;
	}

	public boolean getresultsInArrest() {
		return resultsInArrest;
	}

	public boolean getdomesticDispute() {
		return domesticDispute;
	}

	public int getcommunityCode() {
		return communityCode;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public int getyear() {
		return year;
	}

	public String getlastUpdate() {
		return lastUpdate;
	}

	public double getlatitude() {
		return latitude;
	}

	public double getlongitude() {
		return longitude;
	}

	public String getlatLongLocation() {
		return latLongLocation;
	}

}
