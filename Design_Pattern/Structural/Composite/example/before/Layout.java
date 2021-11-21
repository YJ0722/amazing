package Composite.example.before;

import java.util.ArrayList;
import java.util.List;

public class Layout {
    private List<Button> buttons = new ArrayList<>();

    public void add(Button button) {
        buttons.add(button);
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void show() {
        buttons.forEach(Button::show);
    }
}
