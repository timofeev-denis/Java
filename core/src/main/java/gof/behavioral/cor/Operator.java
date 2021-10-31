package gof.behavioral.cor;

public interface Operator {
    void answer(Call call);

    boolean isOnCall();

    Operator append(Operator next);
}
