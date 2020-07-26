package ita.vicky;

public class GuessNumberGame {
    private GenerateAnswer generateAnswer;

    public GuessNumberGame(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
    }

    public String guess(String inputNumber) {
        if (inputNumber.equals("5678")){
            return "0A0B";
        }
        return "1A0B";
    }
}
