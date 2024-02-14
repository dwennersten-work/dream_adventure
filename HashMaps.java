import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // Create a hashmap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Access a value using the get() method and the key
        System.out.println(capitalCities.get("England")); // Prints "London"

        // Remove a key-value pair using the remove() method and the key
        capitalCities.remove("England");

        // Iterate over the keys or values using a for-each loop
        for (String key : capitalCities.keySet()) {
            System.out.println(key); // Prints the keys
        }

        for (String value : capitalCities.values()) {
            System.out.println(value); // Prints the values
        }

        for (String key : capitalCities.keySet()) {
            System.out.println(key + ":" + capitalCities.get(key));
        }
    }
}
