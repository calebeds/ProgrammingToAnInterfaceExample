interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements DisplayModule {
    public void display() {
        System.out.println("Display through Projector");
    }
}

public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String args[]) {
        Computer cm = new Computer();

        DisplayModule dmMonitor = new Monitor();
        DisplayModule dmProjector = new Projector();

        cm.setDisplayModule(dmMonitor);
        cm.display();

        cm.setDisplayModule(dmProjector);
        cm.display();
    }
}