package gof.behavioral.cor;

public class HumanOperatorImpl implements Operator {

    private String name;
    private Operator next; // Следующий оператор в цепочке
    private boolean onCall; // Сейчас оператор говорит по телефону?

    public HumanOperatorImpl(String name) {
        this.name = name;
    }

    @Override
    public Boolean isOnCall() {
        return onCall;
    }

    @Override
    public void setNextOperator(Operator next) {
        this.next = next;
    }

    @Override
    public void answer(Call call) {
        if (this.onCall) {
            // Текущий оператор говорит по телефону - переводим звонок на следующего
            next.answer(call);
        }
        System.out.println("Здравствуйте, оператор " + this.name + " слушает"); // Ответ на звонок
    }
}
