package Classes;

public class League {
    // Class for player rank

    String rank;
    String tier;

    public League(String rank, String tier) {
        this.rank = rank;
        this.tier = tier;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Classes.League{" +
                "rank='" + rank + '\'' +
                ", tier=" + tier +
                '}';
    }
}
