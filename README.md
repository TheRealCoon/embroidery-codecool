# Tasks

## Draw a rectangle
Implement drawRectangle methods to return matrices similar to the following examples.
```
1 1 1 1 1 1 1          1 1 1 1 1 1 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 2 2 2 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 2 2 2 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 1 1 1 1 1 1          1 1 1 1 1 1 1
```

- The borderColor, fillColor, and borderWidth.
- Called with default arguments, the returned matrix is a width-by-height rectangle shape marked by 1s.
- The border of the rectangle has borderColor, and it is filled with fillColor.
- The third optional parameter, borderWidth, specifies the width of the border.
- There are no completely empty rows or columns in the returned matrix.
- The method provides reasonable answers to edge cases (all combinations of integers as parameters).

## Draw a triangle

Implement drawTriangle methods to return arrays similar to the following examples.

```
0 0 0 1 0 0 0          0 0 0 1 0 0 0
0 0 1 1 1 0 0          0 0 1 2 1 0 0
0 1 1 1 1 1 0          0 1 2 2 2 1 0
1 1 1 1 1 1 1          1 1 1 1 1 1 1
```

- The borderColor and fillColor parameters are optional
- Called with default arguments, the returned matrix consists of height rows and shows a tringle filled with 1s.
- The border of the triangle has borderColor, and it is filled with fillColor.
- There are no completely empty rows or columns in the returned matrix.
- The method provides reasonable answers to edge cases (all combinations of integers as parameters).

## Draw a Christmas tree

Implement drawChristmasTree methods to return arrays similar to the following example (when blocks == 4).
```
0 0 0 0 0 1 0 0 0 0 0
0 0 0 0 1 2 1 0 0 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 0 0 1 2 1 0 0 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 1 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 1 0
0 0 1 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 1 0
1 1 1 1 1 1 1 1 1 1 1
```

- The borderColor and fillColor parameters are optional.
- Called with default arguments, the returned matrix shows a Christmas tree made of blocks pieces of trapezoid blocks and filled with 1s. Each block has 3 rows, and each first row is one step shorter than the last row of the block above.
- The border of the triangle has borderColor, and it is filled with fillColor.
- There are no completely empty rows or columns in the returned matrix.
- The method provides reasonable answers to edge cases (all combinations of integers as parameters).

## OPTIONAL TASK: Draw a circle

Implement drawCircle methods to return arrays similar to the following example (truncated).

```
0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 1 1 2 2 2 2 2 2 2 1 1 1 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 1 2 2 2 2 2 2 2 2 2 2 2 2 2 1 1 0 0 0 0 0 0 0
0 0 0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0 0 0
0 0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0 0
0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0
0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0
0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
```

- The borderColor and fillColor parameters are optional.
- Called with default arguments, the returned matrix shows a circle of radius r filled with 1s.
- The returned matrix shows a continuous circle outline of borderColor, and filled with fillColor.
- There are no completely empty rows or columns in the returned matrix.
- The method provides reasonable answers to edge cases (all combinations of integers as parameters).