package BehavioralPattern.ObserverPattern.Observer.Notification;

import BehavioralPattern.ObserverPattern.Observable.Blog;

import java.util.Observable;
import java.util.Observer;

public class BillingNotification implements Observer {

    private static final String NOTIFICATION_MESSAGE =
            "Please keep subscribing <%s> at %s\n\n";

    public BillingNotification(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Blog) {
            if (arg instanceof NotificationType && arg.equals(NotificationType.BILLING_NOTIFICATION)) {
                System.out.printf(NOTIFICATION_MESSAGE,
                        ((Blog) o).getName(),
                        DateProvider.today()
                );
            }
        }
    }
}