package ss1_java_intruduction.exercise;
import java.util.Scanner;
public class NumbersIntoWords {
    //Đọc số thành chữ ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên có tối đa 3 chữ số :  ");
        int number = sc.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability!");
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability!");
            }
        } else if (number < 100) {
            switch (number / 10) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                default:
                    System.out.println("out of ability!");
            }

            if (number % 10 != 0) {
                switch (number % 10) {
                    case 1:
                        System.out.println("-one");
                        break;
                    case 2:
                        System.out.println("-two");
                        break;
                    case 3:
                        System.out.println("-three");
                        break;
                    case 4:
                        System.out.println("-four");
                        break;
                    case 5:
                        System.out.println("-five");
                        break;
                    case 6:
                        System.out.println("-six");
                        break;
                    case 7:
                        System.out.println("-seven");
                        break;
                    case 8:
                        System.out.println("-eight");
                        break;
                    case 9:
                        System.out.println("-nine");
                        break;
                    default:
                        System.out.println("out of ability!");
                }
            }
        } else if (number < 1000) {
            switch (number / 100) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
                default:
                    System.out.println("out of ability!");
            }

            int newNumber = number - (number / 100) * 100;
            if (newNumber != 0) {
                if (newNumber < 10) {
                    switch (newNumber) {
                        case 1:
                            System.out.println(" and one");
                            break;
                        case 2:
                            System.out.println(" and two");
                            break;
                        case 3:
                            System.out.println(" and three");
                            break;
                        case 4:
                            System.out.println(" and four");
                            break;
                        case 5:
                            System.out.println(" and five");
                            break;
                        case 6:
                            System.out.println(" and six");
                            break;
                        case 7:
                            System.out.println(" and seven");
                            break;
                        case 8:
                            System.out.println(" and eight");
                            break;
                        case 9:
                            System.out.println(" and nine");
                            break;
                        default:
                            System.out.println("out of ability!");
                    }
                } else if (newNumber < 20) {
                    switch (newNumber % 10) {
                        case 0:
                            System.out.println(" and ten");
                            break;
                        case 1:
                            System.out.println(" and eleven");
                            break;
                        case 2:
                            System.out.println(" and twelve");
                            break;
                        case 3:
                            System.out.println(" and thirteen");
                            break;
                        case 4:
                            System.out.println(" and fourteen");
                            break;
                        case 5:
                            System.out.println(" and fifteen");
                            break;
                        case 6:
                            System.out.println(" and sixteen");
                            break;
                        case 7:
                            System.out.println(" and seventeen");
                            break;
                        case 8:
                            System.out.println(" and eighteen");
                            break;
                        case 9:
                            System.out.println(" and nineteen");
                            break;
                        default:
                            System.out.println("out of ability!");
                    }
                } else if (newNumber < 100) {
                    switch (newNumber / 10) {
                        case 2:
                            System.out.print(" and twenty");
                            break;
                        case 3:
                            System.out.print(" and thirty");
                            break;
                        case 4:
                            System.out.print(" and forty");
                            break;
                        case 5:
                            System.out.print(" and fifty");
                            break;
                        case 6:
                            System.out.print(" and sixty");
                            break;
                        case 7:
                            System.out.print(" and seventy");
                            break;
                        case 8:
                            System.out.print(" and eighty");
                            break;
                        case 9:
                            System.out.print(" and ninety");
                            break;
                        default:
                            System.out.println("out of ability!");
                    }

                    if (newNumber % 10 != 0) {
                        switch (newNumber % 10) {
                            case 1:
                                System.out.println("-one");
                                break;
                            case 2:
                                System.out.println("-two");
                                break;
                            case 3:
                                System.out.println("-three");
                                break;
                            case 4:
                                System.out.println("-four");
                                break;
                            case 5:
                                System.out.println("-five");
                                break;
                            case 6:
                                System.out.println("-six");
                                break;
                            case 7:
                                System.out.println("-seven");
                                break;
                            case 8:
                                System.out.println("-eight");
                                break;
                            case 9:
                                System.out.println("-nine");
                                break;
                            default:
                                System.out.println("out of ability!");
                        }
                    }
                }
            }
        }
    }
}
//        if (number < 10) {
//            switch (number) {
//                case 0:
//                    readNumber = "zero";
//                    break;
//                case 1:
//                    readNumber = "one";
//                    break;
//                case 2:
//                    readNumber = "two";
//                    break;
//                case 3:
//                    readNumber = "three";
//                    break;
//                case 4:
//                    readNumber = "four";
//                    break;
//                case 5:
//                    readNumber = "five";
//                    break;
//                case 6:
//                    readNumber = "six";
//                    break;
//                case 7:
//                    readNumber = "seven";
//                    break;
//                case 8:
//                    readNumber = "eight";
//                    break;
//                case 9:
//                    readNumber = "nine";
//                default:
//                    readNumber = "";
//                    break;
//
//            }
//            if (!readNumber.equals("")) {
//                System.out.printf("The number '%d' read %s ", number, readNumber);
//            }else {
//                System.out.print("Invalid input!");
//            }
//
//        } else if (number < 20) {
//            switch (number % 10) {
//                case 0:
//                    readNumber = "ten";
//                    break;
//                case 1:
//                    readNumber = "eleven";
//                    break;
//                case 2:
//                    readNumber = "twelve";
//                    break;
//                case 3:
//                    readNumber = "thirteen";
//                    break;
//                case 4:
//                    readNumber = "fourteen";
//                    break;
//                case 5:
//                    readNumber = "fifteen";
//                    break;
//                case 6:
//                    readNumber = "sixteen";
//                    break;
//                case 7:
//                    readNumber = "seventeen";
//                    break;
//                case 8:
//                    readNumber = "eighteen";
//                    break;
//                case 9:
//                    readNumber = "nineteen";
//                default:
//                    readNumber = "";
//                    break;
//
//            }
//            if (!readNumber.equals("")) {
//                System.out.printf("The number '%d' read %s !", number, readNumber);
//            }else {
//                System.out.print("Invalid input!");
//            }
//        } else if (number < 100) {
//            switch (number / 10) {
//                case 2:
//                    readNumber = "tewnty";
//                    break;
//                case 3:
//                    readNumber = "thirty";
//                    break;
//                case 4:
//                    readNumber = "forty";
//                    break;
//                case 5:
//                    readNumber = "fifty";
//                    break;
//                case 6:
//                    readNumber = "sixty";
//                    break;
//                case 7:
//                    readNumber = "seventy";
//                    break;
//                case 8:
//                    readNumber = "eighty";
//                    break;
//                case 9:
//                    readNumber = "ninety";
//                default:
//                    readNumber = "";
//                    break;
//            }
//            if (!readNumber.equals("")) {
//                System.out.printf("The number '%d' read %s !", number, readNumber);
//            }else {
//                System.out.print("Invalid input!");
//            }
//            if (number % 10 != 0) {
//                switch (number % 10) {
//                    case 1:
//                        readNumber = "-one";
//                        break;
//                    case 2:
//                        readNumber = "-two";
//                        break;
//                    case 3:
//                        readNumber = "-three";
//                        break;
//                    case 4:
//                        readNumber = "-four";
//                        break;
//                    case 5:
//                        readNumber = "-five";
//                        break;
//                    case 6:
//                        readNumber = "-six";
//                        break;
//                    case 7:
//                        readNumber = "-seven";
//                        break;
//                    case 8:
//                        readNumber = "-eight";
//                        break;
//                    case 9:
//                        readNumber = "-nine";
//                    default:
//                        readNumber = "";
//                        break;
//                }
//            }
//            if (!readNumber.equals("")) {
//                System.out.printf("The number '%d' read %s !", number, readNumber);
//            }else {
//                System.out.print("Invalid input!");
//            }
//
//        } else if (number < 1000) {
//            switch (number / 100) {
//                case 1:
//                    readNumber = "one hundred";
//                    break;
//                case 2:
//                    readNumber = "two hundred";
//                    break;
//                case 3:
//                    readNumber = "three hundred";
//                    break;
//                case 4:
//                    readNumber = "four hundred";
//                    break;
//                case 5:
//                    readNumber = "five hundred";
//                    break;
//                case 6:
//                    readNumber = "six hundred";
//                    break;
//                case 7:
//                    readNumber = "seven hundred";
//                    break;
//                case 8:
//                    readNumber = "eight hundred";
//                    break;
//                case 9:
//                    readNumber = "nine hundred";
//                default:
//                    readNumber = "";
//                    break;
//            }
//            if (!readNumber.equals("")) {
//                System.out.printf("The number '%d' read %s !", number, readNumber);
//            }else {
//                System.out.print("Invalid input!");
//            }
//
//            int newNumber = number - (number / 100) * 100;
//            if (newNumber != 0) {
//                if (newNumber < 10) {
//                    switch (newNumber) {
//                        case 1:
//                            readNumber = " and one";
//                            break;
//                        case 2:
//                            readNumber = " and two";
//                            break;
//                        case 3:
//                            readNumber = " and three";
//                            break;
//                        case 4:
//                            readNumber = " and four";
//                            break;
//                        case 5:
//                            readNumber = " and five";
//                            break;
//                        case 6:
//                            readNumber = " and six";
//                            break;
//                        case 7:
//                            readNumber = " and seven";
//                            break;
//                        case 8:
//                            readNumber = " and eight";
//                            break;
//                        case 9:
//                            readNumber = " and nine";
//                            break;
//                        default:
//                            readNumber = "";
//                    }
//                    if (!readNumber.equals("")) {
//                        System.out.printf("The number '%d' read %s !", number, readNumber);
//                    }else {
//                        System.out.print("Invalid input!");
//                    }
//                } else if (newNumber < 20) {
//                    switch (newNumber % 10) {
//                        case 0:
//                            readNumber = " and ten";
//                            break;
//                        case 1:
//                            readNumber = " and eleven";
//                            break;
//                        case 2:
//                            readNumber = " and twelve";
//                            break;
//                        case 3:
//                            readNumber = " and thirteen";
//                            break;
//                        case 4:
//                            readNumber = " and fourteen";
//                            break;
//                        case 5:
//                            readNumber = " and fifteen";
//                            break;
//                        case 6:
//                            readNumber = " and sixteen";
//                            break;
//                        case 7:
//                            readNumber = " and seventeen";
//                            break;
//                        case 8:
//                            readNumber = " and eighteen";
//                            break;
//                        case 9:
//                            readNumber = " and nineteen";
//                            break;
//                        default:
//                            readNumber = "";
//                    }
//                    if (!readNumber.equals("")) {
//                        System.out.printf("The number '%d' read %s !", newNumber, readNumber);
//                    }else {
//                        System.out.print("Invalid input!");
//                    }
//                } else if (newNumber < 100) {
//                    switch (newNumber / 10) {
//                        case 2:
//                            readNumber = " and tewnty";
//                            break;
//                        case 3:
//                            readNumber = " and thirty";
//                            break;
//                        case 4:
//                            readNumber = " and forty";
//                            break;
//                        case 5:
//                            readNumber = " and fifty";
//                            break;
//                        case 6:
//                            readNumber = " and sixty";
//                            break;
//                        case 7:
//                            readNumber = " and seventy";
//                            break;
//                        case 8:
//                            readNumber = " and eighty";
//                            break;
//                        case 9:
//                            readNumber = " and ninety";
//                        default:
//                            readNumber = "";
//                            break;
//                    }
//                    if (!readNumber.equals("")) {
//                        System.out.printf("The number '%d' read %s !", number, readNumber);
//                    }else {
//                        System.out.print("Invalid input!");
//                    }
//
//                    if (newNumber % 10 != 0) {
//                        switch (newNumber % 10) {
//                            case 1:
//                                readNumber = "-one";
//                                break;
//                            case 2:
//                                readNumber = "-two";
//                                break;
//                            case 3:
//                                readNumber = "-three";
//                                break;
//                            case 4:
//                                readNumber = "-four";
//                                break;
//                            case 5:
//                                readNumber = "-five";
//                                break;
//                            case 6:
//                                readNumber = "-six";
//                                break;
//                            case 7:
//                                readNumber = "-seven";
//                                break;
//                            case 8:
//                                readNumber = "-eight";
//                                break;
//                            case 9:
//                                readNumber = "-nine";
//                                break;
//                            default:
//                                readNumber = "";
//
//                        }
//                        if (!readNumber.equals("")) {
//                            System.out.printf("The number '%d' read %s !", number, readNumber);
//                        }else {
//                            System.out.print("Invalid input!");
//                        }
//                    }
//                }
//            }
//        }
