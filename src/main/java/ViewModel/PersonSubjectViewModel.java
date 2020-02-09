package ViewModel;

import Models.Person;
import Models.Subject;

public class PersonSubjectViewModel {
    private Person person;
    private Subject subject;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
