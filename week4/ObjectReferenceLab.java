class ScoreBox {

    private int score;

    public ScoreBox(int score) {
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "ScoreBox(" + score + ")";
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(999);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {
        ScoreBox a = new ScoreBox(10);
        ScoreBox b = a;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b (same object): " + (a == b));

        ScoreBox c = new ScoreBox(10);
        System.out.println("c = " + c);
        System.out.println("a == c (different objects): " + (a == c));

        addBonus(b, 5);
        System.out.println("After addBonus(b, 5): a = " + a + ", b = " + b);
        System.out.println("a == b still: " + (a == b));

        replaceLocally(a);
        System.out.println("After replaceLocally(a): a = " + a);

        ScoreBox d = createScoreBox(42);
        System.out.println("d = " + d);
        System.out.println("a == d (different objects): " + (a == d));
    }
}
