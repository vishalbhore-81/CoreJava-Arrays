public class Card {
    private String number;
    private int type;

    public Card(String number, int type){
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void display() {
        System.out.println(number + " " + type);
    }

}
