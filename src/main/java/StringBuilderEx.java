public class StringBuilderEx {

    //task technology
    //c,c++,java,sql
    //[c],[c++],[java],[sql]
    public static void main(String[] args) {
        String technology = "c,c++,java,sql";
        //split by comma
        //comma append
        //creating object of Stringbuilder
        StringBuilder sb = new StringBuilder();
        String[] tokens = technology.split(",");
        for (int i=0; i < tokens.length; i++){
            String tech = tokens[i];
            sb.append("[");
            sb.append(tech);
            sb.append("]");
            sb.append(",");
            System.out.println("[" + tech +"]");
        }
        String outputStr = sb.toString();
        System.out.println(outputStr);

        StringBuffer sbuffer = new StringBuffer();
        String[] t= technology.split(",");
        for (int i=0; i < tokens.length; i++){
            String tech = tokens[i];
            sbuffer.append("[");
            sbuffer.append(tech);
            sbuffer.append("]");
            sbuffer.append(",");
            System.out.println("[" + tech + "]");
        }
        String ostr = sb.toString();
        System.out.println(ostr);
    }
}
