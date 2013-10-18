package com.example.graphicstest.util;

import android.view.View;

import com.example.graphicstest.GameEngine;
import com.example.graphicstest.Player;

public class Util
{

    public static Coord screenToWorld(View view, Coord coord)
    {
        Player player = GameEngine.instance().getPlayer();
        
        int x_topleft = player.getX() - view.getWidth()/2;
        int y_topleft = player.getY() - view.getHeight()/2;
        
        System.out.println(x_topleft + " " + y_topleft);
        System.out.println(coord.getX() + " " + coord.getY());
        return new Coord(x_topleft + coord.getX(), y_topleft + coord.getY());
    }

}
