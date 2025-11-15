package lab03;

public class Subject {
	
    private String name;
    private float score;

    public Subject(String name, float score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + ": " + score;
    }

	public float getScore() {
		return score;
	}
}
