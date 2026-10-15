package org.example;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;

public class Main {
  private static void applyDarkTheme() {
    Color background = new Color(30, 30, 30);
    Color surface = new Color(45, 45, 45);
    Color foreground = new Color(230, 230, 230);
    Color selection = new Color(65, 90, 125);

    UIManager.put("Panel.background", background);

    UIManager.put("Label.foreground", foreground);

    UIManager.put("Button.background", surface);
    UIManager.put("Button.foreground", foreground);

    UIManager.put("TextField.background", surface);
    UIManager.put("TextField.foreground", foreground);
    UIManager.put("TextField.caretForeground", foreground);
    UIManager.put("TextField.selectionBackground", selection);
    UIManager.put("TextField.selectionForeground", Color.WHITE);

    UIManager.put("TextArea.background", surface);
    UIManager.put("TextArea.foreground", foreground);
    UIManager.put("TextArea.caretForeground", foreground);
    UIManager.put("TextArea.selectionBackground", selection);
    UIManager.put("TextArea.selectionForeground", Color.WHITE);

    UIManager.put("MenuBar.background", surface);
    UIManager.put("Menu.background", surface);
    UIManager.put("Menu.foreground", foreground);
    UIManager.put("MenuItem.background", surface);
    UIManager.put("MenuItem.foreground", foreground);

    UIManager.put("ScrollPane.background", background);
    UIManager.put("Viewport.background", background);

    UIManager.put("OptionPane.background", background);
    UIManager.put("OptionPane.messageForeground", foreground);
  }

  static void main() {
    System.setProperty("flatlaf.useWindowDecorations", "false");
    FlatDarkLaf.setup();
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    applyDarkTheme();

    JFrame frame = new JFrame("Chess");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GridLayout boardLayout = new GridLayout(8, 8);
    JPanel board = new JPanel(boardLayout);

    Color lightBlock = new Color(240, 217, 181);
    Color darkBlock = new Color(181, 136, 99);
    Color backgroundColor = new Color(30, 30, 30);

    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        JPanel block = new JPanel();
        block.setBackground((row + col) % 2 == 1 ? darkBlock : lightBlock);
        board.add(block);
      }
    }

    JPanel container = new JPanel(null) {
      @Override
      public void doLayout() {
        int available = Math.min(getWidth(), getHeight());
        int size = ((available * 7 / 8) / 8) * 8;
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;
        board.setBounds(x, y, size, size);
      }
    };

    container.setBackground(backgroundColor);
    container.add(board);

    frame.setContentPane(container);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setVisible(true);
  }
}
