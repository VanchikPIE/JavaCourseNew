public class Cat {
    String name;
    float weight;
    String color;

    public Cat() {
    }

    public Cat(String name, float  weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        System.out.println("Мы создали кошку по 3 параметрам");
    }

    public void sayMiay(){
        System.out.println("Кошка говорит -  мяу");
    }

    public void run(){
        System.out.println("Кошка бегает");

    }
    public String getName(){
        return " Имя кошки + " + name;

    }
    public String rename(String Newname){
        name = Newname;
        return " Новое имя кота - " + name;

    }




}


