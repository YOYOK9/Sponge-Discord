package com.nguyenquyhy.spongediscord.database;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by Hy on 1/5/2016.
 */
public interface IStorage {
    void putToken(UUID player, String token) throws IOException;
    String getToken(UUID player);
    void removeToken(UUID player) throws IOException;

    void putDefaultToken(String token) throws IOException;
    String getDefaultToken();
    void removeDefaultToken() throws IOException;
}
