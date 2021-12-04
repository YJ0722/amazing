package Flyweight.example.after;

import java.util.HashMap;
import java.util.Map;

// flyweight 인스턴스를 생성하고 캐싱을 지원할 flyweight factory
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String family, int size) {
        if (cache.containsKey(family)) {
            return cache.get(family);
        } else {
            Font newFont = new Font(family, size));
            cache.put(family, newFont);
            return newFont;
        }
    }
}
