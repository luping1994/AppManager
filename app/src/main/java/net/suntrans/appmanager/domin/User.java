package net.suntrans.appmanager.domin;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Looney on 2018/1/31.
 * Des:
 */

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    public int id;
}
