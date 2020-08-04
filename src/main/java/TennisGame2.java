public class TennisGame2 {

    private int player1point;
    private int player2point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String score = "";
        if (player1point == player2point && player1point < 4)
        {
            if (player1point ==0)
                score = "Love";
            if (player1point ==1)
                score = "Fifteen";
            if (player1point ==2)
                score = "Thirty";
            score += "-All";
        }
        if (player1point == player2point && player1point >=3)
            score = "Deuce";

        if (player1point > 0 && player2point ==0)
        {
            if (player1point ==1)
                player1Result = "Fifteen";
            if (player1point ==2)
                player1Result = "Thirty";
            if (player1point ==3)
                player1Result = "Forty";

            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2point > 0 && player1point ==0)
        {
            if (player2point ==1)
                player2Result = "Fifteen";
            if (player2point ==2)
                player2Result = "Thirty";
            if (player2point ==3)
                player2Result = "Forty";

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1point > player2point && player1point < 4)
        {
            if (player1point ==2)
                player1Result="Thirty";
            if (player1point ==3)
                player1Result="Forty";
            if (player2point ==1)
                player2Result="Fifteen";
            if (player2point ==2)
                player2Result="Thirty";
            score = player1Result + "-" + player2Result;
        }
        if (player2point > player1point && player2point < 4)
        {
            if (player2point ==2)
                player2Result="Thirty";
            if (player2point ==3)
                player2Result="Forty";
            if (player1point ==1)
                player1Result="Fifteen";
            if (player1point ==2)
                player1Result="Thirty";
            score = player1Result + "-" + player2Result;
        }

        if (player1point > player2point && player2point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2point > player1point && player1point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1point >=4 && player2point >=0 && (player1point - player2point)>=2)
        {
            score = "Win for player1";
        }
        if (player2point >=4 && player1point >=0 && (player2point - player1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void p1Score(){
        player1point++;
    }

    public void p2Score(){
        player2point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player)) {  // Null Safety
            p1Score();
        } else {
            p2Score();
        }
    }
}
