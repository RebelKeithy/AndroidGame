package com.example.graphicstest.render;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class SpriteTile
{
    Bitmap sprite;
    
    public SpriteTile(String filename)
    {
        sprite = BitmapFactory.decodeFile("res\\drawable-mdpi\\" + filename);
        if(sprite == null)
            System.out.println("Error loading sprite " + filename);
        else
            System.out.println("Sprite " + filename + " loaded succesfully");
    }

    public SpriteTile(Resources res, int id, String name)
    {
        sprite = BitmapFactory.decodeResource(res, id);
        if(sprite == null)
            System.out.println("Error loading sprite " + name);
        else
            System.out.println("Sprite " + name + " loaded succesfully");
    }

    public void draw(Canvas canvas, int x, int y)
    {
        Paint p = new Paint();
        canvas.drawBitmap(sprite, x, y, p);
    }

}
