package com.packages;


import java.util.Scanner;

public class demo {

    public static int score = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void showTitle() {
        System.out.print("【Dating APP】\n\n");
    }

    public static void askForName() {
        System.out.print("What ur name：");
        String name = scanner.nextLine();
        System.out.println("Hello，" + name + "！");
    }

    public static void askForFashion() {
        System.out.print("What is ur wearing style：");
        String fashion = scanner.nextLine();

        switch (fashion){
            case "Vintage":
                score += 2;
            case "Punk":
                score ++;
                break;
            case "Casual":
                score --;
                break;
            default:
                break;
        }
    }

    public static void askForHobby() {
        System.out.print("What is ur hobbies：");
        String hobby = scanner.nextLine();

        if (hobby.startsWith("shopping") || hobby.startsWith("movie") || hobby.startsWith("hiking")) score++;
    }

    public static void askForFavoriteFood() {
        System.out.print("What kind of food u like：");
        String favoriteFood = scanner.nextLine();

        switch (favoriteFood) {
            case "Japanese":
                score += 2;
            case "Chinese":
            case "Italian":
                score++;
                break;
            case "Thai":
                score--;
                break;
            case "Korean":
                score -= 2;
                break;
            default:
                break;
        }
    }

    public static void askForOccupation() {
        System.out.print("What is ur job：");

        String occupation = scanner.nextLine();
        if (
                occupation.contains("chef") ||
                        occupation.contains("renovation worker") ||
                        occupation.contains("artist") ||
                        occupation.toLowerCase().contains("actor")

        ) {
            score -= 2; // no time and unstable
        } else if (occupation.contains("designer") || occupation.contains("CEO") || occupation.contains("Artist")) {
            score += 2; // rich
        }
    }

    public static void askForSalary() {
        System.out.print("How many income：");
        int salary = scanner.nextInt();

        if (salary >= 50000) {
            score += 5;
        } else if (salary >= 30000) {
            score += 1;
        } else {
            score -= 2;
        }
    }

    public static void DateOrNot() {
        if (score >= 3) {
            System.out.print("Tonight Free？");
        } else {
            System.out.print("Sorry！we are not match\n交友 App: User is left.");
        }
    }

    public static void main(String[] args) {
        showTitle();
        askForName();
        askForFashion();
        askForHobby();
        askForFavoriteFood();
        askForOccupation();
        askForSalary();
        DateOrNot();
    }
}

