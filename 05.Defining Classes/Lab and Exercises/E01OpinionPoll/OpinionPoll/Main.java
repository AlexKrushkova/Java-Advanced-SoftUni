package E01.OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> opinionPollMap = new TreeMap<>();

        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            String line = reader.readLine();
            String[] tokens = line.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            OpinionPoll opinionPoll = new OpinionPoll();
            if (age > 30) {
                opinionPoll.setName(name);
                opinionPoll.setAge(age);
                opinionPollMap.put(name, age);
            }
        }
        opinionPollMap.entrySet().forEach((subject -> {
            System.out.println(String.format("%s - %d", subject.getKey(), subject.getValue()));
        }));
    }
}