class Singleton {
    private static instance: Singleton;

    private void constructor() { }

    public static void getInstance(): Singleton {
        if (!Singleton.instance) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    public void mainFunction() {
        console.log("Hello This is Executing");
    }
}

const ins1 = Singleton.getInstance();
        const ins2 = Singleton.getInstance();

        // Outputs: true
        console.log(ins1 === ins2);
        ins1.mainFunction(); // Outputs: Hello This is Executing

