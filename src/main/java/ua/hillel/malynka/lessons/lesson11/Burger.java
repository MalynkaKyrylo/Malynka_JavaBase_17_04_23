package ua.hillel.malynka.lessons.lesson11;

public class Burger {

//       Зробити клас Burger, який матиме поля:
//
//булочка, м'ясо, сир, зелень, майонез
//
//    Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
//    звичайний бургер (усі компоненти)
//    дієтичний бургер (без майонезу)
//    з подвійним м'ясом
//    У кожен конструктор додати виведення в консоль складу даного варіанту бургера
//    (при створенні екземпляра бургера, який використовує даний конструктор -
//    буде виводитися в консоль його склад).

    String bun;

    String meat1;
    String meat2;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat1, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад бругера: "+this.bun+" "+this.meat1+" "+this.cheese+" "+this.greens+" "+this.mayonnaise);
    }

    public Burger(String bun, String meat1, String cheese, String greens) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад бругера: "+this.bun+" "+this.meat1+" "+this.cheese+" "+this.greens);
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад бругера: "+this.bun+" "+this.meat1+" "+this.meat2+" "+this.cheese+" "+this.greens+" "+this.mayonnaise);
    }
}