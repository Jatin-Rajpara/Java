package session5;

public class solutation2 {

    public static void main(String[] args) {

        int[][] matchScores = {
                {180, 195, 210},
                {165, 170, 185},
                {200, 215, 198},
                {175, 188, 192},
                {160, 178, 205}
        };

        System.out.println("IPL Match Scores\n");

        for (int team = 0; team < matchScores.length; team++) {

            System.out.print("Team " + (team + 1) + " : ");

            for (int match = 0; match < matchScores[team].length; match++) {
                System.out.print(matchScores[team][match] + "\t");
            }

            System.out.println();
        }
    }
}