class Profile {

    private String name;
    private int age;
    private double heightMetres;

    public Profile(String name, int age, double heightMetres) {
        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightMetres() {
        return heightMetres;
    }

    public String toString() {
        return "Profile[name=" + name + ", age=" + age
                + ", height=" + heightMetres + "m]";
    }
}

public class TextProfile {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java TextProfile <name> <age> <height>");
            return;
        }

        String name = args[0];
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: name must not be blank");
            return;
        }

        int age = Integer.parseInt(args[1]);
        if (age < 0) {
            System.out.println("Error: age must be non-negative");
            return;
        }

        double height = Double.parseDouble(args[2]);
        if (height <= 0) {
            System.out.println("Error: height must be positive");
            return;
        }

        Profile profile = new Profile(name, age, height);
        System.out.println(profile);

        System.out.println("name as String.valueOf: " + String.valueOf(name));
        System.out.println("age as Integer.toString: " + Integer.toString(age));
        System.out.println("height as Double.toString: " + Double.toString(height));
    }
}
