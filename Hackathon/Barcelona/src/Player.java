public class Player {
    private String fullName;
    public enum Position{GK(0), DF(1), MF(2), FW(3);
        public int value;
    Position(int value){
        this.value = value;
    }
    };
    private int num;
    private Player.Position position;
    
    public Player(){
    }

    public Player(int num, String fullName, Player.Position position) {
        this.fullName = fullName;
        this.num = num;
        this.position = position;
    }
    public String toString() {
        return num + ". "+ fullName + " - " + position;
    }
    public String getFullName() {
        return fullName;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Player.Position getPosition() {
        return position;
    }
    public void setPosition(Player.Position position) {
        this.position = position;
    }

}

