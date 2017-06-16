package com.momobites.prash.nepalivarnamaala.Adapters;

/**
 * Created by prash on 6/13/2017.
 */

public class MenuModel {

    /** String resource IDs */
    private int mDefaultTranslationId;
    private int mDevnagariiD;
    private Class mMenuID;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object with no Image Handler
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with English
     */
    public MenuModel(int defaultTranslationId, int devnagariResourceId, Class meduResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mDevnagariiD = devnagariResourceId;
        mMenuID = meduResourceId;
    }

    /**
     * Create a new Word object with Image
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with English
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public MenuModel(int defaultTranslationId, int devnagariResourceId, Class meduResourceId, int imageResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mDevnagariiD = devnagariResourceId;
        mMenuID = meduResourceId;
        mImageResourceId = imageResourceId;
    }

    // Getters Method
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }
    public int getDevnagariId() {
        return mDevnagariiD;
    }
    public Class getmMenuID() {
        return mMenuID;
    }

    // Image specific
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}