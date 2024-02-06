public class Rational{
    private int a,b;
    public Rational(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int[] add(Rational args){
        int[] result = new int[2];
        if (b == args.b){
            result[0] = a + args.a;
            result[1] = b;
        }
        else{
            result[0] = (a * args.b) + (args.a * b);
            result[1] = b * args.b;
        }
        return result;
    }
    public int[] mul(Rational args){
        int[] result = new int[2];
        result[0] = a * args.a;
        result[1] = b * args.b;
        return result;
    }
    public int[] sub(Rational args){
        int[] result = new int[2];
        if (b == args.b){
            result[0] = a - args.a;
            result[1] = a;
        }
        else {
            result[0] = (a * args.b) - (args.a * b);
            result[1] = b * args.b;
        }
        return result;
    }
    public int[] div(Rational args){
        int[] result = new int[2];
        result[0] = a * args.b;
        result[1] = b * args.a;
        return result;
    }
    public boolean equals(Rational args){
        if (b == args.b && args.a == a) return true;
        else if ((a * args.b) == (args.a * b) && (b * args.a) == (args.b * a)) return true;
        else return false;
    }
    @Override
    public String toString(){
        return a+"/"+b;
    }
    public int compareTo(Rational args){
        double u1 = (double) a /b;
        double u2 = (double) args.a /args.b;
        if (u1 == u2) return 0;
        else if (u1 < u2) return -1;
        else return 1;
    }
}