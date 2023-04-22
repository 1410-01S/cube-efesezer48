// Efe Sezer Cildir, Rubik Cube assignment


package com.example.alternative;
//Import the necessary module to work with Scanner object
import java.util.Scanner;

//RubikCube class
public class RubikCube {
    private final int[][][] cube;

    public RubikCube() {
        cube = new int[6][3][3];
        initCube();
    }

    private void initCube() {
        for (int face = 0; face < 6; face++) {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    cube[face][row][col] = face;
                }
            }
        }
    }

    public void displayCube() {
        for (int row = 0; row < 3; row++) {
            for (int face = 0; face < 6; face++) {
                if (face == 3) System.out.println();
                for (int col = 0; col < 3; col++) {
                    System.out.print(cube[face][row][col] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void rotateLayerClockwise(int face) {
        int[][] temp = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                temp[row][col] = cube[face][2 - col][row];
            }
        }
        System.arraycopy(temp, 0, cube[face], 0, temp.length);
    }

    private void rotateLayerCounterClockwise(int face) {
        int[][] temp = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                temp[row][col] = cube[face][col][2 - row];
            }
        }
        System.arraycopy(temp, 0, cube[face], 0, temp.length);
    }

    public void rotateUp() {
        int[] temp = new int[3];
        System.arraycopy(cube[2][0], 0, temp, 0, temp.length);
        System.arraycopy(cube[4][0], 0, cube[2][0], 0, temp.length);
        System.arraycopy(cube[3][0], 0, cube[4][0], 0, temp.length);
        System.arraycopy(cube[1][0], 0, cube[3][0], 0, temp.length);
        System.arraycopy(temp, 0, cube[1][0], 0, temp.length);
        rotateLayerClockwise(0);
    }
    
    //Perform the given move on the cube
    public void performMove(String move) {
	     // case statements for each move .
        switch (move) {
            case "u":
                rotateUp();
                break;
            case "u'":
                rotateUp();
                rotateUp();
                rotateUp();
                break;
            case "d":
                rotateDown();
                break;
            case "d'":
                rotateDown();
                rotateDown();
                rotateDown();
                break;
            case "r":
                rotateRight();
                break;
            case "r'":
                rotateRight();
                rotateRight();
                rotateRight();
                break;
            case "l":
                rotateLeft();
                break;
            case "l'":
                rotateLeft();
                rotateLeft();
                rotateLeft();
                break;
            case "f":
                rotateFront();
                break;
            case "f'":
                rotateFront();
                rotateFront();
                rotateFront();
                break;
            case "b":
                rotateBack();
                break;
            case "b'":
                rotateBack();
                rotateBack();
                rotateBack();
                break;
            default:
                System.out.println("Invalid move: " + move);
                break;
        }
    }

    private void rotateBack() {
		// TODO Auto-generated method stub
		
	}

	private void rotateFront() {
		// TODO Auto-generated method stub
		
	}

	private void rotateLeft() {
		// TODO Auto-generated method stub
		
	}

	private void rotateRight() {
		// TODO Auto-generated method stub
		
	}

	private void rotateDown() {
		// TODO Auto-generated method stub
		
	}

	// Implement the remaining rotation methods similar to rotateUp()

    public static void main(String[] args) {
        RubikCube altCube = new RubikCube();
        altCube.displayCube();
    }
}
