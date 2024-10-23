import java.util.ArrayList;

class IndividualCustomer extends Customer  {
    private String gender;
    private String identificationInfo;
    private String occupation;
    private static int totalIndividualCustomer = 0;

    public IndividualCustomer(String name, String address, String contactDetails, String gender, String identificationInfo, String occupation, ArrayList<Account> accounts) {
        super(name, address, contactDetails, accounts);
        this.gender = gender;
        this.identificationInfo = identificationInfo;
        this.occupation = occupation;
        totalIndividualCustomer++;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentificationInfo() {
        return identificationInfo;
    }

    public void setIdentificationInfo(String identificationInfo) {
        this.identificationInfo = identificationInfo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", gender='" + gender + '\'' +
                ", identificationInfo='" + identificationInfo + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public int getTotalCustomer() {
        return totalIndividualCustomer;
    }
}

