public class codigoJava_reto15{
    public interface Conectable {
        void turnOn();
        void turnOff();
        boolean isOn();
    }

    public class CoffeeMaker {
        private boolean off = true;
        public void on(){}
        public void off() {}
        public boolean isOff() {return off;}
    }
    
    public class CoffeeMakerAdap implements Conectable{
        private CoffeeMaker coffeeMaker = new CoffeeMaker();
       
        public boolean isOn() {
            return ! coffeeMaker.isOff();
        }
       
        public void turnOn() {
            coffeeMaker.on();
        }
       
        public void turnOff() {
            coffeeMaker.off();
        }
       
    }

    public class Lamp implements Conectable {}
    public class Computer implements Conectable{}

    public class TurnOnDevices {

        public static void main(String[] args) {
            turnOnDevice(new Lamp());
            turnOnDevice(new Computer());
            turnOnDevice(new CoffeeMakerAdap());
        }
       
        private static void turnOnDevice(Conectable device) {
        device.turnOn();
        System.out.println(device.isOn());
        }
       }
}

