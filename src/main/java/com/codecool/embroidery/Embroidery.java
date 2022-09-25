package com.codecool.embroidery;

public class Embroidery {
    public static void main(String[] args) {
        printShape(drawRectangle(5, 5));
        System.out.println();
        printShape(drawRectangle(5, 5, 3));
        System.out.println();
        printShape(drawRectangle(5, 5, 3, 8));
        System.out.println();
        printShape(drawRectangle(7, 7, 8, 2, 2));
        System.out.println();
        printShape(drawTriangle(4));
        System.out.println();
        printShape(drawTriangle(4, 2));
        System.out.println();
        printShape(drawTriangle(4, 2, 6));
        System.out.println();
        printShape(drawChristmasTree(1));
        System.out.println();
        printShape(drawChristmasTree(2));
        System.out.println();
        printShape(drawChristmasTree(3));
        System.out.println();
        printShape(drawChristmasTree(4));
        System.out.println();
        printShape(drawChristmasTree(4, 2));
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
        int[][] rectangle = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i < borderWidth || j < borderWidth ||
                    i >= height - borderWidth || j >= width - borderWidth) {
                    rectangle[i][j] = borderColor;
                } else {
                    rectangle[i][j] = fillColor;
                }
            }
        }
        return rectangle;
    }

    private static int[][] drawTriangle(int height) {
        final int width = height * 2 - 1;
        final int empty = 0;
        final int fillColor = 1;
        int[][] triangle = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) {
                    triangle[i][j] = fillColor;
                } else {
                    triangle[i][j] = empty;
                }
            }
        }
        return triangle;
    }


    private static int[][] drawTriangle(int height, int borderColor) {
        final int width = height * 2 - 1;
        final int empty = 0;
        final int fillColor = 1;
        int[][] triangle = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == height - 1 - i || j == height - 1 + i || i == height - 1) {
                    triangle[i][j] = borderColor;
                } else if (j > height - 1 - i && j < height - 1 + i) {
                    triangle[i][j] = fillColor;
                } else {
                    triangle[i][j] = empty;
                }
            }
        }
        return triangle;
    }

    private static int[][] drawTriangle(int height, int borderColor, int fillColor) {
        final int width = height * 2 - 1;
        final int empty = 0;
        int[][] triangle = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == height - 1 - i || j == height - 1 + i || i == height - 1) {
                    triangle[i][j] = borderColor;
                } else if (j > height - 1 - i && j < height - 1 + i) {
                    triangle[i][j] = fillColor;
                } else {
                    triangle[i][j] = empty;
                }
            }
        }
        return triangle;
    }

    private static int[][] drawChristmasTree(int blocks) {
        final int heightOfBlocks = 3;
        final int height = blocks * heightOfBlocks;
        final int width = heightOfBlocks + blocks * 2;
        final int empty = 0;
        final int fillColor = 1;
        int[][] christmasTree = new int[height][width];
        for (int i = 0; i < blocks; i++) {
            for (int j = 0; j < heightOfBlocks; j++) {
                for (int k = 0; k < width; k++) {
                    if (k >= width / 2 - j - i && k <= width / 2 + j + i) {
                        christmasTree[i * 3 + j][k] = fillColor;
                    } else {
                        christmasTree[i * 3 + j][k] = empty;
                    }
                }
            }
        }
        return christmasTree;
    }

    private static int[][] drawChristmasTree(int blocks, int borderColor) {
        final int heightOfBlocks = 3;
        final int height = blocks * heightOfBlocks;
        final int width = heightOfBlocks + blocks * 2;
        final int empty = 0;
        final int fillColor = 1;
        int[][] christmasTree = new int[height][width];
        for (int i = 0; i < blocks; i++) {
            for (int j = 0; j < heightOfBlocks; j++) {
                for (int k = 0; k < width; k++) {
                    if (k == width / 2 - j - i || k == width / 2 + j + i || (i + 1) * (j + 1) == height) {
                        christmasTree[i * heightOfBlocks + j][k] = borderColor;
                    }else if (k >= width / 2 - j - i && k <= width / 2 + j + i) {
                        christmasTree[i * heightOfBlocks + j][k] = fillColor;
                    } else {
                        christmasTree[i * heightOfBlocks + j][k] = empty;
                    }
                }
            }
        }
        return christmasTree;
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
