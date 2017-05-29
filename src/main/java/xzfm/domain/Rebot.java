package xzfm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wangxizhong on 17/5/29.
 */
@Entity
@Table(name = "rebot")
public class Rebot {
    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String address;

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

    public Rebot() {
    }

    public Rebot(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
