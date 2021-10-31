package gof.behavioral.cor;

public class DumbCallCenter {

    Operator firstOperator = new HumanOperatorImpl("Вася");
    Operator secondOperator = new HumanOperatorImpl("Маша");
    Operator thirdOperator = new HumanOperatorImpl("Петя");
    Operator fourthOperator = new HumanOperatorImpl("Оля");

    Operator robotOperator = new RobotOperatorImpl();

    public void answerIncomingCall(Call call) {
        if (!firstOperator.isOnCall()) {
            firstOperator.answer(call);
        } else if (!secondOperator.isOnCall()) {
            secondOperator.answer(call);
        } else if (!thirdOperator.isOnCall()) {
            thirdOperator.answer(call);
        } else if (!fourthOperator.isOnCall()) {
            fourthOperator.answer(call);
        }
    }

}
