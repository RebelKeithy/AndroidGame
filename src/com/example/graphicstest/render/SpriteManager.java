package com.example.graphicstest.render;

import java.util.HashMap;
import java.util.Map;

import android.content.res.Resources;

public class SpriteManager
{
    private Map<String, SpriteTile> sprites;
    
    private static SpriteManager instance;
    
    private SpriteManager()
    {
        sprites = new HashMap<String, SpriteTile>();
    }
    
    public static SpriteManager instance()
    {
        if(instance == null)
            instance = new SpriteManager();
        
        return instance;
    }
    
    public void loadSprite(String filename, String name)
    {
        sprites.put(name, new SpriteTile(filename));
    }

    public void loadSprite(Resources res, int id, String name)
    {
        sprites.put(name, new SpriteTile(res, id, name));
    }
    
    public SpriteTile getSprite(String name)
    {
        return sprites.get(name);
    }
}
