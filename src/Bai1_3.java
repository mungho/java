import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        String result = "";
        int firstNum = number / 100;
        int secondNum = (number / 10) % 10;
        int thirdNum = number % 10;

        if (number < 0) {
            result = "Out of ability";
        } else if (number < 10) {
            if (number == 0) {
                result = "Zero";
            } else
                result = convertToName(number);
        } else if (number < 16) {
            switch (number) {
                case (10):
                    result = "ten";
                    break;
                case (11):
                    result = "eleven";
                    break;
                case (12):
                    result = "twelve";
                    break;
                case (13):
                    result = "thirteen";
                    break;
                case (14):
                    result = "fourteen";
                    break;
                case (15):
                    result = "fifteen";
                    break;
                default:
                    break;
            }
        } else if (number < 20) {
            if (number == 18) {
                result = "eighteen";
            } else
                result = convertToName(thirdNum) + "teen";
        } else if (number < 100) {
            result = convertToName2(secondNum, thirdNum);
        } else if (number < 1000) {
            result = convertToName(firstNum) + " hundred " + convertToName2(secondNum, thirdNum);
        }

        System.out.println("Your number is: " + result);
    }

    static String convertToName2(int secondNum, int thirdNum) {
        String tempResult = "";
        if (secondNum == 2) {
            if (thirdNum != 0) {
                tempResult = "twenty-" + convertToName(thirdNum);
            } else
                tempResult = "twenty";
        } else if (secondNum == 3) {
            if (thirdNum != 0) {
                tempResult = "thirty-" + convertToName(thirdNum);
            } else
                tempResult = "thirty";
        } else if (secondNum == 4) {
            if (thirdNum != 0) {
                tempResult = "forty-" + convertToName(thirdNum);
            } else
                tempResult = "forty";
        } else if (secondNum == 5) {
            if (thirdNum != 0) {
                tempResult = "fifty-" + convertToName(thirdNum);
            } else
                tempResult = "fifty";
        } else if (secondNum == 8) {
            if (thirdNum != 0) {
                tempResult = "eighty-" + convertToName(thirdNum);
            } else
                tempResult = "eighty";
        } else {
            if (thirdNum != 0) {
                tempResult = convertToName(secondNum) + "ty-" + convertToName(thirdNum);
            } else if (secondNum != 0) {
                tempResult = convertToName(secondNum) + "ty";
            }
        }

        return tempResult;
    }

    static String convertToName(int number) {
        switch (number) {
            case (1):
                return "one";
            case (2):
                return "two";
            case (3):
                return "three";
            case (4):
                return "four";
            case (5):
                return "five";
            case (6):
                return "six";
            case (7):
                return "seven";
            case (8):
                return "eight";
            case (9):
                return "nine";
            default:
                break;
        }
        return "";
    }
}
