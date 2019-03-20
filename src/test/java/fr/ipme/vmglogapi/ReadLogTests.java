package fr.ipme.vmglogapi;

import fr.ipme.vmglogapi.controller.LogController;
import fr.ipme.vmglogapi.model.Log;
import fr.ipme.vmglogapi.repository.LogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadLogTests {

    @Autowired
    private LogController logController;

    @Autowired
    private LogRepository logRepository;

    //recherche de la chaine voulue
    @Test
    public void regexTest(){
        Matcher m;
        Pattern p = Pattern.compile(".*ssh.*");

        m=p.matcher("lblblblblsshblblblbl");
        assertSame(true,m.find());
    }

    @Test
    public void ajoutList(){
        List<Log> listLog = new ArrayList<>();
        listLog=logController.readLogs("");
        assertEquals(logController.list(),listLog);
    }
}
