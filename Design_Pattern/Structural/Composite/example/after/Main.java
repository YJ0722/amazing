package Composite.example.after;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼", false);
        Button otherButton = new Button("다른버튼", false);

        Layout layout = new Layout();
        layout.add(button);
        layout.add(otherButton);

        Main main = new Main();
        main.show(button);
        main.show(layout);
    }

    private void show(Component component) {
        component.setVisible(true);
        component.show();
    }
}
