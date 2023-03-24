package Observer;

import Observer.Observable.ObservableImpl;
import Observer.Observers.HandleImpl;
import Observer.Observers.Observer;

public class main {

    public static void main(String[] args) {
        //create subject
        ObservableImpl topic = new ObservableImpl();

        //create observers
        Observer obj1 = new HandleImpl("Obj1");
        Observer obj2 = new HandleImpl("Obj2");
        Observer obj3 = new HandleImpl("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
