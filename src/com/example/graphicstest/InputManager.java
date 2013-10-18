package com.example.graphicstest;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.example.graphicstest.util.Coord;
import com.example.graphicstest.util.Util;

public class InputManager implements OnTouchListener
{
    public static InputManager instance;

    public static OnTouchListener instance()
    {
        if(instance == null)
            instance = new InputManager();
        
        return instance;
    }


    @Override
    public boolean onTouch(View view, MotionEvent event)
    {
        if(event.getAction() == MotionEvent.ACTION_UP)
        {
            //System.out.println("test");
            Player player = GameEngine.instance().getPlayer();
            Coord worldEventCoord = Util.screenToWorld(view, new Coord((int)event.getAxisValue(MotionEvent.AXIS_X), (int)event.getAxisValue(MotionEvent.AXIS_Y)));
            player.setX(worldEventCoord.getX());
            player.setY(worldEventCoord.getY());
            System.out.println("Player set to " + player.getX() + " " + player.getY());
        }
        
        return true;
    }
}
