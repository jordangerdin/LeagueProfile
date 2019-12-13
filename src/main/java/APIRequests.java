import Classes.League;
import Classes.Mastery;
import Classes.MatchHistory;
import Classes.Summoner;
import kong.unirest.Unirest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class APIRequests {

    public static String getRegionCode(String region) {
        String regionCode = "";
        switch(region) {
            case ("North America"):
                regionCode = "NA1";
                break;
            case ("Europe West"):
                regionCode = "EUW1";
                break;
            case ("Europe East & Nordic"):
                regionCode = "EUN1";
                break;
            case ("Korea"):
                regionCode = "KR";
                break;
            case ("Oceania"):
                regionCode = "OC1";
                break;
            case ("LAS"):
                regionCode = "LA1";
                break;
            case ("LAN"):
                regionCode = "LA2";
                break;
            case("Brazil"):
                regionCode = "BR1";
                break;
            case ("Japan"):
                regionCode = "JP1";
                break;
            case ("Turkey"):
                regionCode = "TR1";
                break;
            case ("Russia"):
                regionCode = "RU";
                break;
        }
        return regionCode;
    }

    public static Summoner getPlayerData(String regionCode, String summoner) {
        String version = "v4";

        String urlSummoner = "https://" + regionCode + ".api.riotgames.com/lol/summoner/" + version +
                "/summoners/by-name/" + summoner + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        Summoner player = Unirest.get(urlSummoner)
                .asObject(Summoner.class)
                .getBody();
        return player;
    }

    public static League[] getPlayerRank(String regionCode, String summonerId){
        String version = "v4";

        String urlLeague = "https://" + regionCode + ".api.riotgames.com/lol/league/" + version +
                "/entries/by-summoner/" + summonerId + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        League[] response = Unirest.get(urlLeague)
                .asObject(League[].class)
                .getBody();

        return response;
    }

    public static Mastery[] getPlayerMasteries(String regionCode, String summonerId){
        String version = "v4";

        String urlMastery = "https://" + regionCode + ".api.riotgames.com/lol/champion-mastery/" + version +
                "/champion-masteries/by-summoner/" + summonerId + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        Mastery[] response = Unirest.get(urlMastery)
                .asObject(Mastery[].class)
                .getBody();

        return response;
    }

    public static MatchHistory getPlayerMatchlist(String regionCode, String accountId){
        // API version
        String version = "v4";

        String urlMatch = "https://" + regionCode + ".api.riotgames.com/lol/match/" + version +
                "/matchlists/by-account/" + accountId + "?endIndex=10&api_key=" + LeagueProfileAPI.RIOT_API_KEY;

        MatchHistory response = Unirest.get(urlMatch)
                .asObject(MatchHistory.class)
                .getBody();

        return response;
    }

    public static Image getChampionIcon(long champId) {
        //String champName = getChampionNameById(champId);

        String champName = "Janna";

        // Image from URL, adapted from mkyong ImageIO tutorial
        // https://www.mkyong.com/java/how-to-read-an-image-from-file-or-url/
        try {
            URL url = new URL("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + champName + ".png");
            //System.out.println(url);
            Image image = ImageIO.read(url);
            return image;
        } catch (IOException e) {
            System.out.println(e);
        }

        return null;
    }

    public static String getChampionNameById(long champId) {
        String name = "";


        return name;
    }
}
