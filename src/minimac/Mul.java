package minimac;

public class Mul implements Instruction{
    private int src1;
    private int src2;
    private int dest;

    public Mul(int src1, int src2, int dest){
        this.src1 = src1;
        this.src2 = src2;
        this.dest = dest;
    }
    public void execute(MiniMac mac){
        Integer[] memory = mac.getMemory();
        memory[dest] = memory[src1] * memory[src2];
    }

    public String getCommandView(){
        return "mul " + src1 + " " + src2 + " " + dest;
    }
}