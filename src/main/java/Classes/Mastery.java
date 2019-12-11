package Classes;

public class Mastery {
    public long championId;
    public int championLevel;
    public int championPoints;
    public long lastPlayTime;
    public long championPointsSinceLastLevel;
    public long championPointsUntilNextLevel;
    public boolean chestGranted;
    public int tokensEarned;
    public String summonerId;




    public Mastery() {
        // Empty constructor
    }

    public Mastery(int championLevel, int championPoints, long championId) {
        this.championLevel = championLevel;
        this.championPoints = championPoints;
        this.championId = championId;
    }

    public int getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(int championLevel) {
        this.championLevel = championLevel;
    }

    public int getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(int championPoints) {
        this.championPoints = championPoints;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    @Override
    public String toString() {
        return "Mastery{" +
                "championLevel=" + championLevel +
                ", championPoints=" + championPoints +
                ", championId=" + championId +
                '}';
    }
}
