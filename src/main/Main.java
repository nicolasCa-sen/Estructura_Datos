package main;

import java.util.Scanner;

import logic.StackNode;

public class Main {

    static String Process(String Line) {
        return Line;
    }

    public static void main(String[] args) {
        StackNode<Character> st = new StackNode<Character>((o1, o2) -> Character.compare(o1, o2));
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        while (input.hasNext()) {
            System.out.println(input.nextLine());

            Process(input.nextLine());
        }
    }

}
