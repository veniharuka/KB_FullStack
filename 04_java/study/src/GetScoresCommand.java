package command;

import V0.Input;

public class GetScoresCommand implements Command{
    StudentScoresstudentScores= StudentScores.getInstance();
    @Override
    public void execute() {
        int[] scores = studentScores.getScores();
        for(int i= 0; i< scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}
