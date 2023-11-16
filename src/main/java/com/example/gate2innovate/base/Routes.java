package com.example.gate2innovate.base;

public class Routes {
    private static final String version = "/api/v1";
    public static final String authentication = version + "/authentication";


    public static class SubRoutes {
        public final static String login = "/login";
        public final static String registration = "/registration";
        public static final String refreshToken = "/refreshToken";
    }

}
