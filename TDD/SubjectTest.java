// SubjectTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectTest {
    private Subject subject;
    private Observer observer1;
    private Observer observer2;

    @BeforeEach
    void setUp() {
        subject = new Subject();
        observer1 = Mockito.mock(Observer.class);
        observer2 = Mockito.mock(Observer.class);
    }

    @Test
    void testObserverRegistration() {
        subject.addObserver(observer1);
        subject.setState("New State");

        verify(observer1).update("New State");
    }

    @Test
    void testMultipleObserversNotification() {
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setState("Another State");

        verify(observer1).update("Another State");
        verify(observer2).update("Another State");
    }

    @Test
    void testStateChange() {
        subject.addObserver(observer1);
        subject.setState("Final State");

        // Check that the state is correctly set in the subject
        assertEquals("Final State", subject.getState());
        // Verify that observer was notified with the new state
        verify(observer1).update("Final State");
    }
}