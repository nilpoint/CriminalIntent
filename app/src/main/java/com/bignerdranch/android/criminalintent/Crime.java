package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 *
 * Created by john on 2016/10/2 0002.
 */

public class Crime {
  private UUID mId;
  private String mTitle;

  public Crime() {
    mId = UUID.randomUUID();
  }

  public UUID getId() {
    return mId;
  }

  public String getTitle() {
    return mTitle;
  }

  public void setTitle(String title) {
    mTitle = title;
  }
}
