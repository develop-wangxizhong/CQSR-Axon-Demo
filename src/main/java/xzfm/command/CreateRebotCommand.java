package xzfm.command;

/**
 * Created by wangxizhong on 17/5/29.
 */
public class CreateRebotCommand {
    private String id;
    private String name;
    private String address;

    public CreateRebotCommand(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
