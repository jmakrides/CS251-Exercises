public class Team {

    private String name;
    private Integer score;

    protected Team(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    protected Team() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
