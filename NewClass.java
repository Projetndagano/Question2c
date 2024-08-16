/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.quadratic;
import java.util.Scanner;
/**
 *
 * @author PROJET NDAGANO
 */
public class NewClass {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        if (determinant >= 0) {
            double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are: " + x1 + "and " + x2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");}}}
        
    






