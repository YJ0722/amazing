package Composite.example.after;

import java.util.ArrayList;
import java.util.List;

public class Layout implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void setVisible(boolean visible) {
        components.forEach(button -> button.setVisible(visible));
    }

    @Override
    public void show() {
        components.forEach(Component::show);
    }
}
