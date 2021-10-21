/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static List getQuotes(String path){
        Gson gson = new Gson();
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("theres an error");
        }
        Type type = new TypeToken<List<Quotes>>(){}.getType();
        List <Quotes> allTheQuates =  gson.fromJson(fileReader, type);
        int randomQuotes = (int)(Math.random() * (allTheQuates.size()));
        System.out.println(allTheQuates.get(randomQuotes).toString());
        return allTheQuates;
    }



    public static void main(String[] args) {
        String path = "./app/src/main/resources/recentquotes.json";
        getQuotes(path);
    }
}
