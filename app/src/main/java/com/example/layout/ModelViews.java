package com.example.layout;

public enum  ModelViews {
    LOGIN(R.string.login_page,R.layout.login),
    SIGNUP(R.string.signup_page,R.layout.signup);
    private int mTitleResId;
    private int mLayoutResId;

    ModelViews(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }


}
