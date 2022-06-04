package com.randomtikspeed.ultrav.core.interfaces.core;

public interface IMySQLTable
{
    void createTable();

    void set();

    void update();

    void select();

    void remove();

    void empty();

    void delete();

    void exists();

    boolean checkTableExists();
}
