package com.tntheeast.la;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {
	public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}
