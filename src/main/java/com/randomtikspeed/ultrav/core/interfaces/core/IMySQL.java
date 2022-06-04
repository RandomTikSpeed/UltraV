package com.randomtikspeed.ultrav.core.interfaces.core;

import java.sql.Connection;

public interface IMySQL
{
    boolean isConnected();

    void connect();

    void disconnect();

    Connection getConnection();
}

