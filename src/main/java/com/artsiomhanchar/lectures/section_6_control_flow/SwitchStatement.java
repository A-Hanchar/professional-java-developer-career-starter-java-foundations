package com.artsiomhanchar.lectures.section_6_control_flow;

public class SwitchStatement {
//    public static void main(String[] args) {
//        int randomNumber = new Random().nextInt(10) + 1; // new Random().nextInt(n) [0, n)
//        System.out.printf("Generated number is: %d%n", randomNumber);
//
//        switch (randomNumber) {
//            case 1:
//                System.out.println("The color is RED");
//                break;
//            case 2:
//                System.out.println("The color is BLUE");
//                break;
//            case 3:
//                System.out.println("The color is GREEN");
//                break;
//            case 4:
//                System.out.println("The color is PURPLE");
//                break;
//            default:
//                System.out.println("The color is WHATEVER");
//                break;
//        }
//
//        String command = null;
//
//        if("stop".equals(command)) {
//            System.out.println("Stopping now...");
//        } else if ("go".equals(command)) {
//            System.out.println("Going now...");
//        }
//    }

    public static void main(String[] args) {
        String card = "ace";
        int currentTotalValue = 9;

        int currentValue = switch (card) {
            case "king", "queen", "jack" -> 10;
//            case "ace" -> currentTotalValue >= 10 ? 1 : 11;
            case "ace" -> {
                if (currentTotalValue <= 10) {
                    yield 11;
                } else {
                    yield  1;
                }
            }
            default -> Integer.parseInt(card);
        };

        System.out.printf("Current Card Value: %d%n", currentValue);
        System.out.printf("Total Value: %d%n", currentValue + currentTotalValue);

        currentTotalValue += currentValue;

        if (currentTotalValue == 21) {
            System.out.println("Your win");
        } else if (currentTotalValue > 21) {
            System.out.println("Oops. You lose");
        } else {
            System.out.println("You can add one more card or stop");
        }
    }
}
