package com.randomtikspeed.ultrav.core.enums.server;


public enum ServerMode
{
    DEV("dev"),
    PROD("prod"),
    SETUP("setup");

    String type;

    ServerMode(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return this.type.toLowerCase();
    }
}
