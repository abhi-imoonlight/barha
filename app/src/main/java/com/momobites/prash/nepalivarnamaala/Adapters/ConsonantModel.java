package com.momobites.prash.nepalivarnamaala.Adapters;

import android.app.Fragment;

/**
 * Created by prash on 6/14/2017.
 */

public class ConsonantModel {

        /** String resource IDs */
        private int mNepaliTranslationId;
        private int mAudioResourceId;
        private int mDevnagariiD;
        private int mBarhakhari;
        private Class mClass;

        /** Image resource ID for the word */
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private static final int NO_IMAGE_PROVIDED = -1;

        /**
         * Create a new Letter object with no Image Handler
         * @param devnagariResourceId is the string resource ID for the word in Devnagari Script that the
         *                             user is already familiar with English
         * @param nepaliTranslationId is the string resource Id for the word in the Nepali language
         * @param audioResourceId is the resource ID for the audio file associated with this word
         */
        public ConsonantModel(int nepaliTranslationId, int devnagariResourceId, int BarhakhariResourceId, Class mClassResourceId , int audioResourceId) {

            mNepaliTranslationId = nepaliTranslationId;
            mDevnagariiD = devnagariResourceId;
            mAudioResourceId = audioResourceId;
            mBarhakhari = BarhakhariResourceId;
            mClass = mClassResourceId;
        }

        /**
         * Create a new Letter object with Image
         * @param devnagariResourceId is the string resource ID for the word in Devnagari Script that the
         *                             user is already familiar with English
         * @param nepaliTranslationId is the string resource Id for the word in the Nepali language
         * @param imageResourceId is the drawable resource ID for the image associated with the word
         * @param audioResourceId is the resource ID for the audio file associated with this word
         */
        public ConsonantModel(int nepaliTranslationId, int devnagariResourceId, int BarhakhariResourceId, Class mClassResourceId, int imageResourceId,
                           int audioResourceId) {

            mNepaliTranslationId = nepaliTranslationId;
            mDevnagariiD = devnagariResourceId;
            mImageResourceId = imageResourceId;
            mBarhakhari = BarhakhariResourceId;
            mClass = mClassResourceId;
            mAudioResourceId = audioResourceId;
        }

        // Getters Method
        public int getNepaliTranslationId() {
            return mNepaliTranslationId;
        }
        public int getDevnagariId() {
            return mDevnagariiD;
        }
        public int getAudioResourceId() {
            return mAudioResourceId;
        }
        public int getmBarhakhari() {
        return mBarhakhari;
    }
        public Class getmClassResourceId() {
        return mClass;
    }



        // Image specific
        public int getImageResourceId() {
            return mImageResourceId;
        }
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

}
