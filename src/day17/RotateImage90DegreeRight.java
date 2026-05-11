package day17;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class RotateImage90DegreeRight {

	public static void main(String[] args) throws Exception {

        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int matrix2[][] = new int[3][3];

        int k = 2;

        // Rotate matrix
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrix2[j][k] = matrix[i][j];
            }
            k--;
        }

        // Create image
        int width = 300;
        int height = 300;

        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D g = image.createGraphics();

        // Background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Draw grid
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 30));

        int cellSize = 80;

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {

                int x = j * cellSize + 30;
                int y = i * cellSize + 60;

                // Draw box
                g.drawRect(x, y - 40, cellSize, cellSize);

                // Draw number
                g.drawString(String.valueOf(matrix2[i][j]),
                        x + 25, y + 10);
            }
        }

        g.dispose();

        // Save image
        ImageIO.write(image, "png",
                new File("rotated_matrix.png"));

        System.out.println("Image created: rotated_matrix.png");
    }
}
