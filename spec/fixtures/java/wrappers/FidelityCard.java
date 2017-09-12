package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject;

public class FidelityCard extends RealmObject {

    public static final class Attributes {
        public static final String IDENTIFIER = "identifier";
        public static final String POINTS = "points";

        private Attributes() {
            // Hide constructor
        }
    }

    public static final class Relationships {
        public static final String USER = "user";

        private Relationships() {
            // Hide constructor
        }
    }

    private short identifier;
    private Integer points;
    private User user;

    public short getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final short identifier) {
        this.identifier = identifier;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(final Integer points) {
        this.points = points;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }
}
