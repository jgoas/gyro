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

    private Short identifier;
    @android.support.annotation.IntRange(from=0,to=255)
    private Integer points;
    private User user;

    @android.support.annotation.NonNull
    public Short getIdentifier() {
        return identifier;
    }

    public void setIdentifier(@android.support.annotation.NonNull final Short identifier) {
        this.identifier = identifier;
    }

    @android.support.annotation.Nullable
    @android.support.annotation.IntRange(from=0,to=255)
    public Integer getPoints() {
        return points;
    }

    public void setPoints(@android.support.annotation.Nullable @android.support.annotation.IntRange(from=0,to=255) final Integer points) {
        this.points = points;
    }

    @android.support.annotation.NonNull
    public User getUser() {
        return user;
    }

    public void setUser(@android.support.annotation.NonNull final User user) {
        this.user = user;
    }
}
