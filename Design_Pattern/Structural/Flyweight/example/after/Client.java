package Flyweight.example.after;

public class Client {
    // 성능 개선을 위한 디자인 패턴
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "White", fontFactory.getFont("nanum", 12));
        Character c2 = new Character('e', "White", fontFactory.getFont("nanum", 12));
        Character c3 = new Character('l', "White", fontFactory.getFont("nanum", 12));
        Character c4 = new Character('l', "White", fontFactory.getFont("nanum", 12));
        Character c5 = new Character('o', "White", fontFactory.getFont("nanum", 12));
    }
}
