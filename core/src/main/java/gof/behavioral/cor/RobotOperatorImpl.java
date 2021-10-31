package gof.behavioral.cor;

public class RobotOperatorImpl implements Operator {
    @Override
    public void answer(Call call) {
        System.out.println("Нет свободных операторов, перезвоните позже.");
    }
}
