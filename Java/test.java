class test
{
    public static void main (String[] args) {
        System.out.println("Hello world");
        yuh yuh = new yuh();
        System.out.println(yuh.x); 

        for (int i = 0; i < yuh.hello.length; i++) {
            System.out.print(yuh.hello[i]);
        }
    }
}

class yuh
{
    int x = 4;
    char[] hello = {'h','e','l','l','o','\n'};
}