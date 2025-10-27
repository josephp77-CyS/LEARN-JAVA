import java.util.Scanner;

public class Latihan_UTP_Labirin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int labirin[][] = new int[n][n];
        int pemain[] = { 0, 0 };
        boolean sampe = false;
        int aa = in.nextInt(), ab = in.nextInt();
        labirin[aa][ab] = 5;
        pemain[0] = aa;
        pemain[1] = ab;
        int ba = in.nextInt(), bb = in.nextInt();
        labirin[ba][bb] = 2;
        in.nextLine();
        String tembok = in.nextLine();
        for (int i = 0; i < tembok.length(); i++) {
            int a = tembok.charAt(i) - '0';
            // System.out.println(tembok.charAt(i));
            // System.out.println(a);
            i += 2;
            int b = tembok.charAt(i) - '0';
            // System.out.println(tembok.charAt(i));
            // System.out.println(b);
            i++;
            labirin[a][b] = 1;
        }
        System.out.println("Labirin Awal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (labirin[i][j] == 0) {
                    System.out.printf(".");
                } else if (labirin[i][j] == 5) {
                    System.out.printf("S");
                    labirin[i][j] = 3;
                } else if (labirin[i][j] == 1) {
                    System.out.printf("T");
                } else if (labirin[i][j] == 2) {
                    System.out.printf("F");
                }
            }
            System.out.println();
        }
        int r = in.nextInt();
        for (int i = 0; i < r; i++) {
            String a = in.next();
            switch (a) {
                case "W":
                    if (pemain[0] - 1 >= 0) {
                        if (labirin[pemain[0] - 1][pemain[1]] == 2) {
                            sampe = true;
                        }
                        if (labirin[pemain[0] - 1][pemain[1]] == 1) {
                            System.out.println("Invalid Move!");
                        } else {
                            labirin[pemain[0]][pemain[1]] = 0;
                            pemain[0]--;
                            labirin[pemain[0]][pemain[1]] = 3;
                        }
                    } else {
                        System.out.println("Invalid Move!");
                    }
                    break;
                case "S":
                    if (pemain[0] + 1 < n) {
                        if (labirin[pemain[0] + 1][pemain[1]] == 2) {
                            sampe = true;
                        }
                        if (labirin[pemain[0] + 1][pemain[1]] == 1) {
                            System.out.println("Invalid Move!");
                        } else {
                            labirin[pemain[0]][pemain[1]] = 0;
                            pemain[0]++;
                            labirin[pemain[0]][pemain[1]] = 3;
                        }
                    } else {
                        System.out.println("Invalid Move!");
                    }
                    break;
                case "D":
                    if (pemain[1] + 1 < n) {
                        if (labirin[pemain[0]][pemain[1] + 1] == 2) {
                            sampe = true;
                        }
                        if (labirin[pemain[0]][pemain[1] + 1] == 1) {
                            System.out.println("Invalid Move!");
                        } else {
                            labirin[pemain[0]][pemain[1]] = 0;
                            pemain[1]++;
                            labirin[pemain[0]][pemain[1]] = 3;
                        }
                    } else {
                        System.out.println("Invalid Move!");
                    }
                    break;
                case "A":
                    if (pemain[1] - 1 >= 0) {
                        if (labirin[pemain[0]][pemain[1] - 1] == 2) {
                            sampe = true;
                        }
                        if (labirin[pemain[0]][pemain[1] - 1] == 1) {
                            System.out.println("Invalid Move!");
                        } else {
                            labirin[pemain[0]][pemain[1]] = 0;
                            pemain[1]--;
                            labirin[pemain[0]][pemain[1]] = 3;
                        }
                    } else {
                        System.out.println("Invalid Move!");
                    }
                    break;
            }
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    if (labirin[k][j] == 0) {
                        System.out.printf(".");
                    } else if (labirin[k][j] == 3) {
                        System.out.printf("P");
                    } else if (labirin[k][j] == 1) {
                        System.out.printf("T");
                    } else if (labirin[k][j] == 2) {
                        System.out.printf("F");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (sampe) {
                break;
            }
        }
        if (sampe) {
            System.out.println("Selamat Kamu Berhasil Keluar!!");
        } else {
            System.out.println("Kamu terjebak dalam labirin!");
        }
    }
}
