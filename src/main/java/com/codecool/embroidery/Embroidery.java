package com.codecool.embroidery;

public class Embroidery {
    public static void main(String[] args) {
        printShape(drawRectangle(5, 5));
        System.out.println();
        printShape(drawRectangle(5,5,3));
        System.out.println();
        printShape(drawRectangle(5,5,3,8));
        System.out.println();
//        printShape(drawRectangle());
        System.out.println();
    }

    private static int[][] drawRectangle(int width, int height) {
        int[][] rectangle = new int[height][width];
        final int fillColor = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle[i][j] = fillColor;
            }
        }
        return rectangle;
    }

    private static int[][] drawRectangle(int width, int height, int borderColor) {
        int[][] rectangle = new int[height][width];
        final int fillColor = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
                    rectangle[i][j] = borderColor;
                } else {
                    rectangle[i][j] = fillColor;
                }
            }
        }
        return rectangle;
    }

    private static int[][] drawRectangle(int width, int height, int borderColor, int fillColor) {
        int[][] rectangle = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
                    rectangle[i][j] = borderColor;
                } else {
                    rectangle[i][j] = fillColor;
                }
            }
        }
        return rectangle;
    }

    private static int[][] drawRectangle(int width, int height, int borderColor, int fillColor, int borderWidth) {
        return new int[0][0];
    }

    private static int[][] drawTriangle(int height) {
        return new int[0][0];
    }

    private static int[][] drawTriangle(int height, int borderColor) {
        return new int[0][0];
    }

    private static int[][] drawTriangle(int height, int borderColor, int fillColor) {
        return new int[0][0];
    }

    private static int[][] drawChristmasTree(int blocks) {
        return new int[0][0];
    }

    private static int[][] drawChristmasTree(int blocks, int borderColor) {
        return new int[0][0];
    }

    private static int[][] drawChristmasTree(int blocks, int borderColor, int fillColor) {
        return new int[0][0];
    }

    private static int[][] drawCircle(int radius) {
        return new int[0][0];
    }

    private static int[][] drawCircle(int radius, int borderColor) {
        return new int[0][0];
    }

    private static int[][] drawCircle(int radius, int borderColor, int fillColor) {
        return new int[0][0];
    }

    private static void printShape(int[][] shape) {
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[0].length; j++) {
                System.out.print(shape[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
