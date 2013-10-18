package com.example.graphicstest;

import android.content.res.Resources;

import com.example.graphicstest.render.SpriteManager;
import com.example.graphicstest.world.World;
import com.example.graphicstest.world.generators.WorldGeneratorBox;

public class GameEngine
{
    private static GameEngine instance;
    
    private World world;
    private Player player;
    
    private GameEngine()
    {
        world = new World(255, new WorldGeneratorBox());
        world.getTile(0, 0, 0);
        player = new Player();
    }
    
    public void loadSprites(Resources res)
    {
        SpriteManager.instance().loadSprite(res, R.drawable.player, "player");
        SpriteManager.instance().loadSprite(res, R.drawable.dirt, "dirt");
        SpriteManager.instance().loadSprite(res, R.drawable.wall, "wall");
    }
    
    public static GameEngine instance()
    {
        if(instance == null)
            instance = new GameEngine();
        
        return instance;
    }
    
    public World getWorld()
    {
        return world;
    }
    
    public Player getPlayer()
    {
        return player;
    }
}
