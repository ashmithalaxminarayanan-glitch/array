public class Day14_factory {
    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification {

        @Override
        public void send(String to, String message) {
            System.out.println("sending Email: "+message +", to "+to);
        }
    }
    class WhatsappNotification implements Notification {

        @Override
        public void send(String to, String message) {
            System.out.println("sending Whatsapp: "+message +", to "+to);
        }
    }

        static Notification getNotification(Day14_factory factory, String type) {
            return switch (type) {
                case "Email" -> factory.new EmailNotification();
                case "Whatsapp" -> factory.new WhatsappNotification();
                default-> throw new IllegalArgumentException("Invalid Notification type: "+type);
            };
        }
        static void main() {
        Day14_factory factory = new Day14_factory();

        String type = "Whatsapp";
        getNotification(factory,type).send("9123548946","Hello World");
        }
    }