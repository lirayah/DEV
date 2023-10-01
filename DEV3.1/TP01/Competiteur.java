public class Competiteur {
    private int score;
    private String pays;

    public Competiteur() {
        this.score = 0;
        this.pays = null;
    }

    public void addScore(int sscore) {
        this.score += sscore;
    }
    
    public int getScore() {
        return this.score;
    }

    public void setPays(String ppays) {
        this.pays = ppays;
    }

    public String getPays() {
        return this.pays;
    }
}
