package com.google.layza;

import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        int width = 0;
        int height = 0;
        int calculated_area = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину треугольника: ");
        width = in.nextInt();
        System.out.print("Введите ширину треугольника: ");
        height = in.nextInt();
        //вычисляем площадь треугольника по формуле
        calculated_area = width * height/2;
        System.out.println("Площадь треугольника = " + calculated_area);
    }
}

