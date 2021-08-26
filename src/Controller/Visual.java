package Controller;

import CustomException.CustomException;
import Model.*;

import java.util.ArrayList;

public abstract class Visual {

    private static float getRisk(Subsidiary subsidiary) {
        int totalEmployees = getTotalEmployees(subsidiary);
        int totalHomeOffice = getTotalHomeOffice(subsidiary);
        int totalInfecteds = getTotalInfecteds(subsidiary);
        int totalImmunizeds = getTotalImmunizeds(subsidiary);
        if(totalImmunizeds > totalInfecteds || totalHomeOffice == totalEmployees) {
            return 0;
        }
        return ((totalInfecteds * (float) 100) / (float) (totalEmployees - totalHomeOffice));
    }

    public static int getTotalInfecteds(Subsidiary subsidiary) {
        int totalInfecteds = 0;
        for (Employee employee:subsidiary.getEmployees()) {
            if(employee.isInfected()) {
                totalInfecteds++;
            }
        }
        return totalInfecteds;
    }

    public static int getTotalImmunizeds(Subsidiary subsidiary) {
        int totalImmunizeds = 0;
        for (Employee employee:subsidiary.getEmployees()) {
            if(employee.isImmunized()) {
                totalImmunizeds++;
            }
        }
        return totalImmunizeds;
    }

    public static int getTotalEmployees(Subsidiary subsidiary) {
        return subsidiary.getEmployees().size();
    }

    public static int getTotalPresential(Subsidiary subsidiary) {
        int totalPresential = 0;

        for (Employee employee: subsidiary.getEmployees()) {
            if(employee.getWorkMethod().equalsIgnoreCase("presencial")) {
                totalPresential++;
            }
        }
        return totalPresential;
    }

    public static int getTotalHybrid(Subsidiary subsidiary) {
        int totalHybrid = 0;

        for (Employee employee: subsidiary.getEmployees()) {
            if(employee.getWorkMethod().equalsIgnoreCase("hibrido")) {
                totalHybrid++;
            }
        }
        return totalHybrid;
    }

    public static int getTotalHomeOffice(Subsidiary subsidiary) {
        int totalHomeOffice = 0;

        for (Employee employee: subsidiary.getEmployees()) {
            if(employee.getWorkMethod().equalsIgnoreCase("homeoffice")) {
                totalHomeOffice++;
            }
        }
        return totalHomeOffice;
    }

    public static String getRiskLevel(Subsidiary subsidiary){
        float risk = getRisk(subsidiary);

        if(risk <= 10) {
            return "Muito baixo";
        } else if(risk > 10 && risk < 20) {
            return "Baixo";
        }  else if(risk >= 20 && risk < 40) {
            return "Médio";
        } else if(risk >= 40 && risk < 60) {
            return "Alto";
        } else if(risk >= 60 && risk < 80) {
            return "Muito Alto";
        } else {
            return "Extremo";
        }
    }

    public static String isRecommendedMeasures(Subsidiary subsidiary){
        if(getRisk(subsidiary) > 30) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public static User getUser() throws CustomException {
        return new User("", "", true);
    };

    public static Employee getEmployee() throws CustomException {
        return new Employee("Carlos José", "Gerente de TI", "5 Andar", "presencial");
    };

    public static Company getCompany() throws CustomException {
        return new Company("Serasa LTDA", "Serasa Consumidor", "21328349-34");
    };

    public static Subsidiary getSubsidiary() throws CustomException {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Yuri Renato Baptista", "Desenvolvedor", "5 Andar", true, false, "Presencial"));
        employees.add(new Employee("Caio Márcio Raimundo Melo", "PO", "5 Andar", true, false, "Presencial"));
        employees.add(new Employee("Malu Heloise Mariah da Mota", "QO", "5 Andar", false, false, "HomeOffice"));
        employees.add(new Employee("Clarice Cláudia Oliveira", "Desenvolvedor", "5 Andar", false, false, "Presencial"));
        employees.add(new Employee("Silvana Fabiana Bárbara Farias", "Desenvolvedor", "5 Andar", false, true, "Presencial"));
        employees.add(new Employee("Alícia Caroline Santos", "Desenvolvedor", "5 Andar", false, true, "Presencial"));
        employees.add(new Employee("Diogo Vicente Antonio Rocha", "Gerente", "5 Andar", false, true, "Presencial"));
        return new Subsidiary("Serasa LTDA", "Serasa Consumidor", "21328349-34", "Serasa Blumenau", employees);
    };

    public static boolean login(String username, String password) throws CustomException {
        if(username.equals("carlos") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
