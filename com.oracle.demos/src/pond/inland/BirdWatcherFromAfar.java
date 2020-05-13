package pond.inland;

import pond.shore.Bird;

public class BirdWatcherFromAfar extends Bird{
    public void watchBird() {
        Bird bird = new Bird();
        BirdWatcherFromAfar birdWatcherFromAfar = new BirdWatcherFromAfar();
        birdWatcherFromAfar.floatInWater();
        System.out.println(birdWatcherFromAfar.text);

    } }