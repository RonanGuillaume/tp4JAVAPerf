
import javolution.util.FastTable;
import javolution.util.function.Consumer;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] Args) {
        FastTable<String> tokens = new FastTable<String>().atomic().addAll("Tata","Titi","Tonton",null,null,null);

        tokens.update((Consumer<List<String>>) view -> {
            for (int i = 0, n = view.size(); i < n; i++) {
                if (view.get(i) == null) view.set(i, "");
            }
        }
        );
        System.out.println(tokens.toString());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tata");
        strings.add(null);
        strings.add("Tata");
        strings.add(null);
        strings.add("Tata");



        System.out.println(strings.toString());

    }
}