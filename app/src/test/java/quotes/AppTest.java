/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }




    @Test void quotesTest() {
        FileReader fileReader = null;
        String path = "app/src/main/resources/recentquotes.json";
        Gson gson = new Gson();

        try {
            fileReader = new FileReader(path);
            Type type = new TypeToken<List<Quotes>>(){}.getType();
            List <Quotes> allTheQuates =  gson.fromJson(fileReader, type);
            assertEquals("Charles Dickens",allTheQuates.get(1).getAuthor());
            assertEquals("“It was one of those March days when the sun shines hot and the wind blows cold: when it is summer in the light, and winter in the shade.�?",allTheQuates.get(1).getText());
        }catch (FileNotFoundException e){
            e.printStackTrace();
            
        }
    }
}
