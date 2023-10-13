package com.tests.pojo;

import java.time.LocalDateTime;

public class User {
    private int actorId;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = LocalDateTime.parse(lastUpdate);

    }
}
