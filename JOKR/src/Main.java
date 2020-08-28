import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> jokes = fillList();
        int i = -1;
        String input = "";

        do {
            input = scan.nextLine();
            if (input.equals("")) {
                i = (int)Math.round( Math.random() * (jokes.size() -1));
                System.out.println(jokes.get(i));
            }
        } while (true);



    }

    static ArrayList<String> fillList() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("jokes");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String tmp;
        while ((tmp = br.readLine()) != null) {
            list.add(tmp);
        }
        return list;
    }
}