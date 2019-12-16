package Classes;

public class Summoner {
    // Class for player (summoner) name and associated data

    public String name;
    public String id;
    public String accountId;
    public String summonerLevel;
    public String region;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(String summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Classes.Summoner{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", summonerLevel='" + summonerLevel + '\'' +
                '}';
    }


}