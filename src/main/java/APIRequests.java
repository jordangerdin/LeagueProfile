import Classes.*;
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
                .ifFailure(Error.class, r -> {
                    Error e = r.getBody();
                })
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
                "/matchlists/by-account/" + accountId + "?endIndex=20&api_key=" + LeagueProfileAPI.RIOT_API_KEY;

        MatchHistory response = Unirest.get(urlMatch)
                .asObject(MatchHistory.class)
                .ifFailure(Error.class, r -> {
                    Error e = r.getBody();
                })
                .getBody();

        return response;
    }

    public static MatchStats getPlayerMatchData(String regionCode, String matchId){
        String version = "v4";

        String urlMatchDetails = "https://" + regionCode + ".api.riotgames.com/lol/match/" + version +
                "/matches/" + matchId + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;

        MatchStats response = Unirest.get(urlMatchDetails)
                .asObject(MatchStats.class)
                .ifFailure(Error.class, r -> {
                        Error e = r.getBody();
                })
                .getBody();

        return response;
    }

    public static Image getChampionIcon(long champId) {

        String champName = getChampionNameById(champId);

        // Image from URL, adapted from mkyong ImageIO tutorial
        // https://www.mkyong.com/java/how-to-read-an-image-from-file-or-url/
        try {
            URL url = new URL("http://ddragon.leagueoflegends.com/cdn/9.24.2/img/champion/" + champName + ".png");
            Image image = ImageIO.read(url);
            return image;
        } catch (IOException e) {
            System.out.println(e);
        }

        return null;
    }



    public static String getChampionNameById(long champId) {
        String name = "";

        switch(String.valueOf(champId)){
            case("266"):
                name = "Aatrox";
                break;
            case("103"):
                name = "Ahri";
                break;
            case("84"):
                name = "Akali";
                break;
            case("12"):
                name = "Alistar";
                break;
            case("32"):
                name = "Amumu";
                break;
            case("34"):
                name = "Anivia";
                break;
            case("1"):
                name = "Annie";
                break;
            case("523"):
                name = "Aphelios";
                break;
            case("22"):
                name = "Ashe";
                break;
            case("136"):
                name = "AurelionSol";
                break;
            case("268"):
                name = "Azir";
                break;
            case("432"):
                name = "Bard";
                break;
            case("53"):
                name = "Blitzcrank";
                break;
            case("63"):
                name = "Brand";
                break;
            case("201"):
                name = "Braum";
                break;
            case("51"):
                name = "Caitlyn";
                break;
            case("164"):
                name = "Camille";
                break;
            case("69"):
                name = "Cassiopeia";
                break;
            case("31"):
                name = "Chogath";
                break;
            case("42"):
                name = "Corki";
                break;
            case("122"):
                name = "Darius";
                break;
            case("131"):
                name = "Diana";
                break;
            case("119"):
                name = "Draven";
                break;
            case("36"):
                name = "DrMundo";
                break;
            case("245"):
                name = "Ekko";
                break;
            case("60"):
                name = "Elise";
                break;
            case("28"):
                name = "Evelynn";
                break;
            case("81"):
                name = "Ezreal";
                break;
            case("9"):
                name = "Fiddlesticks";
                break;
            case("114"):
                name = "Fiora";
                break;
            case("105"):
                name = "Fizz";
                break;
            case("3"):
                name = "Galio";
                break;
            case("41"):
                name = "Gangplank";
                break;
            case("86"):
                name = "Garen";
                break;
            case("150"):
                name = "Gnar";
                break;
            case("79"):
                name = "Gragas";
                break;
            case("104"):
                name = "Graves";
                break;
            case("120"):
                name = "Hecarim";
                break;
            case("74"):
                name = "Heimerdinger";
                break;
            case("420"):
                name = "Illaoi";
                break;
            case("39"):
                name = "Irelia";
                break;
            case("427"):
                name = "Ivern";
                break;
            case("40"):
                name = "Janna";
                break;
            case("59"):
                name = "JarvanIV";
                break;
            case("24"):
                name = "Jax";
                break;
            case("126"):
                name = "Jayce";
                break;
            case("202"):
                name = "Jhin";
                break;
            case("222"):
                name = "Jinx";
                break;
            case("145"):
                name = "Kaisa";
                break;
            case("429"):
                name = "Kalista";
                break;
            case("43"):
                name = "Karma";
                break;
            case("30"):
                name = "Karthus";
                break;
            case("38"):
                name = "Kassadin";
                break;
            case("55"):
                name = "Katarina";
                break;
            case("10"):
                name = "Kayle";
                break;
            case("141"):
                name = "Kayn";
                break;
            case("85"):
                name = "Kennen";
                break;
            case("121"):
                name = "Khazix";
                break;
            case("203"):
                name = "Kindred";
                break;
            case("240"):
                name = "Kled";
                break;
            case("96"):
                name = "KogMaw";
                break;
            case("7"):
                name = "Leblanc";
                break;
            case("64"):
                name = "LeeSin";
                break;
            case("89"):
                name = "Leona";
                break;
            case("127"):
                name = "Lissandra";
                break;
            case("236"):
                name = "Lucian";
                break;
            case("117"):
                name = "Lulu";
                break;
            case("99"):
                name = "Lux";
                break;
            case("54"):
                name = "Malphite";
                break;
            case("90"):
                name = "Malzahar";
                break;
            case("57"):
                name = "Maokai";
                break;
            case("11"):
                name = "MasterYi";
                break;
            case("21"):
                name = "MissFortune";
                break;
            case("62"):
                name = "MonkeyKing";
                break;
            case("82"):
                name = "Mordekaiser";
                break;
            case("25"):
                name = "Morgana";
                break;
            case("267"):
                name = "Nami";
                break;
            case("75"):
                name = "Nasus";
                break;
            case("111"):
                name = "Nautilus";
                break;
            case("518"):
                name = "Neeko";
                break;
            case("76"):
                name = "Nidalee";
                break;
            case("56"):
                name = "Nocturne";
                break;
            case("20"):
                name = "Nunu";
                break;
            case("2"):
                name = "Olaf";
                break;
            case("61"):
                name = "Orianna";
                break;
            case("516"):
                name = "Ornn";
                break;
            case("80"):
                name = "Pantheon";
                break;
            case("78"):
                name = "Poppy";
                break;
            case("555"):
                name = "Pyke";
                break;
            case("246"):
                name = "Qiyana";
                break;
            case("133"):
                name = "Quinn";
                break;
            case("497"):
                name = "Rakan";
                break;
            case("33"):
                name = "Rammus";
                break;
            case("421"):
                name = "RekSai";
                break;
            case("58"):
                name = "Renekton";
                break;
            case("107"):
                name = "Rengar";
                break;
            case("92"):
                name = "Riven";
                break;
            case("68"):
                name = "Rumble";
                break;
            case("13"):
                name = "Ryze";
                break;
            case("113"):
                name = "Sejuani";
                break;
            case("235"):
                name = "Senna";
                break;
            case("35"):
                name = "Shaco";
                break;
            case("98"):
                name = "Shen";
                break;
            case("102"):
                name = "Shyvana";
                break;
            case("27"):
                name = "Singed";
                break;
            case("14"):
                name = "Sion";
                break;
            case("15"):
                name = "Sivir";
                break;
            case("72"):
                name = "Skarner";
                break;
            case("37"):
                name = "Sona";
                break;
            case("16"):
                name = "Soraka";
                break;
            case("50"):
                name = "Swain";
                break;
            case("517"):
                name = "Sylas";
                break;
            case("134"):
                name = "Syndra";
                break;
            case("223"):
                name = "TahmKench";
                break;
            case("163"):
                name = "Taliyah";
                break;
            case("91"):
                name = "Talon";
                break;
            case("44"):
                name = "Taric";
                break;
            case("17"):
                name = "Teemo";
                break;
            case("412"):
                name = "Thresh";
                break;
            case("18"):
                name = "Tristana";
                break;
            case("48"):
                name = "Trundle";
                break;
            case("23"):
                name = "Tryndamere";
                break;
            case("4"):
                name = "TwistedFate";
                break;
            case("29"):
                name = "Twitch";
                break;
            case("77"):
                name = "Udyr";
                break;
            case("6"):
                name = "Urgot";
                break;
            case("110"):
                name = "Varus";
                break;
            case("67"):
                name = "Vayne";
                break;
            case("45"):
                name = "Veigar";
                break;
            case("161"):
                name = "Velkoz";
                break;
            case("254"):
                name = "Vi";
                break;
            case("112"):
                name = "Viktor";
                break;
            case("8"):
                name = "Vladimir";
                break;
            case("106"):
                name = "Volibear";
                break;
            case("19"):
                name = "Warwick";
                break;
            case("498"):
                name = "Xayah";
                break;
            case("101"):
                name = "Xerath";
                break;
            case("5"):
                name = "XinZhao";
                break;
            case("157"):
                name = "Yasuo";
                break;
            case("83"):
                name = "Yorick";
                break;
            case("350"):
                name = "Yuumi";
                break;
            case("154"):
                name = "Zac";
                break;
            case("238"):
                name = "Zed";
                break;
            case("115"):
                name = "Ziggs";
                break;
            case("26"):
                name = "Zilean";
                break;
            case("142"):
                name = "Zoe";
                break;
            case("143"):
                name = "Zyra";
                break;
        }

        return name;
    }

    public static String getGameType(Integer queueId) {
        String gamemode = "";

        if (queueId.equals(400)){
            gamemode = "Summoner's Rift: Normals";
        } else if (queueId.equals(420)){
            gamemode = "Summoner's Rift: Ranked";
        } else if (queueId.equals(450)){
            gamemode = "ARAM";
        } else if (queueId.equals(700)){
            gamemode = "Clash";
        } else {
            gamemode = "Featured Game";
        }

        return gamemode;
    }
}
