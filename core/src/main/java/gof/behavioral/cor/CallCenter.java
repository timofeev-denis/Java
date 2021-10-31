package gof.behavioral.cor;

public class CallCenter {

    private Operator firstOperator;

    public CallCenter() {
        firstOperator = new HumanOperatorImpl(
                "Вася", new HumanOperatorImpl(
                "Маша", new HumanOperatorImpl(
                "Петя", new RobotOperatorImpl())));
    }

    public void answerIncomingCall(Call call) {
        firstOperator.answer(call);
    }
}
