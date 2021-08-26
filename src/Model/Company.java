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

    public String getFantasyName() {
        return fantasyName;
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
