package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    //private Button button;


    public MainActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        //setButton(root);

        return root;
    }

    /* STEP 2: Create an Android Library
    public void launchJokeActivity(View view) {
        Intent intent = new Intent(view.getContext(), JokeActivity.class);
        JavaJokes jokeSource = new JavaJokes();
        String joke = jokeSource.fetchJoke();
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);

    }

    private void setButton(View view) {

        button = view.findViewById(R.id.joke_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchJokeActivity(view);
            }
        });
    }*/

}
