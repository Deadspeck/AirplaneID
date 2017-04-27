/**
 * Created by compsci on 4/25/17.
 */
public class Flyer {

    public static void main(String[] args) {

        Flyer StartProgram = new Flyer();
        StartProgram.createAirplaneData();

        //might loop "start questions, go again, exit"
        AirplaneQuestions myQuestions = new AirplaneQuestions();

        /*
        with the answers to the above questions
        tell which airplane it might be and for
        now rule out planes it cant be
        */

    }

    private void createAirplaneData() {

        AirplaneData F15 = new AirplaneData();
        F15.setEngineType("Jet");
        F15.setEngineNumber(2);
        F15.setEngineLocation("Body");

        AirplaneData F16 = new AirplaneData();
        F16.setEngineType("Jet");
        F16.setEngineNumber(1);
        F16.setEngineLocation("Body");

        AirplaneData F18 = new AirplaneData();
        F18.setEngineType("Jet");
        F18.setEngineNumber(2);
        F18.setEngineLocation("Body");

        AirplaneData F22 = new AirplaneData();
        F22.setEngineType("Jet");
        F22.setEngineNumber(2);
        F22.setEngineLocation("Body");

        AirplaneData F35 = new AirplaneData();
        F35.setEngineType("Jet");
        F35.setEngineNumber(1);
        F35.setEngineLocation("Body");

        AirplaneData A10 = new AirplaneData();
        A10.setEngineType("Jet");
        A10.setEngineNumber(2);
        A10.setEngineLocation("Rear");
        /*
        System.out.println("F16 has " + F16.getEngineNumber() + " engines");
        System.out.println("F18 has " + F18.getEngineNumber() + " engines");
        System.out.println("F22 has " + F22.getEngineNumber() + " engines");
        System.out.println("F35 has " + F35.getEngineNumber() + " engines");
        */
    }

}
