public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int m_score1, int m_score2) {
        String score = "";
        int tempScore=m_score1;
        if (m_score1 == m_score2) {
            return obtenerPuntuacionSiEmpate(m_score1);
        }
        else if (isAdvantage(m_score1, m_score2)) {
            int pointDifferences = m_score1-m_score2;
            if (pointDifferences==1)  return "Advantage player1";
            else if (pointDifferences ==-1)  return "Advantage player2";
            else if (pointDifferences>=2) return "Win for player1";
            else return "Win for player2";
        }
        else {
            for (int i=1; i<3; i++) {
                if (i>1) {
                    score+="-"; tempScore = m_score2;
                }
                switch(tempScore) {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }

        }
    return score;
    }

    private static String obtenerPuntuacionSiEmpate(int m_score1) {
        switch (m_score1)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static boolean isAdvantage(int m_score1, int m_score2) {
        return m_score1 >= 4 || m_score2 >= 4;
    }
}