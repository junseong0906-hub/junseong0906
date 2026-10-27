public class CmdLineArgs {
    public static void main(String[] args) {
        for (int i= 0; i< args.length; i++) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}

// javac CmdLineArgs.java
// java CmdLineArgs Hello World 123
// 위 두 명령어 터미널에서 실행해야함