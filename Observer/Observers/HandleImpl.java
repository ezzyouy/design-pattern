package Observer.Observers;

import Observer.Observable.Subject;

public class HandleImpl implements Observer{
    private String name;
    private Subject topic;

    public  HandleImpl(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
