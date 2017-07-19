

public class Person {
    private String kolor;
    private String wiek;
    private String wzrok;
    private String nazwisko;

    public Person(String kolor, String wiek, String wzrok, String nazwisko) {
        this.kolor = kolor;
        this.wiek = wiek;
        this.wzrok = wzrok;
        this.nazwisko = nazwisko;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }

    public String getWzrok() {
        return wzrok;
    }

    public void setWzrok(String wzrok) {
        this.wzrok = wzrok;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}



