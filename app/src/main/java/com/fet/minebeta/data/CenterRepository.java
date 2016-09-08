package com.fet.minebeta.data;

import com.fet.minebeta.ui.Mine;
import com.fet.minebeta.ui.User;

import java.util.ArrayList;

/**
 * Created by FET on 08/09/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class CenterRepository {

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private User currentUser;
    ArrayList<Mine> minesList = new ArrayList<>();
    private static CenterRepository singletonInstance;

    private CenterRepository() {
    }

    public static CenterRepository getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new CenterRepository();
        }
        return singletonInstance;
    }

    public User getCurrentUser() {
        return currentUser;
    }


    public ArrayList<Mine> getListOfLavels() {
        return minesList;
    }
}
