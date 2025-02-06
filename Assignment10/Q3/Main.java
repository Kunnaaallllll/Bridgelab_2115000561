public class Main {
    public static void main(String[] args) {
        
        Company company = new Company("Tech Solutions");

        company.addDepartment("Engineering");
        company.addDepartment("Marketing");

        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Marketing", "Charlie");

        company.displayCompanyDetails();

        company.deleteCompany();
        System.out.println("\nCompany deleted.");
    }
}