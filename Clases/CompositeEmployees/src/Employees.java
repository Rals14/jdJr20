public class Employees implements Component{
   public String name;

    public Employees(String name) {
          this.name = name;
     }

    @Override
    public void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}
