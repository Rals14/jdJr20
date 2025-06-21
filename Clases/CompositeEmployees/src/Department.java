import java.util.ArrayList;
import java.util.List;

public class Department implements Component{
    private String name;
    private List<Component> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (Component component : components) {
            component.showDetails();
        }
    }
}
