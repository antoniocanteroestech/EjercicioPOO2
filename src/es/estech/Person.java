package es.estech;

public class Person {

    private String name;
    private String surname1;
    private String surname2;
    float height;
    float weight;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getIMC(){
        return (this.weight/(height*height));
    }

    public String getIMCLevel(float imc){
        String nivelIMC = "";
        if (imc < 18.5){
            nivelIMC = "Peso Bajo";
        } else if (imc >= 18.5 && imc < 24.99) {
            nivelIMC = "Peso óptimo";
        } else if (imc >= 25 && imc < 29.99) {
            nivelIMC = "Peso alto";
        } else if (imc > 30){
            nivelIMC = "Obesidad";
        }

        return nivelIMC;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname1='" + surname1 + '\'' +
                ", surname2='" + surname2 + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
