public class Abhiu {
    public String name;
    public int age;

    public Abhiu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Abhiu(Abhiu a){
        this.name = a.name;
        this.age = a.age;
    }

    @Override
    public String toString() {
        return "Abhiu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Abhiu a1 = new Abhiu("Abhiu", 81);
        System.out.println(a1.toString());
        Abhiu a2 = a1;
        System.out.println(a2.toString());
        System.out.println(a1 == a2);
    }

}
