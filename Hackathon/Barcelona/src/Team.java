import java.util.ArrayList;
import java.util.List;

public class Team extends Player{
    public Player[] arrTeam;

    public Team(Player[] arrTeam) {
        this.arrTeam = arrTeam;
    }

    public Team() {
    }

    public List<Player> buildTeam() {
        ArrayList<Player> setTeam = new ArrayList<Player>();
        int countGK = 0;
        int countDF = 0;
        int countMF = 0;
        int countFW = 0;
        Player player = new Player();
        while (setTeam.size() <= 10) {
            player = arrTeam[(int) Math.floor(Math.random() * 22)];
            if (setTeam.size() == 0) {
                if (player.getPosition().equals(Player.Position.GK)) {
                    countGK++;
                } else if (player.getPosition().equals(Player.Position.DF)) {
                    countDF++;
                } else if (player.getPosition().equals(Player.Position.MF)) {
                    countMF++;
                } else if (player.getPosition().equals(Player.Position.FW)) {
                    countFW++;
                }
                setTeam.add(player);
            } else {
                for (int i = 0; i < setTeam.size(); i++) {
                    if (setTeam.contains(player)) {
                        break;
                    } else if (player.getPosition().equals(Player.Position.GK) && countGK == 0) {
                        setTeam.add(player);
                        countGK++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.DF) && countDF < 4) {
                        setTeam.add(player);
                        countDF++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.MF) && countMF < 4) {
                        setTeam.add(player);
                        countMF++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.FW) && countFW < 2) {
                        setTeam.add(player);
                        countFW++;
                        break;
                    }
                }
            }
        }
        Player playerStorage = new Player();
        for (int i = 0; i < setTeam.size() - 1; i++) {
            for (int j = i + 1; j < setTeam.size(); j++) {
                if (setTeam.get(i).getPosition().value > setTeam.get(j).getPosition().value) {
                    playerStorage = setTeam.get(i);
                    setTeam.set(i, setTeam.get(j));
                    setTeam.set(j, playerStorage);
                }
            }
        }
        for (int i = 0; i < setTeam.size(); i++) {
            System.out.println(setTeam.get(i));
            if (i == 0 || i == 4 || i == 8) {
                System.out.println("");
            }
        }
        return setTeam;
    }

    public List<Player> buildTeam(int defender, int midfielder, int forwarder) {
        ArrayList<Player> setTeam = new ArrayList<Player>();
        int countGK = 0;
        int countDF = 0;
        int countMF = 0;
        int countFW = 0;
        Player player = new Player();
        while (setTeam.size() <= 10) {
            player = arrTeam[(int) Math.floor(Math.random() * 22)];
            if (setTeam.size() == 0) {
                if (player.getPosition().equals(Player.Position.GK)) {
                    countGK++;
                } else if (player.getPosition().equals(Player.Position.DF)) {
                    countDF++;
                } else if (player.getPosition().equals(Player.Position.MF)) {
                    countMF++;
                } else if (player.getPosition().equals(Player.Position.FW)) {
                    countFW++;
                }
                setTeam.add(player);
            } else {
                for (int i = 0; i < setTeam.size(); i++) {
                    if (setTeam.contains(player)) {
                        break;
                    } else if (player.getPosition().equals(Player.Position.GK) && countGK == 0) {
                        setTeam.add(player);
                        countGK++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.DF) && countDF < defender) {
                        setTeam.add(player);
                        countDF++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.MF) && countMF < midfielder) {
                        setTeam.add(player);
                        countMF++;
                        break;
                    } else if (player.getPosition().equals(Player.Position.FW) && countFW < forwarder) {
                        setTeam.add(player);
                        countFW++;
                        break;
                    }
                }
            }
        }
        Player playerStorage = new Player();
        for (int i = 0; i < setTeam.size() - 1; i++) {
            for (int j = i + 1; j < setTeam.size(); j++) {
                if (setTeam.get(i).getPosition().value > setTeam.get(j).getPosition().value) {
                    playerStorage = setTeam.get(i);
                    setTeam.set(i, setTeam.get(j));
                    setTeam.set(j, playerStorage);
                }
            }
        }
        for (int i = 0; i < setTeam.size(); i++) {
            System.out.println(setTeam.get(i));
            if (i == 0 || i == defender || i == defender + midfielder) {
                System.out.println("");
            }
        }
        return setTeam;
    }
}
