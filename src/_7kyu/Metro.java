package _7kyu;
import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int in = 0;
        int out = 0;
        for (int i = 0; i < stops.size(); i++) {
            in = in + stops.get(i)[0];
            out = out + stops.get(i)[1];
        }
        return in-out;
    }
}
