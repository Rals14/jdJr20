public class Employees implements Component{
   public String name;
   public String role;

    public Employees(String name, String role) {
          this.name = name;
            this.role = role;
     }

    @Override
    public void showDetails() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}
