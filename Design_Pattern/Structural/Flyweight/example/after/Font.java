package Flyweight.example.after;
// flyweight에 해당하는 클래스
public final class Font {
    // 주의! flyweight 에 해당하는 인스턴스는 Immutable 해야함
    // 공유하는 데이터이기 때문에 변경이 일어나면 안 됨 변경 불가능하게!
    // final 키워드를 사용, 상속을 막아야하기 때문에 클래스에도 final
    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
