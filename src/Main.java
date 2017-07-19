/**
 * Created by WTG on 18.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Boss oskar = new Boss("Oskar", "848484848",1200, true);
        oskar.getVoice();
        oskar.screamOnEmployee();
        System.out.println(oskar.isHappy());

        Employee employee = new Employee ();
//        Lecturer irek  = new Lecturer("Irek", "393939393", 800);
//        irek.getVoice();
//
//        Employee michal = new Boss("michał", "121312313",10000);
//
//        Employee marta = new CoBoss("Marta","12121212222", 10000);
//        CoBoss marta1 = new CoBoss("marta1", "3333", 10000);
//
//        Employee[] arrayOfEmployee = {oskar,irek,michal,marta,marta1};
//
//        for (Employee employee: arrayOfEmployee){
//            System.out.println(employee.getName());
//        }

            CoBoss marta = new CoBoss("Marta", "232323", 13,false);
            System.out.println(marta.isHappy());

            Lecturer irek = new Lecturer("irek", "33333", 400);
            irek.connectMicrophone();
            irek.startRecording();

            IWebinars[] personWhoCanToWebinars = {irek};

    }


}
