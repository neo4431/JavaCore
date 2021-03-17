import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Player[] arrTeam = new Player[22];
        arrTeam[0] = new Player(1, "Marc-André ter Stegen", Player.Position.GK);
        arrTeam[1] = new Player(2, "Sergiño Dest", Player.Position.DF);
        arrTeam[2] = new Player(3, "Gerard Piqué", Player.Position.DF);
        arrTeam[3] = new Player(4, "Ronald Araújo", Player.Position.DF);
        arrTeam[4] = new Player(5, "Sergio Busquets", Player.Position.MF);
        arrTeam[5] = new Player(6, "Antoine Griezmann", Player.Position.FW);
        arrTeam[6] = new Player(7, "Miralem Pjanić", Player.Position.MF);
        arrTeam[7] = new Player(8, "Martin Braithwaite", Player.Position.FW);
        arrTeam[8] = new Player(9, "Lionel Messi", Player.Position.FW);
        arrTeam[9] = new Player(10, "Ousmane Dembélé", Player.Position.FW);
        arrTeam[10] = new Player(11, "Riqui Puig", Player.Position.MF);
        arrTeam[11] = new Player(12, "Neto", Player.Position.GK);
        arrTeam[12] = new Player(13, "Clément Lenglet", Player.Position.DF);
        arrTeam[13] = new Player(14, "Pedri", Player.Position.MF);
        arrTeam[14] = new Player(15, "Francisco Trincão", Player.Position.FW);
        arrTeam[15] = new Player(16, "Jordi Alba", Player.Position.DF);
        arrTeam[16] = new Player(17, "Matheus Fernandes", Player.Position.MF);
        arrTeam[17] = new Player(18, "Sergi Roberto", Player.Position.DF);
        arrTeam[18] = new Player(19, "Frenkie de Jong", Player.Position.MF);
        arrTeam[19] = new Player(20, "Ansu Fati", Player.Position.FW);
        arrTeam[20] = new Player(21, "Samuel Umtiti", Player.Position.DF);
        arrTeam[21] = new Player(22, "Junior Firpo", Player.Position.DF);
        Team arr = new Team(arrTeam);
        Scanner sc = new Scanner(System.in);
        boolean isNonStop = true;
        
        while (isNonStop) {
            arr.buildTeam();
            System.out.println("Do you want to see another option? Type Y or N");
            try {
                String answer = sc.nextLine();
                if (answer.equals("Y")) {
                    isNonStop = true;
                } else if (answer.equals("N")) {
                    isNonStop = false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Nhập sai rồi!!!");
                isNonStop = false;
            }
        }
        // GK: 2,DF : 8, MF, 6 , FW, 6
        // Tạo đội hình theo chiến thuật tùy chỉnh
        System.out.println("Tùy chỉnh đội hình: ");
        isNonStop = true;
        System.out.print("Nhập số lượng hậu vệ: ");
        int defender = sc.nextInt();
        System.out.print("Nhập số lượng trung vệ: ");
        int midfielder = sc.nextInt();
        System.out.print("Nhập số lượng tiền đạo: ");
        int forwarder = sc.nextInt();
        sc.nextLine();
        if (defender + midfielder + forwarder == 10 && defender < 8 && midfielder < 6 && forwarder < 6) {
            while (isNonStop) {
                arr.buildTeam(defender, midfielder, forwarder);
                System.out.println("Do you want to see another option? Type Y or N");
                try {
                    String answer = sc.nextLine();
                    if (answer.equals("Y")) {
                        isNonStop = true;
                    } else if (answer.equals("N")) {
                        isNonStop = false;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Nhập sai rồi!!!");
                    isNonStop = false;
                }
            }
        } else {
            System.out.println(
                    "Số lượng cầu thủ ra sân không đúng hoặc số lượng cầu thủ hoạt động tại vị trí cần thiết không đủ!!!");
        }
        sc.close();
        // Scanner sc = new Scanner(System.in);
        // System.out.printf("Số lượng cầu thủ muốn nhập: ");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // Player player = new Player();
        // System.out.printf("Nhap so: ");
        // int num = sc.nextInt();
        // sc.nextLine();
        // System.out.printf("Nhap ten: ");
        // String fullName = sc.nextLine();
        // System.out.printf("Nhap vi tri: ");
        // try {
        // String position = sc.nextLine();
        // if (position.equals("GK")) {
        // player.setPosition(Player.Position.GK);
        // } else if (position.equals("DF")) {
        // player.setPosition(Player.Position.DF);
        // } else if (position.equals("MF")) {
        // player.setPosition(Player.Position.MF);
        // } else if (position.equals("FW")) {
        // player.setPosition(Player.Position.FW);
        // } else {
        // throw new Exception();
        // }
        // player.setFullName(fullName);
        // player.setNum(num);
        // listPlayers.add(player);
        // } catch (Exception e) {
        // System.out.println("Không có vị trí này");
        // }
    }
}
