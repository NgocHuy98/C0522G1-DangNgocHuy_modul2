package ss4_class_and_subject.exercise;

public class MainFan {
        public static void main(String[] args) {
            Fan fan1 = new Fan();
            fan1.setSpeed(fan1.getFAST());
            fan1.setColor("yellow");
            fan1.setRadius(10);
            fan1.setOn(true);
            System.out.println("fan1:\n" + fan1);

            Fan fan2 = new Fan();
            fan2.setSpeed(fan2.getMEDIUM());
            fan2.setColor("blue");
            fan2.setRadius(5);
            fan2.setOn(false);
            System.out.println("fan2:\n" + fan2);

            Fan fan3 = new Fan();
            fan3.setSpeed(fan3.getSLOW());
            fan3.setColor("red");
            fan3.setRadius(15);
            fan3.setOn(true);
            System.out.println("fan3:\n" + fan3);
        }
    }

