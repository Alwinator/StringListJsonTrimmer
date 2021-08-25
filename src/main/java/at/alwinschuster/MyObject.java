package at.alwinschuster;

import java.util.List;

public class MyObject {
    private String something;
    private List<String> myList;

    public MyObject() {
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "something='" + something + '\'' +
                ", myList=" + myList +
                '}';
    }
}
