public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Altynbek", "programmer","MegaCom" );
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("=============================================");


        Dancer dancer = new Dancer("Yryskeldi","programmer","PeakSoft House");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("=============================================");

        Singer singer = new Singer("Arun","Programmar","Matkasymov");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();

    }
}