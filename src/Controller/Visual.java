package Controller;

import Model.*;

import java.util.ArrayList;

public abstract class Visual {
    private static Subsidiary selectedSubisidiary;
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

    public static int getTotalEmployees(ArrayList<Employee> employees) {
        return employees.size();
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

    public static User getUser() {
        return new User("", "", true);
    };

    public static Employee getEmployee() {
        return new Employee("Carlos José", "Gerente de TI", "5 Andar", "presencial");
    };

    public static Company getCompany() {
        return new Company("Serasa LTDA", "Serasa Consumidor", "21328349-34");
    };

    public static Subsidiary getSubsidiary() {
        return selectedSubisidiary;
    };

    public static boolean setSubsidiary(Subsidiary subsidiary) {
        try {
            selectedSubisidiary = subsidiary;
        } catch (Exception e) {
            return false;
        }

        return true;
    };

    public static ArrayList<Subsidiary> getSubsidiaryList() {
        ArrayList<Subsidiary> subsidiaryList = new ArrayList<>();

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Gustavo Lemos", "Desenvolvedor", "5 Andar", true, false, "Presencial");
        e1.addEmail(new Email("Profissional", "dev.gustavolemos@outlook.com"));
        ArrayList<Employee> employees2 = new ArrayList<>();
        Employee e2 = new Employee("Paulo Dalescio", "Estagiário", "Sala do Zelador", false, true, "Presencial");
        e2.addEmail(new Email("Pessoal", "paulodalescio@gmail.com"));
        employees.add(e1);
        employees.add(e2);
        employees.add(new Employee("Yuri Renato Baptista", "Desenvolvedor", "5 Andar", true, false, "Presencial"));
        employees.add(new Employee("Caio Márcio Raimundo Melo", "PO", "5 Andar", true, false, "Presencial"));
        employees.add(new Employee("Malu Heloise Mariah da Mota", "QO", "5 Andar", false, false, "HomeOffice"));
        employees.add(new Employee("Clarice Cláudia Oliveira", "Desenvolvedor", "5 Andar", false, false, "Presencial"));
        employees.add(new Employee("Silvana Fabiana Bárbara Farias", "Desenvolvedor", "5 Andar", false, true, "Presencial"));
        employees.add(new Employee("Alícia Caroline Santos", "Desenvolvedor", "5 Andar", false, true, "Presencial"));
        employees.add(new Employee("Diogo Vicente Antonio Rocha", "Gerente", "5 Andar", false, true, "Presencial"));
        subsidiaryList.add(new Subsidiary("CPC LTD", "CPC", "21328349-34", "CPC Blumenau", employees));

        ArrayList<Employee> employees3 = new ArrayList<>();
        Employee e3 = new Employee("Gustavo Lemos", "Desenvolvedor", "5 Andar", true, false, "Presencial");
        e3.addEmail(new Email("Profissional", "dev.gustavolemos@outlook.com"));
        e3.addPhone(new Phone("Pessoal", "48", "888888888"));
        e3.addPhone(new Phone("Profissional", "48", "223355"));
        ArrayList<Employee> employees4 = new ArrayList<>();
        Employee e4 = new Employee("Paulo Dalescio", "Estagiário", "Sala do Zelador", false, true, "Presencial");
        e4.addEmail(new Email("Pessoal", "paulodalescio@gmail.com"));
        e4.addPhone(new Phone("Pessoal", "92", "999999999"));
        employees2.add(e3);
        employees2.add(e4);
        employees2.add(new Employee("José Marcos da Luz", "Desenvolvedor", "5 Andar", false, false, "Presencial"));
        employees2.add(new Employee("Yasmin Márcia Barbosa", "PO", "5 Andar", false, false, "Presencial"));
        employees2.add(new Employee("Marcelo Pedro Mário Farias", "QO", "5 Andar", false, false, "HomeOffice"));
        employees2.add(new Employee("Edson Leandro Pereira", "Desenvolvedor", "5 Andar", false, false, "Hibrido"));
        employees2.add(new Employee("Sarah Sara Corte Real", "Desenvolvedor", "5 Andar", false, true, "Presencial"));
        employees2.add(new Employee("Elaine Joana Helena Lima", "Desenvolvedor", "5 Andar", false, true, "HomeOffice"));
        employees2.add(new Employee("Lucas Samuel Brito", "Gerente", "5 Andar", false, true, "HomeOffice"));
        subsidiaryList.add(new Subsidiary("SPC LTDA", "SPC", "21328349-34", "SPC Itajai", employees2));
        return subsidiaryList;
    };

    public static Subsidiary getSubisidiaryByDisplayName(String displayName) {
        ArrayList<Subsidiary> subsidiaryList = getSubsidiaryList();
        for (Subsidiary subsidiary: subsidiaryList) {
            if(subsidiary.getDisplayName().equals(displayName)) {
                return subsidiary;
            }
        }
        return null;
    }

    public static boolean login(String username, String password) {
        if(username.equals("gabe") && password.equals("steam")) {
            return true;
        }
        return false;
    }

    public static boolean sendMail(String title, String description, String receiver) {
        return Mail.Send(title, description, receiver);
    }

    public static boolean sendMultipleMail(String title, String description, ArrayList<Employee> employees) {
        try {
            for (Employee employee: employees) {
                if(employee.getEmails().size() > 0) {
                    System.out.println("Email enviado!");
                    Mail.Send(title, description, employee.getEmails().get(0).getValue());
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
