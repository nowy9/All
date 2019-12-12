package samouczekProgramisty;

public class Human {
    int wiek;
    int waga;
    int wzrost;
    String imię;
    boolean isMężczyzna;

    public Human(int wiek, int waga, int wzrost, String imię, boolean isMężczyzna) {
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
        this.imię = imię;
        this.isMężczyzna = isMężczyzna;
    }

    public boolean isMężczyzna() {
        return isMężczyzna;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWaga() {
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public String getImię() {
        return imię;
    }
}
