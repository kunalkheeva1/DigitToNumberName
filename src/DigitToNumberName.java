import java.util.Scanner;

public class DigitToNumberName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be displayed: ");
        int input = sc.nextInt();

        String changed = Integer.toString(input);

        for(int i=0; i<changed.length(); i++){
            char c = changed.charAt(i);
          int value= Character.getNumericValue(c);

          switch (value){

              case 0:
                  System.out.printf("Zero");
                  break;
              case 1:
                  System.out.printf(" One ");
                  break;
              case 2:
                  System.out.printf(" Two ");
                  break;
              case 3:
                  System.out.printf(" Three ");
                  break;
              case 4:
                  System.out.printf(" Four ");
                  break;
              case 5:
                  System.out.printf(" Five ");
                  break;
              case 6:
                  System.out.printf(" Six ");
                  break;
              case 7:
                  System.out.printf(" Seven ");
                  break;
              case 8:
                  System.out.printf(" Eight ");
                  break;
              case 9:
                  System.out.printf(" Nine ");
                  break;

              default:
                  System.out.printf("Invalid");
                  break;
          }
        }
    }
}
