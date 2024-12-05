package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int FRAME_X = 150;
    public static final int FRAME_Y = 280;

    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 500;

    public int frameX = 100;
    public int frameY = 100;


    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();

        frameX = (int)((0.5)*(sw - FRAME_WIDTH));
        frameY = (int)((0.5)*(sh - FRAME_HEIGHT));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView,"Center");

        setLocation(frameX, frameY);
//        setLocation((dimension.width-FRAME_WIDTH)/2,(dimension.height - FRAME_HEIGHT)/2);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
//        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();

    }
}
