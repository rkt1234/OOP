// Create an interface Playable with a method play(). Implement it in Guitar and Piano classes.

package Exercises;

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        myGuitar.play(); // Output: Playing the guitar.

        Playable myPiano = new Piano();
        myPiano.play(); // Output: Playing the piano.
    }
}
