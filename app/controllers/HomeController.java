package controllers;

import play.mvc.*;

import views.html.*;

import javax.inject.Inject;

import java.util.*;

import java.lang.Float;

import static java.util.Map.Entry;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final AssetsFinder assetsFinder;

    @Inject
    public HomeController(AssetsFinder assetsFinder) {
        this.assetsFinder = assetsFinder;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(
            index.render(
                "Your new application is ready.",
                assetsFinder
            ));
    }

    public Result hello(String name) {
        LinkedHashMap<String, Float> playerScores = new LinkedHashMap<String, Float>();
        playerScores.put("Charlie8", 0.10f);
        playerScores.put("Charlie", 0.9f);
        playerScores.put("Charlie5", 0.82f);
        playerScores.put("Charlie2", 0.35f);
        playerScores.put("Charlie4", 0.78f);
        playerScores.put("Charlie6", 0.91f);
        playerScores.put("Charlie7", 0.98f);
        playerScores.put("Charlie3", 0.68f);
        return ok(hello.render(name, playerScores, this, assetsFinder));
    }

    public static LinkedHashMap<String, Float> sortByValue(HashMap<String, Float> map) {
        List<Entry<String, Float>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> Float.compare(o1.getValue(), o2.getValue()));

        LinkedHashMap<String, Float> result = new LinkedHashMap<>();
        for (Entry<String, Float> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static <K, V> LinkedHashMap<K, V> sortByKey(LinkedHashMap<K, V> map) {
        SortedSet<K> list = new TreeSet<K>(map.keySet());

        LinkedHashMap<K, V> result = new LinkedHashMap<>();
        for (K entry : list) {
            result.put(entry, map.get(entry));
        }
        return result;
    }

    public String instanceMethod() {
        return "This instance has AssetFinder:\n" + assetsFinder.toString();
    }

}
