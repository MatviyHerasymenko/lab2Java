import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

          Person original = new Person("Шевченко", "Тарас", 47);
        System.out.println("Оригінальний об'єкт: " + original);

        String json = gson.toJson(original);
        System.out.println("\nJSON:\n" + json);

        Person restored = gson.fromJson(json, Person.class);
        System.out.println("\nВідновлений об'єкт: " + restored);

        boolean areEqual = original.equals(restored);
        System.out.println("\noriginal.equals(restored) = " + areEqual);
    }
}
