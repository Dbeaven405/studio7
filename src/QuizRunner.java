public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQ = new MultipleChoiceQuestion("What sound does a cat make? \nA: Bark\nB: Meow\nPlease choose a single answer", "B");
        myQuiz.addQuestion(myMultipleChoiceQ);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply, which animals fly?\nA: Birds\nB: Owls\nC: Cows", "A,B");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalse myTrueOrFalse = new TrueOrFalse("Dogs are bad? \n True or False?", "False");
        myQuiz.addQuestion(myTrueOrFalse);

        myQuiz.runQuiz();
    }


}
