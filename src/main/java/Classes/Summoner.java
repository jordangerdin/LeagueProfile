package Classes;

public class Summoner {
    // Class for player (summoner) name and associated data

    public String name;
    public String id;
    public String accountId;
    public String summonerLevel;

    public Summoner() {
        // Empty constructor
    }

    public Summoner(String name, String id, String accountId, String summonerLevel) {
        this.name = name;
        this.id = id;
        this.accountId = accountId;
        this.summonerLevel = summonerLevel;
    }


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