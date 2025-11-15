package lab03;

import java.util.ArrayList;

public class Grade {
	private int ID;
    private String name; 
    private ArrayList<Subject> subjects;
    
    public Grade(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    
    public void addSubject(Subject Subject) {
    	subjects.add(Subject);
    }
    
    public float getTotscore() {
    	float total = 0;
    	for(Subject s :subjects) {
    		total += s.getScore();
    	}
    	return total;
    }
    
    public float getAverageScore() {
        return subjects.size() > 0 ? getTotscore() / subjects.size() : 0;
    }
    
    public String getGrade() {
        float avg = getAverageScore();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(ID).append(", Name: ").append(name).append("\nSubjects:\n");
        for (Subject s : subjects) {
            sb.append("  - ").append(s).append("\n");
        }
        sb.append("Total Marks: ").append(getTotscore()).append("\n");
        sb.append("Average: ").append(getAverageScore()).append("\n");
        sb.append("Grade: ").append(getGrade());
        return sb.toString();
    }

}




