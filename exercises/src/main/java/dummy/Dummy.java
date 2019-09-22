package dummy;

/**
 * Created by: Denis Timofeev
 * Date: 22.09.2019
 */
class Dummy {
    private String text = "initial text";

    Dummy() {
        System.out.println("Dummy constructor has been called");
    }

    void doStuff(String newText) {
        System.out.println("Old text: " + this.text);
        this.text = newText;
        System.out.println("New text is " + this.text);
    }

}
