public class Competiteur {
    private int score;
    private String pays;

    public Competiteur() {
        this.score = 0;
        this.pays = null;
    }

    public void addScore(int score) {
        this.score += score;
    }
    
    public int getScore() {
        return this.score;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPays() {
        return this.pays;
    }
}
