package com.roskildefrieboernehave.webapp.services;

import org.json.JSONObject;

public interface IService<T> {

    T[] getAll();
    T get(int ID);
    T edit(int ID, JSONObject o);
    T create(JSONObject o);
    boolean delete(int ID);

}