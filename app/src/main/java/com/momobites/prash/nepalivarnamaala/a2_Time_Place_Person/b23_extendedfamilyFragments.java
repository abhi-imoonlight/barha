package com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.momobites.prash.nepalivarnamaala.Adapters.WordModel;
import com.momobites.prash.nepalivarnamaala.Adapters.WordAdapter;
import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class b23_extendedfamilyFragments extends Fragment {


    public b23_extendedfamilyFragments() {
        // Required empty public constructor
    }


    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;
    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;

    // This listener gets triggered whenever the audio focus changes
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // When transient audio lapse - pause the app
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // When audio returns
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // When the audio is complete
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }
    };

    // Runs when MediaPlayer is through running the audio
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    // Clean Media Player Resource
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        // Create a list of words
        final ArrayList<WordModel> words = new ArrayList<WordModel>();
        words.add(new WordModel(R.string.extended_relative,
                R.string.nepali_extended_relative,
                R.string.devnagari_extended_relative,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_spouse_father,
                R.string.nepali_extended_family_spouse_father,
                R.string.devnagari_extended_family_spouse_father,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_spouse_mother,
                R.string.nepali_extended_family_spouse_mother,
                R.string.devnagari_extended_family_spouse_mother,
                R.drawable.family_mother, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_son_in_law,
                R.string.nepali_extended_family_son_in_law,
                R.string.devnagari_extended_family_son_in_law,
                R.drawable.family_husband, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_daughter_in_law,
                R.string.nepali_extended_family_daughter_in_law,
                R.string.devnagari_extended_family_daughter_in_law,
                R.drawable.family_wife, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_father_younger_brother,
                R.string.nepali_extended_family_father_younger_brother,
                R.string.devnagari_extended_family_father_younger_brother,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_father_younger_brother_wife,
                R.string.nepali_extended_family_father_younger_brother_wife,
                R.string.devnagari_extended_family_father_younger_brother_wife,
                R.drawable.family_wife, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_father_older_brother,
                R.string.nepali_extended_family_father_older_brother,
                R.string.devnagari_extended_family_father_older_brother,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_father_older_brother_wife,
                R.string.nepali_extended_family_father_older_brother_wife,
                R.string.devnagari_extended_family_father_older_brother_wife,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_maternal_uncle,
                R.string.nepali_extended_family_maternal_uncle,
                R.string.devnagari_extended_family_maternal_uncle,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_maternal_aunt,
                R.string.nepali_extended_family_maternal_aunt,
                R.string.devnagari_extended_family_maternal_aunt,
                R.drawable.family_mother, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_maternal_sister_older,
                R.string.nepali_extended_family_maternal_sister_older,
                R.string.devnagari_extended_family_maternal_sister_older,
                R.drawable.family_husband, R.raw.family_father));

        words.add(new WordModel(R.string.extended_family_maternal_sister_older_husband,
                R.string.nepali_extended_family_maternal_sister_older_husband,
                R.string.devnagari_extended_family_maternal_sister_older_husband,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_maternal_sister_younger,
                R.string.nepali_extended_family_maternal_sister_younger,
                R.string.devnagari_extended_family_maternal_sister_younger,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_maternal_sister_younger_husband,
                R.string.nepali_extended_family_maternal_sister_younger_husband,
                R.string.devnagari_extended_family_maternal_sister_younger_husband,
                R.drawable.family_mother, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_wife_older_brother,
                R.string.nepali_extended_family_wife_older_brother,
                R.string.devnagari_extended_family_wife_older_brother,
                R.drawable.family_husband, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_wife_older_brother_wife,
                R.string.nepali_extended_family_wife_older_brother_wife,
                R.string.devnagari_extended_family_wife_older_brother_wife,
                R.drawable.family_wife, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_wife_younger_brother,
                R.string.nepali_extended_family_wife_younger_brother,
                R.string.devnagari_extended_family_wife_younger_brother,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_wife_younger_sister,
                R.string.nepali_extended_family_wife_younger_sister,
                R.string.devnagari_extended_family_wife_younger_sister,
                R.drawable.family_wife, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_husband_younger_brother,
                R.string.nepali_extended_family_husband_younger_brother,
                R.string.devnagari_extended_family_husband_younger_brother,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_husband_younger_brother_wife,
                R.string.nepali_extended_family_husband_younger_brother_wife,
                R.string.devnagari_extended_family_husband_younger_brother_wife,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_husband_younger_sister,
                R.string.nepali_extended_family_husband_younger_sister,
                R.string.devnagari_extended_family_husband_younger_sister,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_family_older_sister_husband,
                R.string.nepali_extended_family_older_sister_husband,
                R.string.devnagari_extended_family_older_sister_husband,
                R.drawable.family_mother, R.raw.family_father));
        words.add(new WordModel(R.string.extended_brother_son,
                R.string.nepali_extended_brother_son,
                R.string.devnagari_extended_brother_son,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_brother_daughter,
                R.string.nepali_extended_brother_daughter,
                R.string.devnagari_extended_brother_daughter,
                R.drawable.family_father, R.raw.family_father));
        words.add(new WordModel(R.string.extended_sister_son,
                R.string.nepali_extended_sister_son,
                R.string.devnagari_extended_sister_son,
                R.drawable.family_mother, R.raw.family_father));
        words.add(new WordModel(R.string.extended_sister_daughter,
                R.string.nepali_extended_sister_daughter,
                R.string.devnagari_extended_sister_daughter,
                R.drawable.family_husband, R.raw.family_father));






        // Create WordAdapter and then link a color to it
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        // Create ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the list use the adapter created above
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();
                // Get the  object at the given position the user clicked on
                WordModel word = words.get(position);
                // Request audio focus
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    mMediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());
                    // Start the audio file
                    mMediaPlayer.start();
                    // Setup a listener on the media player
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

}