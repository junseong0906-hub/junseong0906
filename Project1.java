import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 히스토리, 리스트 관리 배열 (크기 10 제한)
        String[] historyBuffer = new String[10];
        int historyCount = 0;

        // /list에 들어갈 문장 관리 배열
        String[] listBuffer = new String[100];
        int listCount = 0;

        // 가장 최근에 실행한 명령어를 저장하기 위한 변수
        String lastSnippet = null;

        while(true){
            // 프롬프트
            System.out.print("jshell> ");
            String input = sc.nextLine();

            // history buffer
            if(historyCount >= 10){
                System.out.println("The history buffer is cleared.");
                // 버퍼 전체 초기화
                for(int i = 0; i < historyBuffer.length; i++){
                    historyBuffer[i] = null;
                }
                historyCount = 0;
            }
            historyBuffer[historyCount++] = input;

            // 명령어
            if(input.equals("/exit")){
                System.out.println("Goodbye.");
                break;
            }else if(input.equals("/help")){
                System.out.println("Type a Java language expression, statement, or declaration.");
                System.out.println("Or type one of the following commands:");
                System.out.println("/list: list the source you have typed.");
                System.out.println("/exit: exit the jshell tool");
                System.out.println("/history: history of what you have typed.");
                System.out.println("/!: rerun last snippet.");

            }else if(input.equals("/history")){
                for (int i = 0; i < historyCount; i++){
                    if(historyBuffer[i] != null){
                        System.out.println(historyBuffer[i]);
                    }
                }

            }else if (input.equals("/list")){
                for(int i = 0; i < listCount; i++){
                    System.out.println((i + 1) + " : " + listBuffer[i]);
                }

            }else if (input.equals("/!")){
                if(lastSnippet == null){
                    // exception 방지
                    System.out.println("Re-running ''");
                }else{
                    System.out.println("Re-running '" + lastSnippet + "'.");
                }

            }else if (input.startsWith("/")){
                // 잘못된 '/' 명령어 처리
                System.out.println("Invalid command: " + input);
                System.out.println("Type /help for help.");
                
            }else{
                // 맨 앞에 '/' 가 붙지 않는 명령어
                System.out.println("Running '" + input + "'.");
                listBuffer[listCount++] = input;
                lastSnippet = input;
            }
        }
        sc.close();
    }
}