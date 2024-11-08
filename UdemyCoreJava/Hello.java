class Hello {
    public static void main(String[] args) {
//        byte a = 127;
//        int b = 257;
//
//        byte a = (byte)b;
//        char c = 'a';
//        char result = (char)(c + 1);
//        byte b1 = 5;
//        byte b2 = 6;
//        byte b3 = b1 + b2;

        int n = 5;

        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number.");
        }


    }
}