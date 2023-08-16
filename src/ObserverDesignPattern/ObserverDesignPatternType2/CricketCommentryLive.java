package ObserverDesignPattern.ObserverDesignPatternType2;

public class CricketCommentryLive {
    String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info, Publisher publisher) {
        this.info = info;
        publisher.updateObjectStateChange(this.info);
    }
}
