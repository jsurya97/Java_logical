import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurance {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(3);
        l.add(2);
        l.add(1);
        l.add(1);
        Map res = new HashMap();
        for (int i = 0; i < l.size(); i++) {
            int count = 1;
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i) == l.get(j) && i != j) {
                    count++;
                }
            }

            res.put(l.get(i), count);

        }
        System.out.println(res);
    }
}