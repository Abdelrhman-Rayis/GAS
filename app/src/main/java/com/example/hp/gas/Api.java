package com.example.hp.gas;

/**
 * Created by hp on 9/12/2018.
 */
public class Api {

    private static final String ROOT_URL = "https://nilegas.000webhostapp.com/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";

}