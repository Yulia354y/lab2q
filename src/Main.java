//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //task1
        int n = 125;
        if ( n > 50 & n < 100) {
            System.out.println("Число "+ n +" міститься на проміжку (50;100)");
        }else {
            System.out.println("Число "+ n +" не міститься на проміжку (50;100)");
        }
        //task2
        int number = 332;
        int firstNumber = number / 100;
        int lokNumber = number % 100;
        int secondNumber = lokNumber/10;
        int thirdNumber = lokNumber%10;
        if (firstNumber>=secondNumber & firstNumber>=thirdNumber){
            System.out.println(firstNumber);
        } else if (secondNumber>=firstNumber & secondNumber>= thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
        //task 3
        String direction = "До низу";
        int floor = 1;

        if (direction == "До гори") {
            if (floor == 2 || floor == 3) {
                System.out.println("Ви піднялися на 3 поверх");
            } else {
                System.out.println("Ви піднялися на " + floor + " поверх");
            }
        }else if (direction == "До низу"){
            if (floor == 1 || floor == 2){
                    System.out.println("ви спустилися на 1 поверх");
            }else {
                    System.out.println("Ви спустилися на "+ floor +" поверх");

            }
        }

        //task4
        String condition ="No";
        switch (condition){
            case "Так":
            case "OK":
            case "Ok":
            case "Yes":
            case "Y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "No":
            case "NO":
            case "N":
            case "-":
              System.out.println("Я відмовляюсь!");
              break;
        }

        //task5
        int y = 10;
        int x = 4;
        int z = 3;
        if (y > x){
            int c = y;
            y = x;
            x = c;
        }
        if (x>z){
            int c = x;
            x = z;
            z = c;
        }
        if (y>x){
            int c =y;
            y = x;
            x = c;
        }

        System.out.println("Числа в порядку зростання: "+ y +", "+ x +", "+ z +", ");


    }
}