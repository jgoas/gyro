package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject;

public class Shop extends RealmObject {

    public static final class Attributes {
        public static final String NAME = "name";
        public static final String OPTIONAL_VALUE = "optionalValue";
        public static final String TYPE = "type";

        private Attributes() {
            // Hide constructor
        }
    }

    private String name;
    private String optionalValue;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOptionalValue() {
        return optionalValue;
    }

    public void setOptionalValue(final String optionalValue) {
        this.optionalValue = optionalValue;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public OptValue getOptionalValueEnum() {
        return OptValue.get(getOptionalValue());
    }

    public void setOptionalValueEnum(final OptValue optionalValue) {
        this.optionalValue = optionalValue.getJsonValue();
    }

    public Type getTypeEnum() {
        return Type.get(getType());
    }

    public void setTypeEnum(final Type type) {
        this.type = type.getJsonValue();
    }
}
