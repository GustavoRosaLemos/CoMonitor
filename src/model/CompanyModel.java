package model;

public class CompanyModel {
    private String id;
    private String companyName;
    private String fantasyName;
    private String cnpj;

    public CompanyModel(String id, String companyName, String fantasyName, String cnpj) {
        this.id = id;
        this.companyName = companyName;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getCnpj() {
        return cnpj;
    }
}
