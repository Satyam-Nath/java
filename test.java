public class test{
    public static void main(String[] args) {
        String name = "Aman ";
        String neighbour = "Raman ";
        int age = 15;
        //For printing any variable or statement.
        System.out.println(name + neighbour + age);
        //If Else statement
        if(age>=30){
            System.out.println("The man is eligible for marriage.");
        }
        else{
            System.out.println("He is not eligible for marriage.");
        }
        //Else if statement
        int a = 80;
        if(a>=80){
            System.out.println("First Division.");
        }
        else if(a>=60){
            if(a<80){
                System.out.println("Second Division.");
            }
        }
        else{
            System.out.println("Third Division.");
        }
        //Switch Statement
        int ab = 3;
        switch(ab){
            case 1:
            System.out.println("You have chosen one");
            break;
            case 2:
            System.out.println("You have chosen two.");
            break;
            case 3:
            System.out.println("You have chosen three.");
            break;
            default:
            System.out.println("Invalid choice.");
        }
        //Practicing the switch statement
        int app = 2;
        switch(app){
            case 1:
            System.out.println("The number is one.");
            break;
            case 2:
            System.out.println("The number is two.");
            break;
            case 3:
            System.out.println("The number is three.");
            break;

        }
        //Using for loop
        int i = 1;
        for(i=1; i<=3;i++){
            System.out.println("The value of i is " + i);
        }
        //Practicing for loop
        int qwe = 40;
        for(qwe = 40; qwe<=50; qwe++){
            System.out.println("Your roll no. is " + qwe);
        }
        }
        
    }
