package Model;

public class Company {
    protected String companyName;
    protected String fantasyName;
    protected String cnpj;

    public Company(String companyName, String fantasyName, String cnpj) {
        this.companyName = companyName;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
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
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", fantasyName='" + fantasyName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
