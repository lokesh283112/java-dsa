public class Conditions {
    public static void main(String[] args) {
        int marks = 90;
        int age = 19;
        boolean Female = true;
        int day = 1;

        //if condition
        if(age >= 18)
          System.out.println("Eligible for vote " + age);
        
        //if..else condtions
        if(age >= 18)
        {
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }

        //if..else if...else
        if(marks <= 40){
            System.out.println("Grade C");
        }else if(marks > 40 && marks <= 70)
        {
            System.out.println("Grade B");
        }else if(marks > 70 && marks <= 100)
        {
            System.out.println("Grade A");
        }else{
            System.out.println("Invalid");
        }

        //nested if
        if(age >= 18)
        {
            if(Female)
            {
                System.out.println("the female is eligible for geting marrage");
            }
            
        }

        //Switch conditon
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}