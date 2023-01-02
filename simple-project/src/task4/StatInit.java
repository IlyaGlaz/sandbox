package task4;

public class StatInit {

    {
        id = 2;
        name = "Name";
    }

    public int id;
    public String name;
    public double salary;


    public static void main(String[] args) {
        StatInit statInit = new StatInit();
        System.out.println(statInit.id + statInit.name);
    }
}
