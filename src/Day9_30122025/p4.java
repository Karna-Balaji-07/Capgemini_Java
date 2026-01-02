package Day9_30122025;

public  class p4 {

        static int x = 5;      // static variable
        int y = 10;            // non-static variable

        // static block
        static {
            System.out.println("SB-1 Start");
            x = x++ + ++x;
            System.out.println("x = " + x);
            System.out.println("SB-1 End");
        }

        // non-static block
        {
            System.out.println("NSB Start");
            y = y + x++;
            System.out.println("y = " + y);
            System.out.println("x = " + x);
            System.out.println("NSB End");
        }

        // no-arg constructor
        public p4() {
            System.out.println("Constructor Start");
            x = x + y++;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("Constructor End");
        }

        // static method
        public static void process(int x) {
            System.out.println("Static process(int)");
            x = x++ + p4.x;
            System.out.println("param x = " + x);
            System.out.println("static x = " + p4.x);
        }

        // non-static method
        public void process() {
            System.out.println("Non-static process()");
            y = y + x;
            System.out.println("y = " + y);
        }

        // overloaded non-static method
        public void process(int x, int y) {
            System.out.println("process(int,int)");
            this.y = y++ + x;
            System.out.println("y = " + this.y);
        }

        // main method
        public static void main(String[] args) {
            System.out.println("Main Start");
            p4 obj1 = new p4();
            obj1.process();
            process(x);

            p4 obj2 = new p4();
            obj2.process(3, 4);

            System.out.println("Final x = " + x);
            System.out.println("obj1.y = " + obj1.y);
            System.out.println("obj2.y = " + obj2.y);
            System.out.println("Main End");
        }
    }


