package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers;


import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.momobites.prash.nepalivarnamaala.Adapters.ConsonantAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.ConsonantModel;
import com.momobites.prash.nepalivarnamaala.Adapters.LetterAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.ConsonantModel;
import com.momobites.prash.nepalivarnamaala.Adapters.MenuModel;
import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari.b30_12Sound_MainFragment;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.b10_Food_MainFragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class b13_consonant_Fragment extends Fragment {


    public b13_consonant_Fragment() {
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
        final ArrayList<ConsonantModel> letters = new ArrayList<>();
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ka,
                R.string.devnagari_letter_ka,
                0,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_kha,
                R.string.devnagari_letter_kha,
                1,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ga,
                R.string.devnagari_letter_ga,
                2,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_gha,
                R.string.devnagari_letter_gha,
                3,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_yna,
                R.string.devnagari_letter_yna,
                4,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));

        letters.add(new ConsonantModel(
                R.string.nepali_letter_ta,
                R.string.devnagari_letter_ta,
                5,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_tha,
                R.string.devnagari_letter_tha,
                6,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_da,
                R.string.devnagari_letter_da,
                7,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_dha,
                R.string.devnagari_letter_dha,
                8,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_na,
                R.string.devnagari_letter_na,
                9,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));

        letters.add(new ConsonantModel(
                R.string.nepali_letter_pa,
                R.string.devnagari_letter_pa,
                10,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_pha,
                R.string.devnagari_letter_pha,
                11,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ba,
                R.string.devnagari_letter_ba,
                12,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_bha,
                R.string.devnagari_letter_bha,
                13,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ma,
                R.string.devnagari_letter_ma,
                14,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));

        letters.add(new ConsonantModel(
                R.string.nepali_letter_ya,
                R.string.devnagari_letter_ya,
                15,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ra,
                R.string.devnagari_letter_ra,
                16,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_la,
                R.string.devnagari_letter_la,
                17,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_wa,
                R.string.devnagari_letter_wa,
                18,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));

        letters.add(new ConsonantModel(
                R.string.nepali_letter_sa,
                R.string.devnagari_letter_sa,
                19,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_khha,
                R.string.devnagari_letter_khha,
                20,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_sha,
                R.string.devnagari_letter_sha,
                21,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_ha,
                R.string.devnagari_letter_ha,
                22,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));

        letters.add(new ConsonantModel(
                R.string.nepali_letter_chyha,
                R.string.devnagari_letter_chyha,
                23,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_tra,
                R.string.devnagari_letter_tra,
                24,
                b30_12Sound_MainFragment.class,
                R.raw.color_purple));
        letters.add(new ConsonantModel(
                R.string.nepali_letter_gyna,
                R.string.devnagari_letter_gyna,
                25,
                b30_12Sound_MainFragment.class,
                R.raw.color_red));



        // Create LetterAdapter
        ConsonantAdapter adapter = new ConsonantAdapter(getActivity(), letters, R.color.category_consonants);
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
                ConsonantModel letter = letters.get(position);

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
