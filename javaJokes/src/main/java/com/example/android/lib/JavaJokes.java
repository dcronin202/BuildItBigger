package com.example.android.lib;


import java.util.Random;

public class JavaJokes {

    private String[] jokes = {
            "How do you find Will Smith in the snow? Follow the fresh prints.",
            "I used to date a girl with a lazy eye. Turns out she was seeing someone else the whole time.",
            "I saw this ad in a window that said: “Television for sale, $1, volume stuck on full.” I thought, “I can’t turn that down.”",
            "What's Forrest Gump's password? 1forrest1",
            "Why do seagulls fly over the sea? Because if they flew over the bay they'd be bagels.",
            "My friend entered a pun contest. He entered ten, figuring at least one of them would win, but no pun in ten did.",
            "What's Harry Potter's favorite method of getting down a hill? Walking... JK, Rolling.",
            "What did the clock do when it was hungry? It went back four seconds.",
            "What did Batman say to Robin before they got in the car? Robin, get in the car.",
            "What was Whitney Houston's favorite type of coordination? HAAAAND EEEEEEEEEYYYYEEE!!!!",
            "Why do scuba divers fall backwards off of the boat? Because if they fell forward, they'd still be on the boat.",
            "What do you call a dog with no legs? Call him whatever you want, he's not coming."
    };

    public String fetchJoke() {
        Random random = new Random();
        int randomNumber = random.nextInt(jokes.length);
        return jokes[randomNumber];
    }

}
