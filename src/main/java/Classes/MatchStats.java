package Classes;

import java.util.List;
import java.util.Map;

public class MatchStats {
    int gameId;
    String platformId;
    long gameCreation;
    long gameDuration;
    int queueId;
    int mapId;
    int seasonId;
    String gameVersion;
    String gameMode;
    String gameType;
    Teams[] teams;
    Participants[] participants;
    ParticipantIdentities[] participantIdentities;


    public class Teams {
        int teamId;
        String win;
        boolean firstBlood;
        boolean firstTower;
        boolean firstInhibitor;
        boolean firstBaron;
        boolean firstDragon;
        boolean firstRiftHerald;
        int towerKills;
        int inhibitorKills;
        int baronKills;
        int dragonKills;
        int vilemawKills;
        int riftHeraldKills;
        int dominionVictoryScore;
        Bans[] bans;

        public class Bans {
            int pickTurn;
            int championId;

        }
    }

    public class Participants {
        int participantId;
        int teamId;
        int championId;
        int spell1Id;
        int spell2Id;
        Stats stats;
        Timeline timeline;

        public class Stats{
            int participantId;
            boolean win;
            int item0;
            int item1;
            int item2;
            int item3;
            int item4;
            int item5;
            int item6;
            int kills;
            int deaths;
            int assists;
            int largestKillingSpree;
            int largestMultiKill;
            int killingSprees;
            int longestTimeSpentLiving;
            int doubleKills;
            int tripleKills;
            int quadraKills;
            int pentaKills;
            int unrealKills;
            long totalDamageDealt;
            long magicDamageDealt;
            long physicalDamageDealt;
            long trueDamageDealt;
            int largestCriticalStrike;
            long totalDamageDealtToChampions;
            long magicDamageDealtToChampions;
            long physicalDamageDealtToChampions;
            long trueDamageDealtToChampions;
            long totalHeal;
            int totalUnitsHealed;
            long damageSelfMitigated;
            long damageDealtToObjectives;
            long damageDealtToTurrets;
            long visionScore;
            long timeCCingOthers;
            long totalDamageTaken;
            long magicalDamageTaken;
            long physicalDamageTaken;
            long trueDamageTaken;
            int goldEarned;
            int goldSpent;
            int turretKills;
            int inhibitorKills;
            int totalMinionsKilled;
            int neutralMinionsKilled;
            int neutralMinionsKilledTeamJungle;
            int neutralMinionsKilledEnemyJungle;
            int totalTimeCrowdControlDealt;
            int champLevel;
            int visionWardsBoughtInGame;
            int sightWardsBoughtInGame;
            int wardsPlaced;
            int wardsKilled;
            boolean firstBloodKill;
            boolean firstBloodAssist;
            boolean firstTowerKill;
            boolean firstTowerAssist;
            int combatPlayerScore;
            int objectivePlayerScore;
            int totalPlayerScore;
            int totalScoreRank;
            int playerScore0;
            int playerScore1;
            int playerScore2;
            int playerScore3;
            int playerScore4;
            int playerScore5;
            int playerScore6;
            int playerScore7;
            int playerScore8;
            int playerScore9;
            int perk0;
            int perk0Var1;
            int perk0Var2;
            int perk0Var3;
            int perk1;
            int perk1Var1;
            int perk1Var2;
            int perk1Var3;
            int perk2;
            int perk2Var1;
            int perk2Var2;
            int perk2Var3;
            int perk3;
            int perk3Var1;
            int perk3Var2;
            int perk3Var3;
            int perk4;
            int perk4Var1;
            int perk4Var2;
            int perk4Var3;
            int perk5;
            int perk5Var1;
            int perk5Var2;
            int perk5Var3;
            int perkPrimaryStyle;
            int perkSubStyle;
        }

        public class Timeline{
            int participantId;
            Map<String, Double> creepsPerMinDeltas;
            Map<String, Double> xpPerMinDeltas;
            Map<String, Double> goldPerMinDeltas;
            Map<String, Double> csDiffPerMinDeltas;
            Map<String, Double> xpDiffPerMinDeltas;
            Map<String, Double> damageTakenPerMinDeltas;
            Map<String, Double> damageTakenDiffPerMinDeltas;
            String role;
            String lane;

        }
    }

    public class ParticipantIdentities{
        int participantId;
        Player player;

        public class Player{
            String platformId;
            String accountId;
            String summonerName;
            String summonerId;
            String currentPlatformId;
            String currentAccountId;
            String matchHistoryUri;
            int profileIcon;
        }
    }
}
