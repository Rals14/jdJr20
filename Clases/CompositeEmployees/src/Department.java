import java.util.ArrayList;
import java.util.List;

public class Department implements Component{
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        for (Component component : components) {
            component.showDetails();
        }
    }
}
