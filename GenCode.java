package ardPack;

public class GenCode {

    public String generateCode(Component comp) {
        StringBuilder sb = new StringBuilder();

        String libs = comp.getRequiredLibraries();
        if (libs != null && !(libs.isEmpty())) {
            sb.append(libs).append("\n");
        }

        sb.append(comp.generateDeclaration()).append("\n\n");

        // void setup code
        sb.append("void setup() {\n");
        sb.append("  ").append(comp.generateSetupCode()).append("\n");
        sb.append("}\n\n");

        // void loop code
        sb.append("void loop() {\n");
        for(String line: comp.generateLoopCode().split("\n")){
            sb.append("  ").append(line).append("\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
