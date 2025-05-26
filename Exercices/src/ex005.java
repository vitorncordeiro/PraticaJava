public class ex005 {
    public static void main(String[] args) {
        String vitor = "Vitor";
        int score = 130;
        int posicao = calculateHighScorePosition(score);
        System.out.println(displayHighScorePosition(vitor, posicao));
    }
    public static String displayHighScorePosition(String playersName, int playersPosition) {
        String formatada = playersName + " managed to get into position " + playersPosition + " on the high score.";
        return formatada;
    }
    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        }else if(playersScore >= 500) {
            return 2;
        }else if(playersScore >= 100) {
            return 3;
        }else{
            return 4;
        }
    }
}
