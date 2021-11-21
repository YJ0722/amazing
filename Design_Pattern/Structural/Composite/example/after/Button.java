package Composite.example.after;

public class Button implements Component {
    private String name;
    private boolean visible;

    public Button (String name, boolean visible) {
        this.name = name;
        this.visible = visible;
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public void show() {
        if (visible)
            System.out.println(name);
    }
}
