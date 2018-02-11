package Exercism.SpaceAge;

class SpaceAge {
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.getSeconds()/31557600;
    }

    double onMercury() {
        return (this.getSeconds()/(31557600*0.2408467));
    }

    double onVenus() {
        return (this.getSeconds()/(31557600*0.61519726));
    }

    double onMars() {
        return (this.getSeconds()/(31557600*1.8808158));
    }

    double onJupiter() {
        return (this.getSeconds()/(31557600*11.862615));
    }

    double onSaturn() {
        return (this.getSeconds()/(31557600*29.447498));
    }

    double onUranus() {
        return (this.getSeconds()/(31557600*84.016846));
    }

    double onNeptune() {
        return (this.getSeconds()/(31557600*164.79132));
    }

}
