package com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles;


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

import com.momobites.prash.nepalivarnamaala.Adapters.WordAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.WordModel;
import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class b12_animalsFragment extends Fragment {


    public b12_animalsFragment() {
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
        words.add(new WordModel(
                R.string.animals_01,
                R.string.nepali_animals_01,
                R.string.devnagari_animals_01,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_02,
                R.string.nepali_animals_02,
                R.string.devnagari_animals_02,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_03,
                R.string.nepali_animals_03,
                R.string.devnagari_animals_03,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_04,
                R.string.nepali_animals_04,
                R.string.devnagari_animals_04,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_05,
                R.string.nepali_animals_05,
                R.string.devnagari_animals_05,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_06,
                R.string.nepali_animals_06,
                R.string.animals_06,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_07,
                R.string.nepali_animals_07,
                R.string.devnagari_animals_07,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_08,
                R.string.nepali_animals_08,
                R.string.devnagari_animals_08,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_09,
                R.string.nepali_animals_09,
                R.string.animals_09,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_10,
                R.string.nepali_animals_10,
                R.string.devnagari_animals_10,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_11,
                R.string.nepali_animals_11,
                R.string.animals_11,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_12,
                R.string.nepali_animals_12,
                R.string.devnagari_animals_12,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_13,
                R.string.nepali_animals_13,
                R.string.devnagari_animals_13,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_14,
                R.string.nepali_animals_14,
                R.string.devnagari_animals_14,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_15,
                R.string.nepali_animals_15,
                R.string.devnagari_animals_15,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_16,
                R.string.nepali_animals_16,
                R.string.devnagari_animals_16,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_17,
                R.string.nepali_animals_17,
                R.string.devnagari_animals_17,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_18,
                R.string.nepali_animals_18,
                R.string.animals_18,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_19,
                R.string.nepali_animals_19,
                R.string.devnagari_animals_19,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_20,
                R.string.nepali_animals_20,
                R.string.devnagari_animals_20,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_21,
                R.string.nepali_animals_21,
                R.string.animals_21,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_22,
                R.string.nepali_animals_22,
                R.string.devnagari_animals_22,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_23,
                R.string.nepali_animals_23,
                R.string.animals_23,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_24,
                R.string.nepali_animals_24,
                R.string.devnagari_animals_24,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_25,
                R.string.nepali_animals_25,
                R.string.devnagari_animals_25,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_26,
                R.string.nepali_animals_26,
                R.string.animals_26,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_27,
                R.string.nepali_animals_27,
                R.string.devnagari_animals_27,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_28,
                R.string.nepali_animals_28,
                R.string.animals_28,
                R.drawable.color_red,
                R.raw.color_red));
        words.add(new WordModel(
                R.string.animals_29,
                R.string.nepali_animals_29,
                R.string.devnagari_animals_29,
                R.drawable.color_red,
                R.raw.color_red));







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