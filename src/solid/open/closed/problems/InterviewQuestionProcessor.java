package solid.open.closed.problems;

public class InterviewQuestionProcessor {

    public static void process(InterviewQuestions questions) {
        if (questions instanceof AIInterviewQuestion) {
            AIInterviewQuestion question = (AIInterviewQuestion) questions;
            question.executeAIQuestion();
        } else if (questions instanceof AlgorithmsInterviewQuestions) {
            AlgorithmsInterviewQuestions question = (AlgorithmsInterviewQuestions) questions;
            question.executeAlgoQuestion();
        } else if (questions instanceof FinanceInterviewQuestion) {
            FinanceInterviewQuestion question = (FinanceInterviewQuestion) questions;
            question.executeFinanceQuestion();

        }
    }
}
