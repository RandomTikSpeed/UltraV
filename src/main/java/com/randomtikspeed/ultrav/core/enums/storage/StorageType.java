package com.randomtikspeed.ultrav.core.enums.storage;
public enum StorageType {
    MYSQL("mysql"),
    CONFIG("config");


    String type;
    StorageType(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return this.type.toLowerCase();
    }
}
