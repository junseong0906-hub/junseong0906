class CPUComponent {
    String name;

    public CPUComponent(String name){ this.name = name; }

    @Override
    public String toString(){
        return "[" + name + "] 가동 준비 완료.";
    }
}

class Register extends CPUComponent{
    int value;

    public Register(String name){
        super(name);
        value = 0;
    }

    public void write(int data){
        value = data;
    }

    @Override
    public String toString(){
        return name + "=" + value;
    }
}

class ControlUnit extends CPUComponent{

    public ControlUnit(){
        super("Control Unit");
    }

    public String[] fetch_and_decode(String instruction){
        return instruction.trim().split("\\s+");
    }
}

class ALU extends CPUComponent{

    public ALU(){
        super("ALU");
    }

    public int execute(String op, int val1, int val2){
        if(op.equals("ADD")){
            System.out.println("[ALU] 연산 수행: " + val1 + " + " + val2);
            return val1 + val2;
        }
        else if(op.equals("SUB")){
            System.out.println("[ALU] 연산 수행: " + val1 + " - " + val2);
            return val1 - val2;
        }
        return 0;
    }
}

class CPU {
    ControlUnit cu;
    ALU alu;
    Register r1;
    Register r2;

    public CPU(){
        cu = new ControlUnit();
        alu = new ALU();
        r1 = new Register("R1");
        r2 = new Register("R2");
    }

    public Register getRegister(String regName){
        if (regName.equals("R1")){ return r1; }
        else if (regName.equals("R2")){ return r2; }

        return null;
    }

    public void runProgram(String[] program){
        for (String instruction : program){
            String[] parts = cu.fetch_and_decode(instruction);

            String op = parts[0];

            System.out.println("--------------------------------------");
            System.out.println("[Control Unit] 명령어 해독: " + instruction);

            if(op.equals("MOV")){
                Register target = getRegister(parts[1]);
                int data = Integer.parseInt(parts[2]);

                target.write(data);
            }
            else if(op.equals("ADD") || op.equals("SUB")){
                Register target = getRegister(parts[1]);
                Register source = getRegister(parts[2]);

                int result = alu.execute(op, target.value, source.value);
                target.write(result);
            }

            System.out.println("[현재 레지스터 상태] R1=" + r1.value
                    + " | R2=" + r2.value);
        }
    }
}

public class Project2 {
    public static void main(String[] args) {
        System.out.println("=== CPU 가상 프로그램 가동 ===");

        CPU myCpu = new CPU();

        System.out.println(new CPUComponent("Control Unit"));
        System.out.println(new CPUComponent("ALU"));
        System.out.println(new Register("R1"));
        System.out.println(new Register("R2"));

        String[] program = {
                "MOV  R1 25",
                "MOV  R2 10",
                "ADD  R1 R2",
                "SUB  R1 R2"
        };

        myCpu.runProgram(program);
        System.out.println("=== 프로그램 가동 종료 ===");
    }
}