/**
 * Created by WTG on 18.07.2017.
 */
public class Lecturer extends Employee implements IWebinars {
    public Lecturer(String name, String id, int salary) {
        super(name,id,salary);
    }

    @Override
    public void getVoice() {
        System.out.println("Uczcie sie uczcie: Nauka to do potegi klucz");

    }

    @Override
    public void connectMicrophone() {
        System.out.println("Podłacz mikrofon");
    }

    @Override
    public void startRecording() {
        System.out.println("Rozpocząłem nagrywanie");
    }
}


