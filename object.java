class Car {
    int tyres;
    String colour;
    String size;
    String shape;

    void message() {
        System.out.println("hello");
    }
}

class object {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.tyres = 4;
        honda.colour = "red";
        honda.size = "small";
        honda.shape = "circle";
        System.out.println(honda.colour);

        Car maruti = new Car();
        maruti.colour = "white";
        System.out.println(maruti.colour);
        maruti.message();
    }
}

