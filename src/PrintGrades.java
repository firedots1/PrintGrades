import java.util.Scanner;

public class PrintGrades {
    public static void main(String args[]) {
        // I need to write a while loop for prompting user.// A lot of the variables that I will be required to use are the following:
        // The user, the number, exam scores or list of exam scores which is already provided. //
        // Based on the lettering system that is illustrated, the letter begins with A, B, C, D and F. //
        // The purpose of this program is to prompt user for the input first; asking for number to enter (e.g 40).

      
    
 

        // This program first begins with the simple of importing Scanner
        Scanner Input = new Scanner(System.in);
        /* Next the variable of integer of num gets assigned representing the function for Scanner of Input// */
        String i = "yes";
        while (!i.equals("no")) {

            System.out.println("Please Enter Number: ");
            int num = Input.nextInt();
            if (num >= 97 && num <= 100) {
                System.out.println("Your Grade is A+ \n");
            } else if (num >= 94 && num <= 96) {
                System.out.println("Your Grade is A \n");
            } else if (num >= 90 && num <= 93) {
                System.out.println("Your Grade is -A \n");
            } else if (num >= 87 && num <= 89) {
                System.out.print("Your Grade is B+ \n");
            } else if (num >= 80 && num <= 83) {
                System.out.println("Your Grade is B- \n");
            } else if (num >= 77 && num <= 79) {
                System.out.println("Your Grade is C+ \n");
            } else if (num >= 74 && num <= 76) {
                System.out.println("Your Grade is C \n");
            } else if (num >= 70 && num <= 73) {
                System.out.println("Your Grade is C- \n");
            } else if (num >= 60 && num <= 69) {
                System.out.println("Your Grade is D \n");
            } else {
                System.out.println("Not a Valid Number");
            }
            System.out.println("Do you want to enter another number? \nIf you want to end this, type 'no' to end or type in any key to continue.. ");
            Input.nextLine();
            i = Input.nextLine();
        }
    }
}

