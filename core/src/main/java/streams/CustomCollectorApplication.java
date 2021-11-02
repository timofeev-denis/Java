package streams;


import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomCollectorApplication {
    public static void main(String[] args) {
        CustomCollectorApplication application = new CustomCollectorApplication();
        application.useWordCountCollector();
    }

    private void useWordCountCollector() {
        Collector<Article, MutableInteger, Integer> collector = Collector.of(
                () -> new MutableInteger(0),
                (accumulator, article) -> accumulator.add(article.getWordCount()),
                (left, right) -> {
                    left.add(right.getValue());
                    return left;
                },
                accumulator -> accumulator.getValue()
        );

        Integer wordsCount = Stream.of(new Article(), new Article(), new Article())
                .collect(collector);
        System.out.println("Total words: " + wordsCount);
    }

    class Article {
        public Short getWordCount() {
            short wordCount = (short) new Random().nextInt(10);
            System.out.println("Article words: " + wordCount);
            return wordCount;
        }
    }

    class MutableInteger {
        private int value;

        public MutableInteger(int value) {
            this.value = value;
        }

        public void add(int value) {
            this.value += value;
        }

        public int getValue() {
            return this.value;
        }
    }

}
