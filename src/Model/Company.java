package Model;

public class Company {
    private int id;
    private String companyName;
    private String fantasyName;
    private String cnpj;

    public Company(int id, String companyName, String fantasyName, String cnpj) {
        this.id = id;
        this.companyName = companyName;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean setCompanyName(String companyName) {
        if(companyName instanceof String) {
            this.companyName = companyName;
            return true;
        } else {
            return false;
        }
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public boolean setFantasyName(String fantasyName) {
        if(fantasyName instanceof String) {
            this.fantasyName = fantasyName;
            return true;
        } else {
            return false;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", fantasyName='" + fantasyName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
