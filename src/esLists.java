import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class esLists {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Ancona", "Bari", "Lucca");

        //cityNames.add("Rimini");
        // (La li sta è immutabile e non è possibile aggiungere elementi)
        cityNames.set(1, "Tegucigalpa");
        System.out.println(cityNames);

        ArrayList<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servo Tullio");
        kingsOfRome.add("Taqruinio il superbo");
        System.out.println(kingsOfRome);

        String[] kingOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingOfRomeArray));
    }
}