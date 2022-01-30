package pl.ergohestia.dakt.spacechallenge;

public class U1 extends  Rocket{

    public U1(){
        cost = 100;
        weight = 10;
        maxWeight = 18;

        launchExplosion = 0.0;
        landingCrash =  0.0;
        currentWeight = weight;
    }


    @Override
    public boolean launch() {
        int randomExlposionChance = (int) (Math.random()*100 +1);
        this.launchExplosion = 0.05 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <= randomExlposionChance;
    }

    @Override
        public boolean land() {
        int randomCrashChance = (int)(Math.random()*100 +1);
        this.landingCrash = 0.01 * (this.currentWeight-this.weight) / (this.maxWeight - this.weight);
        return this.landingCrash <= randomCrashChance;
    }

}
