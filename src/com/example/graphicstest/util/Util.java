package com.example.graphicstest.util;

import android.view.View;

import com.example.graphicstest.render.Camera;
import com.example.graphicstest.render.GameBoard;

public class Util
{

    public static Coord screenToWorld(View view, Coord coord)
    {
        Camera camera = GameBoard.camera;
        
        int x_topleft = camera.getX() - view.getWidth()/2;
        int y_topleft = camera.getY() - view.getHeight()/2;
       
        return new Coord(x_topleft + coord.getX(), y_topleft + coord.getY());
    }

}
