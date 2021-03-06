package com.nguyenquyhy.spongediscord.database;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Hy on 1/5/2016.
 */
public class InMemoryStorage implements IStorage {
    private final Map<UUID, String> tokens = new HashMap<>();
    private String defaultToken = null;

    @Override
    public void putToken(UUID player, String token) {
        tokens.put(player, token);
    }

    @Override
    public String getToken(UUID player) {
        if (tokens.containsKey(player))
            return tokens.get(player);
        else
            return null;
    }

    @Override
    public void removeToken(UUID player) {
        tokens.remove(player);
    }

    @Override
    public void putDefaultToken(String token) throws IOException {
        defaultToken = token;
    }

    @Override
    public String getDefaultToken() {
        return defaultToken;
    }

    @Override
    public void removeDefaultToken() throws IOException {
        defaultToken = null;
    }
}
