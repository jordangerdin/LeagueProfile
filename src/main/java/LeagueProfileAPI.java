import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;
import kong.unirest.Unirest;
import kong.unirest.ObjectMapper;

import java.io.IOException;

public class LeagueProfileAPI {

    final static public String RIOT_API_KEY = System.getenv("RIOT_API_KEY");

    public static void main(String[] args) {

        LeagueProfileSearchGUI gui = new LeagueProfileSearchGUI();

        Unirest.config().setObjectMapper(new ObjectMapper() {
            private Gson gson = new Gson();
            @Override
            public <T> T readValue(String s, Class<T> aClass) {
                return gson.fromJson(s, aClass);
            }

            @Override
            public String writeValue(Object o) {
                return gson.toJson(o);
            }
        });
    }
}
