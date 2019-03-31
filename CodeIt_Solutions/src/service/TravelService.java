package service;

import model.Airplane;
import model.SmartForTwo;
import model.Terminal;
import model.people.*;

public class TravelService {

    private Terminal terminal = new Terminal();
    private SmartForTwo smartForTwo = new SmartForTwo();
    private Airplane airplane = new Airplane();

    public TravelService() {
        terminal.addPerson(new Boss("Chefe"));
        terminal.addPerson(new Comissioner("1º Comissária"));
        terminal.addPerson(new Comissioner("2ª Comissária"));
        terminal.addPerson(new Pilot("Piloto"));
        terminal.addPerson(new Official("1º Oficial"));
        terminal.addPerson(new Official("2º Oficial"));
        terminal.addPerson(new Police("Policial"));
        terminal.addPerson(new Prisioner("Prisioneiro"));
    }

    public void beginTransportation() {
        // Boss and 1º Comissioner inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));
        smartForTwo.addPerson(terminal.removePerson(0));

        // 1º Comissioner inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(1));

        // 2º Comissioner inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));

        // 2º Comissioner inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(1));

        // Boss returned to Terminal
        terminal.addPerson(smartForTwo.removePerson(0));

        // Pilot and 1º Official inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));
        smartForTwo.addPerson(terminal.removePerson(0));

        // 1º Official inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(1));

        // 2º Official inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));

        // 2º Official inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(1));

        // Boss inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(2));

        // Boss inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(1));

        // Pilot returned to Terminal
        terminal.addPerson(smartForTwo.removePerson(0));

        // Police and Prisioner inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));
        smartForTwo.addPerson(terminal.removePerson(0));

        // Police and Prisioner inside Airplane
        airplane.addPerson(smartForTwo.removePerson(0));
        airplane.addPerson(smartForTwo.removePerson(0));

        // Boss inside the SmartFortwo
        smartForTwo.addPerson(airplane.removePerson(4));

        // Pilot inside the SmartFortwo
        smartForTwo.addPerson(terminal.removePerson(0));

        // Boss and Pilot inside the Airplane
        // Boss and Pilot inside the Airplane
        airplane.addPerson(smartForTwo.removePerson(0));
        airplane.addPerson(smartForTwo.removePerson(0));
    }
}
