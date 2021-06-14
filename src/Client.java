import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        String rootPath = "/Users/muzhikid/IdeaProjects/FP_Growth/src/";
        FPGrowthAlgorithm fpGrowthAlgorithm = new FPGrowthAlgorithm();
        //fpGrowthAlgorithm.run(2000,"",6);
        fpGrowthAlgorithm.run(2,rootPath+"test_2.txt",1);
    }
}
