using System;

namespace helloWorld {
    class helloCSharp {
        public void hello() {
            Console.WriteLine("Hello World");
        }
    }
}

class callHelloWorld {
    public static void Main(string[] args) {
        helloWorld.helloCSharp func = new helloWorld.helloCSharp();
        func.hello();
    }
}