import java.util.ArrayList;

class InstitutionalCustomer extends Customer {
    private String typeOfInstitution;
    private String industrySector;
    private double annualRevenue;
    private static int totalInstitutionalCustomer = 0;

    public InstitutionalCustomer(String name, String address, String contactDetails, String typeOfInstitution, String industrySector, double annualRevenue, ArrayList<Account> accounts) {
        super(name, address, contactDetails, accounts);
        this.typeOfInstitution = typeOfInstitution;
        this.industrySector = industrySector;
        this.annualRevenue = annualRevenue;
        totalInstitutionalCustomer++;
    }

    public String getTypeOfInstitution() {
        return typeOfInstitution;
    }

    public void setTypeOfInstitution(String typeOfInstitution) {
        this.typeOfInstitution = typeOfInstitution;
    }

    public String getIndustrySector() {
        return industrySector;
    }

    public void setIndustrySector(String industrySector) {
        this.industrySector = industrySector;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @Override
    public String toString() {
        return "InstitutionalCustomer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", typeOfInstitution='" + typeOfInstitution + '\'' +
                ", industrySector='" + industrySector + '\'' +
                ", annualRevenue=" + annualRevenue +
                '}';
    }

    @Override
    public int getTotalCustomer() {
        return totalInstitutionalCustomer;
    }
}
