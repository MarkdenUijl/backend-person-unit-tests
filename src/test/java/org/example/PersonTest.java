package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void nameShouldNotBeChangedDuringCreation() {
        // arrange
        String partnerName = "Bert";

        // act
        Person person = new Person(partnerName);

        // assert
        assertEquals(partnerName, person.getName());
    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        // arrange
        String checkName = "John";

        // act
        Person person = new Person();

        // assert
        assertEquals(checkName, person.getName());
    }

    @Test
    void ageShouldAddOneYear() {
        // arrange
        int age = 30;
        Person person = new Person();

        // act
        person.setAge(age);
        person.age();

        // assert
        assertEquals(age + 1, person.getAge());
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowerCaseGiven() {
        // arrange
        Person person = new Person();
        String lowerCaseLastName = "pieters";

        // act
        person.setLastName(lowerCaseLastName);

        // assert
        assertEquals("Pieters", person.getLastName());
    }

    @Test
    void givenAPartnerHasPartnerShouldReturnTrue() {
        // arrange
        Person person = new Person();
        Person partner = new Person("Bert");

        // act
        person.setPartner(partner);

        // assert
        assertTrue(person.hasPartner());
    }

    @Test
    void childShouldBeAddedToList() {
        // arrange
        Person person = new Person();
        Person child = new Person("Bertje");

        // act
        person.addChild(child);

        // assert
        assertEquals(1, person.getChildren().size());
    }
}