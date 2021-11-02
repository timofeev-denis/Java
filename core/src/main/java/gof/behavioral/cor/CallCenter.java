package gof.behavioral.cor;

public class CallCenter {

    private Operator firstOperator;

    public CallCenter() {
        Operator firstOperator = new HumanOperatorImpl("Вася");
        Operator secondOperator = new HumanOperatorImpl("Маша");
        Operator thirdOperator = new HumanOperatorImpl("Петя");
        Operator fourthOperator = new HumanOperatorImpl("Оля");
        Operator robotOperator = new RobotOperatorImpl();

        firstOperator.setNextOperator(secondOperator);
        secondOperator.setNextOperator(thirdOperator);
        thirdOperator.setNextOperator(fourthOperator);
        fourthOperator.setNextOperator(robotOperator);
    }

    public void answerIncomingCall(Call call) {
        firstOperator.answer(call);
    }
}
