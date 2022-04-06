package _6kyu;
import java.util.Map;
import java.awt.Color;
final class RGB {

    public int r, g, b;

    public RGB(){}
    public RGB(int r, int g, int b){}
}
public class HtmlColorParser {
    private final Map<String, String> presetColors;
    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }
    public RGB parse(String color) {
        if (color.charAt(0) != '#') color = nameFixer(color);
        if (color.length() < 7) color = stringFixer(color);
        Color decoded = (Color.decode(color));
        return new RGB(decoded.getRed(), decoded.getGreen(), decoded.getBlue());
    }
    public String stringFixer(String s) {
        return "#" + s.charAt(1) + s.charAt(1) + s.charAt(2) + s.charAt(2) + s.charAt(3) + s.charAt(3);
    }
    public String nameFixer(String s) {
        return presetColors.get(s.toLowerCase());
    }
}