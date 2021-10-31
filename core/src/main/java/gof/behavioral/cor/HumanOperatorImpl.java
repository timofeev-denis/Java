package gof.behavioral.cor;

public class HumanOperatorImpl implements Operator {

    private String name;
    private Operator next; // Следующий оператор в цепочке
    private boolean onCall; // Сейчас оператор говорит по телефону?

    public HumanOperatorImpl(String name, Operator next) {
        this.name = name;
        this.next = next;
    }

    public void answer(Call call) {
        if (this.onCall) {
            // Текущий оператор говорит по телефону - переводим звонок на следующего
            next.answer(call);
        }
        // Ответ на звонок
    }
}
