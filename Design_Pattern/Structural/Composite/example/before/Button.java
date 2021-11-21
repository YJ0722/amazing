package Composite.example.before;

public class Button {
    private String name;
    private boolean visible;

    public Button (String name, boolean visible) {
        this.name = name;
        this.visible = visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void show() {
        if (visible)
            System.out.println(name);
    }
}
