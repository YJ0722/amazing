package Flyweight.example.after;

// extrinsic 한 데이터를 가지고있는 클래스 (변하는 속성)
public class Character {
    private char value;

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
