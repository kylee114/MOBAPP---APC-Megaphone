package apc.lee.kyle.apc_megaphone.activity;

/**
 * Created by gc on 12/11/2016.
 */

public class Post  {

    private String title, desc;

    public Post() {
    }

    public Post(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
