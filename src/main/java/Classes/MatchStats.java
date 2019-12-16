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

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Teams[] getTeams() {
        return teams;
    }

    public void setTeams(Teams[] teams) {
        this.teams = teams;
    }

    public Participants[] getParticipants() {
        return participants;
    }

    public void setParticipants(Participants[] participants) {
        this.participants = participants;
    }

    public ParticipantIdentities[] getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(ParticipantIdentities[] participantIdentities) {
        this.participantIdentities = participantIdentities;
    }


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

        public int getTeamId() {
            return teamId;
        }

        public void setTeamId(int teamId) {
            this.teamId = teamId;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        public boolean isFirstBlood() {
            return firstBlood;
        }

        public void setFirstBlood(boolean firstBlood) {
            this.firstBlood = firstBlood;
        }

        public boolean isFirstTower() {
            return firstTower;
        }

        public void setFirstTower(boolean firstTower) {
            this.firstTower = firstTower;
        }

        public boolean isFirstInhibitor() {
            return firstInhibitor;
        }

        public void setFirstInhibitor(boolean firstInhibitor) {
            this.firstInhibitor = firstInhibitor;
        }

        public boolean isFirstBaron() {
            return firstBaron;
        }

        public void setFirstBaron(boolean firstBaron) {
            this.firstBaron = firstBaron;
        }

        public boolean isFirstDragon() {
            return firstDragon;
        }

        public void setFirstDragon(boolean firstDragon) {
            this.firstDragon = firstDragon;
        }

        public boolean isFirstRiftHerald() {
            return firstRiftHerald;
        }

        public void setFirstRiftHerald(boolean firstRiftHerald) {
            this.firstRiftHerald = firstRiftHerald;
        }

        public int getTowerKills() {
            return towerKills;
        }

        public void setTowerKills(int towerKills) {
            this.towerKills = towerKills;
        }

        public int getInhibitorKills() {
            return inhibitorKills;
        }

        public void setInhibitorKills(int inhibitorKills) {
            this.inhibitorKills = inhibitorKills;
        }

        public int getBaronKills() {
            return baronKills;
        }

        public void setBaronKills(int baronKills) {
            this.baronKills = baronKills;
        }

        public int getDragonKills() {
            return dragonKills;
        }

        public void setDragonKills(int dragonKills) {
            this.dragonKills = dragonKills;
        }

        public int getVilemawKills() {
            return vilemawKills;
        }

        public void setVilemawKills(int vilemawKills) {
            this.vilemawKills = vilemawKills;
        }

        public int getRiftHeraldKills() {
            return riftHeraldKills;
        }

        public void setRiftHeraldKills(int riftHeraldKills) {
            this.riftHeraldKills = riftHeraldKills;
        }

        public int getDominionVictoryScore() {
            return dominionVictoryScore;
        }

        public void setDominionVictoryScore(int dominionVictoryScore) {
            this.dominionVictoryScore = dominionVictoryScore;
        }

        public Bans[] getBans() {
            return bans;
        }

        public void setBans(Bans[] bans) {
            this.bans = bans;
        }

        public class Bans {
            int pickTurn;
            int championId;

            public int getPickTurn() {
                return pickTurn;
            }

            public void setPickTurn(int pickTurn) {
                this.pickTurn = pickTurn;
            }

            public int getChampionId() {
                return championId;
            }

            public void setChampionId(int championId) {
                this.championId = championId;
            }
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

        public int getParticipantId() {
            return participantId;
        }

        public void setParticipantId(int participantId) {
            this.participantId = participantId;
        }

        public int getTeamId() {
            return teamId;
        }

        public void setTeamId(int teamId) {
            this.teamId = teamId;
        }

        public int getChampionId() {
            return championId;
        }

        public void setChampionId(int championId) {
            this.championId = championId;
        }

        public int getSpell1Id() {
            return spell1Id;
        }

        public void setSpell1Id(int spell1Id) {
            this.spell1Id = spell1Id;
        }

        public int getSpell2Id() {
            return spell2Id;
        }

        public void setSpell2Id(int spell2Id) {
            this.spell2Id = spell2Id;
        }

        public Stats getStats() {
            return stats;
        }

        public void setStats(Stats stats) {
            this.stats = stats;
        }

        public Timeline getTimeline() {
            return timeline;
        }

        public void setTimeline(Timeline timeline) {
            this.timeline = timeline;
        }

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

            public int getParticipantId() {
                return participantId;
            }

            public void setParticipantId(int participantId) {
                this.participantId = participantId;
            }

            public boolean isWin() {
                return win;
            }

            public void setWin(boolean win) {
                this.win = win;
            }

            public int getItem0() {
                return item0;
            }

            public void setItem0(int item0) {
                this.item0 = item0;
            }

            public int getItem1() {
                return item1;
            }

            public void setItem1(int item1) {
                this.item1 = item1;
            }

            public int getItem2() {
                return item2;
            }

            public void setItem2(int item2) {
                this.item2 = item2;
            }

            public int getItem3() {
                return item3;
            }

            public void setItem3(int item3) {
                this.item3 = item3;
            }

            public int getItem4() {
                return item4;
            }

            public void setItem4(int item4) {
                this.item4 = item4;
            }

            public int getItem5() {
                return item5;
            }

            public void setItem5(int item5) {
                this.item5 = item5;
            }

            public int getItem6() {
                return item6;
            }

            public void setItem6(int item6) {
                this.item6 = item6;
            }

            public int getKills() {
                return kills;
            }

            public void setKills(int kills) {
                this.kills = kills;
            }

            public int getDeaths() {
                return deaths;
            }

            public void setDeaths(int deaths) {
                this.deaths = deaths;
            }

            public int getAssists() {
                return assists;
            }

            public void setAssists(int assists) {
                this.assists = assists;
            }

            public int getLargestKillingSpree() {
                return largestKillingSpree;
            }

            public void setLargestKillingSpree(int largestKillingSpree) {
                this.largestKillingSpree = largestKillingSpree;
            }

            public int getLargestMultiKill() {
                return largestMultiKill;
            }

            public void setLargestMultiKill(int largestMultiKill) {
                this.largestMultiKill = largestMultiKill;
            }

            public int getKillingSprees() {
                return killingSprees;
            }

            public void setKillingSprees(int killingSprees) {
                this.killingSprees = killingSprees;
            }

            public int getLongestTimeSpentLiving() {
                return longestTimeSpentLiving;
            }

            public void setLongestTimeSpentLiving(int longestTimeSpentLiving) {
                this.longestTimeSpentLiving = longestTimeSpentLiving;
            }

            public int getDoubleKills() {
                return doubleKills;
            }

            public void setDoubleKills(int doubleKills) {
                this.doubleKills = doubleKills;
            }

            public int getTripleKills() {
                return tripleKills;
            }

            public void setTripleKills(int tripleKills) {
                this.tripleKills = tripleKills;
            }

            public int getQuadraKills() {
                return quadraKills;
            }

            public void setQuadraKills(int quadraKills) {
                this.quadraKills = quadraKills;
            }

            public int getPentaKills() {
                return pentaKills;
            }

            public void setPentaKills(int pentaKills) {
                this.pentaKills = pentaKills;
            }

            public int getUnrealKills() {
                return unrealKills;
            }

            public void setUnrealKills(int unrealKills) {
                this.unrealKills = unrealKills;
            }

            public long getTotalDamageDealt() {
                return totalDamageDealt;
            }

            public void setTotalDamageDealt(long totalDamageDealt) {
                this.totalDamageDealt = totalDamageDealt;
            }

            public long getMagicDamageDealt() {
                return magicDamageDealt;
            }

            public void setMagicDamageDealt(long magicDamageDealt) {
                this.magicDamageDealt = magicDamageDealt;
            }

            public long getPhysicalDamageDealt() {
                return physicalDamageDealt;
            }

            public void setPhysicalDamageDealt(long physicalDamageDealt) {
                this.physicalDamageDealt = physicalDamageDealt;
            }

            public long getTrueDamageDealt() {
                return trueDamageDealt;
            }

            public void setTrueDamageDealt(long trueDamageDealt) {
                this.trueDamageDealt = trueDamageDealt;
            }

            public int getLargestCriticalStrike() {
                return largestCriticalStrike;
            }

            public void setLargestCriticalStrike(int largestCriticalStrike) {
                this.largestCriticalStrike = largestCriticalStrike;
            }

            public long getTotalDamageDealtToChampions() {
                return totalDamageDealtToChampions;
            }

            public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
                this.totalDamageDealtToChampions = totalDamageDealtToChampions;
            }

            public long getMagicDamageDealtToChampions() {
                return magicDamageDealtToChampions;
            }

            public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
                this.magicDamageDealtToChampions = magicDamageDealtToChampions;
            }

            public long getPhysicalDamageDealtToChampions() {
                return physicalDamageDealtToChampions;
            }

            public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
                this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
            }

            public long getTrueDamageDealtToChampions() {
                return trueDamageDealtToChampions;
            }

            public void setTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
                this.trueDamageDealtToChampions = trueDamageDealtToChampions;
            }

            public long getTotalHeal() {
                return totalHeal;
            }

            public void setTotalHeal(long totalHeal) {
                this.totalHeal = totalHeal;
            }

            public int getTotalUnitsHealed() {
                return totalUnitsHealed;
            }

            public void setTotalUnitsHealed(int totalUnitsHealed) {
                this.totalUnitsHealed = totalUnitsHealed;
            }

            public long getDamageSelfMitigated() {
                return damageSelfMitigated;
            }

            public void setDamageSelfMitigated(long damageSelfMitigated) {
                this.damageSelfMitigated = damageSelfMitigated;
            }

            public long getDamageDealtToObjectives() {
                return damageDealtToObjectives;
            }

            public void setDamageDealtToObjectives(long damageDealtToObjectives) {
                this.damageDealtToObjectives = damageDealtToObjectives;
            }

            public long getDamageDealtToTurrets() {
                return damageDealtToTurrets;
            }

            public void setDamageDealtToTurrets(long damageDealtToTurrets) {
                this.damageDealtToTurrets = damageDealtToTurrets;
            }

            public long getVisionScore() {
                return visionScore;
            }

            public void setVisionScore(long visionScore) {
                this.visionScore = visionScore;
            }

            public long getTimeCCingOthers() {
                return timeCCingOthers;
            }

            public void setTimeCCingOthers(long timeCCingOthers) {
                this.timeCCingOthers = timeCCingOthers;
            }

            public long getTotalDamageTaken() {
                return totalDamageTaken;
            }

            public void setTotalDamageTaken(long totalDamageTaken) {
                this.totalDamageTaken = totalDamageTaken;
            }

            public long getMagicalDamageTaken() {
                return magicalDamageTaken;
            }

            public void setMagicalDamageTaken(long magicalDamageTaken) {
                this.magicalDamageTaken = magicalDamageTaken;
            }

            public long getPhysicalDamageTaken() {
                return physicalDamageTaken;
            }

            public void setPhysicalDamageTaken(long physicalDamageTaken) {
                this.physicalDamageTaken = physicalDamageTaken;
            }

            public long getTrueDamageTaken() {
                return trueDamageTaken;
            }

            public void setTrueDamageTaken(long trueDamageTaken) {
                this.trueDamageTaken = trueDamageTaken;
            }

            public int getGoldEarned() {
                return goldEarned;
            }

            public void setGoldEarned(int goldEarned) {
                this.goldEarned = goldEarned;
            }

            public int getGoldSpent() {
                return goldSpent;
            }

            public void setGoldSpent(int goldSpent) {
                this.goldSpent = goldSpent;
            }

            public int getTurretKills() {
                return turretKills;
            }

            public void setTurretKills(int turretKills) {
                this.turretKills = turretKills;
            }

            public int getInhibitorKills() {
                return inhibitorKills;
            }

            public void setInhibitorKills(int inhibitorKills) {
                this.inhibitorKills = inhibitorKills;
            }

            public int getTotalMinionsKilled() {
                return totalMinionsKilled;
            }

            public void setTotalMinionsKilled(int totalMinionsKilled) {
                this.totalMinionsKilled = totalMinionsKilled;
            }

            public int getNeutralMinionsKilled() {
                return neutralMinionsKilled;
            }

            public void setNeutralMinionsKilled(int neutralMinionsKilled) {
                this.neutralMinionsKilled = neutralMinionsKilled;
            }

            public int getNeutralMinionsKilledTeamJungle() {
                return neutralMinionsKilledTeamJungle;
            }

            public void setNeutralMinionsKilledTeamJungle(int neutralMinionsKilledTeamJungle) {
                this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
            }

            public int getNeutralMinionsKilledEnemyJungle() {
                return neutralMinionsKilledEnemyJungle;
            }

            public void setNeutralMinionsKilledEnemyJungle(int neutralMinionsKilledEnemyJungle) {
                this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
            }

            public int getTotalTimeCrowdControlDealt() {
                return totalTimeCrowdControlDealt;
            }

            public void setTotalTimeCrowdControlDealt(int totalTimeCrowdControlDealt) {
                this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
            }

            public int getChampLevel() {
                return champLevel;
            }

            public void setChampLevel(int champLevel) {
                this.champLevel = champLevel;
            }

            public int getVisionWardsBoughtInGame() {
                return visionWardsBoughtInGame;
            }

            public void setVisionWardsBoughtInGame(int visionWardsBoughtInGame) {
                this.visionWardsBoughtInGame = visionWardsBoughtInGame;
            }

            public int getSightWardsBoughtInGame() {
                return sightWardsBoughtInGame;
            }

            public void setSightWardsBoughtInGame(int sightWardsBoughtInGame) {
                this.sightWardsBoughtInGame = sightWardsBoughtInGame;
            }

            public int getWardsPlaced() {
                return wardsPlaced;
            }

            public void setWardsPlaced(int wardsPlaced) {
                this.wardsPlaced = wardsPlaced;
            }

            public int getWardsKilled() {
                return wardsKilled;
            }

            public void setWardsKilled(int wardsKilled) {
                this.wardsKilled = wardsKilled;
            }

            public boolean isFirstBloodKill() {
                return firstBloodKill;
            }

            public void setFirstBloodKill(boolean firstBloodKill) {
                this.firstBloodKill = firstBloodKill;
            }

            public boolean isFirstBloodAssist() {
                return firstBloodAssist;
            }

            public void setFirstBloodAssist(boolean firstBloodAssist) {
                this.firstBloodAssist = firstBloodAssist;
            }

            public boolean isFirstTowerKill() {
                return firstTowerKill;
            }

            public void setFirstTowerKill(boolean firstTowerKill) {
                this.firstTowerKill = firstTowerKill;
            }

            public boolean isFirstTowerAssist() {
                return firstTowerAssist;
            }

            public void setFirstTowerAssist(boolean firstTowerAssist) {
                this.firstTowerAssist = firstTowerAssist;
            }

            public int getCombatPlayerScore() {
                return combatPlayerScore;
            }

            public void setCombatPlayerScore(int combatPlayerScore) {
                this.combatPlayerScore = combatPlayerScore;
            }

            public int getObjectivePlayerScore() {
                return objectivePlayerScore;
            }

            public void setObjectivePlayerScore(int objectivePlayerScore) {
                this.objectivePlayerScore = objectivePlayerScore;
            }

            public int getTotalPlayerScore() {
                return totalPlayerScore;
            }

            public void setTotalPlayerScore(int totalPlayerScore) {
                this.totalPlayerScore = totalPlayerScore;
            }

            public int getTotalScoreRank() {
                return totalScoreRank;
            }

            public void setTotalScoreRank(int totalScoreRank) {
                this.totalScoreRank = totalScoreRank;
            }

            public int getPlayerScore0() {
                return playerScore0;
            }

            public void setPlayerScore0(int playerScore0) {
                this.playerScore0 = playerScore0;
            }

            public int getPlayerScore1() {
                return playerScore1;
            }

            public void setPlayerScore1(int playerScore1) {
                this.playerScore1 = playerScore1;
            }

            public int getPlayerScore2() {
                return playerScore2;
            }

            public void setPlayerScore2(int playerScore2) {
                this.playerScore2 = playerScore2;
            }

            public int getPlayerScore3() {
                return playerScore3;
            }

            public void setPlayerScore3(int playerScore3) {
                this.playerScore3 = playerScore3;
            }

            public int getPlayerScore4() {
                return playerScore4;
            }

            public void setPlayerScore4(int playerScore4) {
                this.playerScore4 = playerScore4;
            }

            public int getPlayerScore5() {
                return playerScore5;
            }

            public void setPlayerScore5(int playerScore5) {
                this.playerScore5 = playerScore5;
            }

            public int getPlayerScore6() {
                return playerScore6;
            }

            public void setPlayerScore6(int playerScore6) {
                this.playerScore6 = playerScore6;
            }

            public int getPlayerScore7() {
                return playerScore7;
            }

            public void setPlayerScore7(int playerScore7) {
                this.playerScore7 = playerScore7;
            }

            public int getPlayerScore8() {
                return playerScore8;
            }

            public void setPlayerScore8(int playerScore8) {
                this.playerScore8 = playerScore8;
            }

            public int getPlayerScore9() {
                return playerScore9;
            }

            public void setPlayerScore9(int playerScore9) {
                this.playerScore9 = playerScore9;
            }

            public int getPerk0() {
                return perk0;
            }

            public void setPerk0(int perk0) {
                this.perk0 = perk0;
            }

            public int getPerk0Var1() {
                return perk0Var1;
            }

            public void setPerk0Var1(int perk0Var1) {
                this.perk0Var1 = perk0Var1;
            }

            public int getPerk0Var2() {
                return perk0Var2;
            }

            public void setPerk0Var2(int perk0Var2) {
                this.perk0Var2 = perk0Var2;
            }

            public int getPerk0Var3() {
                return perk0Var3;
            }

            public void setPerk0Var3(int perk0Var3) {
                this.perk0Var3 = perk0Var3;
            }

            public int getPerk1() {
                return perk1;
            }

            public void setPerk1(int perk1) {
                this.perk1 = perk1;
            }

            public int getPerk1Var1() {
                return perk1Var1;
            }

            public void setPerk1Var1(int perk1Var1) {
                this.perk1Var1 = perk1Var1;
            }

            public int getPerk1Var2() {
                return perk1Var2;
            }

            public void setPerk1Var2(int perk1Var2) {
                this.perk1Var2 = perk1Var2;
            }

            public int getPerk1Var3() {
                return perk1Var3;
            }

            public void setPerk1Var3(int perk1Var3) {
                this.perk1Var3 = perk1Var3;
            }

            public int getPerk2() {
                return perk2;
            }

            public void setPerk2(int perk2) {
                this.perk2 = perk2;
            }

            public int getPerk2Var1() {
                return perk2Var1;
            }

            public void setPerk2Var1(int perk2Var1) {
                this.perk2Var1 = perk2Var1;
            }

            public int getPerk2Var2() {
                return perk2Var2;
            }

            public void setPerk2Var2(int perk2Var2) {
                this.perk2Var2 = perk2Var2;
            }

            public int getPerk2Var3() {
                return perk2Var3;
            }

            public void setPerk2Var3(int perk2Var3) {
                this.perk2Var3 = perk2Var3;
            }

            public int getPerk3() {
                return perk3;
            }

            public void setPerk3(int perk3) {
                this.perk3 = perk3;
            }

            public int getPerk3Var1() {
                return perk3Var1;
            }

            public void setPerk3Var1(int perk3Var1) {
                this.perk3Var1 = perk3Var1;
            }

            public int getPerk3Var2() {
                return perk3Var2;
            }

            public void setPerk3Var2(int perk3Var2) {
                this.perk3Var2 = perk3Var2;
            }

            public int getPerk3Var3() {
                return perk3Var3;
            }

            public void setPerk3Var3(int perk3Var3) {
                this.perk3Var3 = perk3Var3;
            }

            public int getPerk4() {
                return perk4;
            }

            public void setPerk4(int perk4) {
                this.perk4 = perk4;
            }

            public int getPerk4Var1() {
                return perk4Var1;
            }

            public void setPerk4Var1(int perk4Var1) {
                this.perk4Var1 = perk4Var1;
            }

            public int getPerk4Var2() {
                return perk4Var2;
            }

            public void setPerk4Var2(int perk4Var2) {
                this.perk4Var2 = perk4Var2;
            }

            public int getPerk4Var3() {
                return perk4Var3;
            }

            public void setPerk4Var3(int perk4Var3) {
                this.perk4Var3 = perk4Var3;
            }

            public int getPerk5() {
                return perk5;
            }

            public void setPerk5(int perk5) {
                this.perk5 = perk5;
            }

            public int getPerk5Var1() {
                return perk5Var1;
            }

            public void setPerk5Var1(int perk5Var1) {
                this.perk5Var1 = perk5Var1;
            }

            public int getPerk5Var2() {
                return perk5Var2;
            }

            public void setPerk5Var2(int perk5Var2) {
                this.perk5Var2 = perk5Var2;
            }

            public int getPerk5Var3() {
                return perk5Var3;
            }

            public void setPerk5Var3(int perk5Var3) {
                this.perk5Var3 = perk5Var3;
            }

            public int getPerkPrimaryStyle() {
                return perkPrimaryStyle;
            }

            public void setPerkPrimaryStyle(int perkPrimaryStyle) {
                this.perkPrimaryStyle = perkPrimaryStyle;
            }

            public int getPerkSubStyle() {
                return perkSubStyle;
            }

            public void setPerkSubStyle(int perkSubStyle) {
                this.perkSubStyle = perkSubStyle;
            }
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

            public int getParticipantId() {
                return participantId;
            }

            public void setParticipantId(int participantId) {
                this.participantId = participantId;
            }

            public Map<String, Double> getCreepsPerMinDeltas() {
                return creepsPerMinDeltas;
            }

            public void setCreepsPerMinDeltas(Map<String, Double> creepsPerMinDeltas) {
                this.creepsPerMinDeltas = creepsPerMinDeltas;
            }

            public Map<String, Double> getXpPerMinDeltas() {
                return xpPerMinDeltas;
            }

            public void setXpPerMinDeltas(Map<String, Double> xpPerMinDeltas) {
                this.xpPerMinDeltas = xpPerMinDeltas;
            }

            public Map<String, Double> getGoldPerMinDeltas() {
                return goldPerMinDeltas;
            }

            public void setGoldPerMinDeltas(Map<String, Double> goldPerMinDeltas) {
                this.goldPerMinDeltas = goldPerMinDeltas;
            }

            public Map<String, Double> getCsDiffPerMinDeltas() {
                return csDiffPerMinDeltas;
            }

            public void setCsDiffPerMinDeltas(Map<String, Double> csDiffPerMinDeltas) {
                this.csDiffPerMinDeltas = csDiffPerMinDeltas;
            }

            public Map<String, Double> getXpDiffPerMinDeltas() {
                return xpDiffPerMinDeltas;
            }

            public void setXpDiffPerMinDeltas(Map<String, Double> xpDiffPerMinDeltas) {
                this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
            }

            public Map<String, Double> getDamageTakenPerMinDeltas() {
                return damageTakenPerMinDeltas;
            }

            public void setDamageTakenPerMinDeltas(Map<String, Double> damageTakenPerMinDeltas) {
                this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
            }

            public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
                return damageTakenDiffPerMinDeltas;
            }

            public void setDamageTakenDiffPerMinDeltas(Map<String, Double> damageTakenDiffPerMinDeltas) {
                this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getLane() {
                return lane;
            }

            public void setLane(String lane) {
                this.lane = lane;
            }
        }
    }

    public class ParticipantIdentities{
        int participantId;
        Player player;

        public int getParticipantId() {
            return participantId;
        }

        public void setParticipantId(int participantId) {
            this.participantId = participantId;
        }

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public class Player{
            String platformId;
            String accountId;
            String summonerName;
            String summonerId;
            String currentPlatformId;
            String currentAccountId;
            String matchHistoryUri;
            int profileIcon;

            public String getPlatformId() {
                return platformId;
            }

            public void setPlatformId(String platformId) {
                this.platformId = platformId;
            }

            public String getAccountId() {
                return accountId;
            }

            public void setAccountId(String accountId) {
                this.accountId = accountId;
            }

            public String getSummonerName() {
                return summonerName;
            }

            public void setSummonerName(String summonerName) {
                this.summonerName = summonerName;
            }

            public String getSummonerId() {
                return summonerId;
            }

            public void setSummonerId(String summonerId) {
                this.summonerId = summonerId;
            }

            public String getCurrentPlatformId() {
                return currentPlatformId;
            }

            public void setCurrentPlatformId(String currentPlatformId) {
                this.currentPlatformId = currentPlatformId;
            }

            public String getCurrentAccountId() {
                return currentAccountId;
            }

            public void setCurrentAccountId(String currentAccountId) {
                this.currentAccountId = currentAccountId;
            }

            public String getMatchHistoryUri() {
                return matchHistoryUri;
            }

            public void setMatchHistoryUri(String matchHistoryUri) {
                this.matchHistoryUri = matchHistoryUri;
            }

            public int getProfileIcon() {
                return profileIcon;
            }

            public void setProfileIcon(int profileIcon) {
                this.profileIcon = profileIcon;
            }
        }
    }
}
