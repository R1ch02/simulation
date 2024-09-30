package com.application;

import javax.swing.*;
import java.awt.*;

//TODO Добавить коллекцию, содержащую список
public class Map {

    private static final int GRID_SIZE = 20; // Размер сетки
    private static final int CELL_SIZE = 50; // Размер ячейки

    public static void createMap(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        frame.setTitle("Simulation");

        JPanel gridPanel = new JPanel() {
            // Переопределяем метод отрисовки
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGrid(g);
            }
        };

        gridPanel.setPreferredSize(new Dimension(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE));
        frame.add(gridPanel);
        frame.pack();
        frame.setVisible(true);
    }

    // Метод для рисования сетки и объектов
    private static void drawGrid(Graphics g) {
        for (int x = 0; x < GRID_SIZE; x++) {
            for (int y = 0; y < GRID_SIZE; y++) {
                // Цвета по типам объектов
                if ((x + y) % 2 == 0) {
                    g.setColor(Color.GRAY); // Трава
                } else {
                    g.setColor(Color.GRAY); // Камень
                }
                g.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.BLACK);
                g.drawRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

}
