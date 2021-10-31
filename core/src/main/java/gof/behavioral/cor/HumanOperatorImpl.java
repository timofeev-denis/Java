package gof.behavioral.cor;

public class HumanOperatorImpl implements Operator {

    private String name;
    private Operator next; // Следующий оператор в цепочке
    private boolean onCall; // Сейчас оператор говорит по телефону?

    public HumanOperatorImpl(String name) {
        this.name = name;
    }

    @Override
    public boolean isOnCall() {
        return onCall;
    }

    @Override
    public Operator append(Operator next) {
        this.next = next;
        return this;
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
