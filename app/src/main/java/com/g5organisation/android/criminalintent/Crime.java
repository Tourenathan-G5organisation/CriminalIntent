package com.g5organisation.android.criminalintent;

import java.util.UUID;

/**
 * @author Toure
 * @date 19/02/2016
 * Created by Toure on 19/02/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
