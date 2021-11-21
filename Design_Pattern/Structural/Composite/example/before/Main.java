package Composite.example.before;

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

    private void show(Button button) {
        button.setVisible(true);
        button.show();
    }

    private void show(Layout layout) {
        layout.getButtons().forEach(button -> button.setVisible(true));
        layout.getButtons().forEach(Button::show);
    }
}
