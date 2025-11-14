package lab03;

public class Salary {
	private float ID;
    private String name;
    private String Dep;
    private float salary;
    private float GS;
    
    public Salary(float ID, String name, String Dep, float salary, float GS) {
        this.ID = ID;
        this.name = name;
        this.Dep = Dep;
        this.salary = salary;
        this.GS = GS;
    }
    
    public float getsalary() {
    	return salary;
    }
    
    public float getGS() {
    	return GS;
    }
    
    public String toString() {
    	return "\nID: " + ID + "\nName: " + name + "\nDepartement: " + Dep + "\nSalary: " + salary + 
    			"\nGross Salary: " + GS;
    }
}
