package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari;

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

import com.momobites.prash.nepalivarnamaala.Adapters.LetterAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.LetterModel;
import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/16/2017.
 */

public class c6 extends Fragment {


    public c6() {
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

        // Create a list of letters
        final ArrayList<LetterModel> letters = new ArrayList<>();
        letters.add(new LetterModel(
                R.string.letter_dkha_01,
                R.string.letter_kha_01,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_02,
                R.string.letter_kha_02,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_03,
                R.string.letter_kha_03,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_04,
                R.string.letter_kha_04,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_05,
                R.string.letter_kha_05,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_06,
                R.string.letter_kha_06,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_07,
                R.string.letter_kha_07,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_08,
                R.string.letter_kha_08,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_09,
                R.string.letter_kha_09,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_10,
                R.string.letter_kha_10,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_11,
                R.string.letter_kha_11,
                R.raw.color_red));
        letters.add(new LetterModel(
                R.string.letter_dkha_12,
                R.string.letter_kha_12,
                R.raw.color_red));




        // Create LetterAdapter
        LetterAdapter adapter = new LetterAdapter(getActivity(), letters, R.color.category_barhakhari);
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
                LetterModel letter = letters.get(position);
                // Request audio focus
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    mMediaPlayer = MediaPlayer.create(getActivity(), letter.getAudioResourceId());
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