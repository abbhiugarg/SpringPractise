public class Hostel {
    private String hostelName;
    private String hostelLocation;
    private int noOfRooms;

    public Hostel(String hostelName, String hostelLocation, int noOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.noOfRooms = noOfRooms;
    }

    public Hostel() {
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public void setHostelLocation(String hostelLocation) {
        this.hostelLocation = hostelLocation;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "hostelName='" + hostelName + '\'' +
                ", hostelLocation='" + hostelLocation + '\'' +
                ", noOfRooms=" + noOfRooms +
                '}';
    }

    void displayHostel(){
        System.out.println(this.hostelName);
    }
    void displayLocation(){
        System.out.println(this.hostelLocation);
    }
    void displayNoOfRooms(){
        System.out.println(this.noOfRooms);
    }

}
