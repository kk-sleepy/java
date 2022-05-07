package example01.exp;

public interface Workable {
    void updateName(String name);
    void calculateSalary();
}
abstract class  Employee implements Workable{
    public String name;
    public double salary;
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void updateName(String name) {
        this.name = name;
    }
}
class Manager extends Employee implements Workable{
    private double managerLevel;
    public Manager(String name1,double salary1,double managerLevel){
        name =name1;
        salary = salary1;
        this.managerLevel = managerLevel;
    }
    public void calculateSalary(){
        salary = salary*managerLevel*0.8;
    }
}
class Seller extends Employee implements Workable{
    private double sales;
    private double salesCommission;
    public Seller(String name1,double salary1,double sales,double salesCommission){
        name =name1;
        salary = salary1;
        this.sales = sales;
        this.salesCommission = salesCommission;
    }
    public void calculateSalary(){
        salary = salary +sales*salesCommission;
    }
}
class SalaryService{
    public void getTotalSalaries(double ...arg){
        double y = 0;
        for(double x: arg){
            y = y + x;
        }
        System.out.println(y);
    }
}
class Test{
    public static void main(String[] args) {
        Manager manager1;
        manager1 = new Manager("小王",5000,2);
        manager1.calculateSalary();
        Seller seller1;
        seller1 = new Seller("小李",3000,20000,0.15);
        seller1.calculateSalary();
        SalaryService sa =new SalaryService();
        sa.getTotalSalaries(manager1.salary, seller1.salary);
    }
}