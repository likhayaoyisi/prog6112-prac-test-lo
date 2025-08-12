import java.util.Scanner;

public abstract class Fine implements iFine{
    Scanner sc=new Scanner(System.in);
    public double FinePayable;
    public String name;
    public String speed;

    public Fine(String name, String speed, int FinePayable){

        this.name=name;
        this.speed=speed;
        this.FinePayable=FinePayable;
        System.out.println("Enter the name of the citizen:");
        name = sc.nextLine();
        System.out.println("Enter the speed travelled by the citizen: ");
        speed = sc.nextLine();
        FinePayable (double) = (speed * 2);
        System.out.println("The fine that the citizen must pay is: " + FinePayable);

        }




    }

