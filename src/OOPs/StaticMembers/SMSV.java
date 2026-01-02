package OOPs.StaticMembers;

import javax.sound.midi.Soundbank;

class IDGenerator{
    static int nextID=1;

    public static int generateID(){

        return nextID++;
    }
}


public class SMSV {
    public static void main(String[] args) {
        System.out.println(IDGenerator.generateID());
        System.out.println(IDGenerator.generateID());
        System.out.println(IDGenerator.generateID());
    }
}
