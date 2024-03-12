public class hobbits{
    String name;
    public static void main(String[] args){
        hobbits [] h = new hobbits[3];
        int z = -1;
        while (z < 2){
            z = z +1;
            h[z] = new hobbits();
            h[z].name = "bilbo";
            if (z==1){
                h[z].name = "frodo";
            }
            if (z==2){
                h[z].name = "sam";
            }
            System.out.println(h[z].name + " is a " );
            System.out.println("good Hobbit name");

        }
    }
}