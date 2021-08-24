package model;

import java.util.ArrayList;

public class CompanyModel {
    private int id;
    private String companyName;
    private String fantasyName;
    private String cnpj;
    private ArrayList<SubsidiaryModel> subsidiaries;

    public CompanyModel(int id, String companyName, String fantasyName, String cnpj) {
        this.id = id;
        this.companyName = companyName;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
        this.subsidiaries = new ArrayList<SubsidiaryModel>();
    }

    public CompanyModel(int id, String companyName, String fantasyName, String cnpj, ArrayList<SubsidiaryModel> subsidiaries) {
        this.id = id;
        this.companyName = companyName;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
        this.subsidiaries = subsidiaries;
    }

    public int getId() {
        return id;
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

    public void addSubsidiary(SubsidiaryModel subsidiary) {
        subsidiaries.add(subsidiary);
    }

    public void removeSubsidiary(SubsidiaryModel subsidiary) {
        subsidiaries.remove(subsidiary);
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", fantasyName='" + fantasyName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", subsidiaries=" + subsidiaries +
                '}';
    }
}
